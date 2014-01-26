package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedServer implements Runnable{
    protected int serverPort = 8080;
    protected ServerSocket serverSocket = null;
    protected boolean isStopped = false;
    protected Thread runningThread = null;
    public MultiThreadedServer(int port){
        this.serverPort=port;
    }
    public void run() {
       synchronized(this){
           this.runningThread=Thread.currentThread();
       }
       openServerSocket();
       while(!isStopped){
           Socket clientSocket=null;
           try {
            clientSocket=this.serverSocket.accept();
        } catch (IOException e) {
            if(isStopped){
                System.out.println("Server Stopped");
            }
            throw new RuntimeException("Error accepting client connection",e);
        }
           new Thread(new WorkerRunnable(clientSocket,"Multithreaded Server")).start();
       }
    }
    public synchronized void stop(){
        this.isStopped=true;
        try {
            this.serverSocket.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    private void openServerSocket(){
        try{
            this.serverSocket=new ServerSocket(this.serverPort);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
