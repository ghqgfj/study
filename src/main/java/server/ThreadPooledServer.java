package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import thread.ThreadPool;

public class ThreadPooledServer {
    protected int serverPort = 8080;
    protected ServerSocket serverSocket = null;
    protected boolean isStopped = false;
    protected Thread runningThread = null;
    protected ThreadPool pool=new ThreadPool(10,20);
    public ThreadPooledServer(int port) {
        this.serverPort = port;
    }

    public void run() {
        synchronized (this) {
            this.runningThread = Thread.currentThread();
        }
        openServerSocket();
        while (!isStopped) {
            Socket clientSocket = null;
            try {
                clientSocket = this.serverSocket.accept();
            } catch (IOException e) {
                if (isStopped) {
                    System.out.println("Server Stopped");
                }
                throw new RuntimeException("Error accepting client connection", e);
            }
            pool.execute(new WorkerRunnable(clientSocket, "Multithreaded Server"));
        }
    }

    public synchronized void stop() {
        this.isStopped = true;
        try {
            this.serverSocket.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void openServerSocket() {
        try {
            this.serverSocket = new ServerSocket(this.serverPort);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
