package server;

public class ServerMain {
    public static void main(String args[]){
        multiServer();
        //singleServer();
    }
    public static void singleServer(){
        SingleThreadedServer server = new SingleThreadedServer(9000);
        new Thread(server).start();
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();  
        }
        System.out.println("Stopping Server");
        server.stop();
    }
    public static void multiServer(){
        MultiThreadedServer server=new MultiThreadedServer(9000);
        new Thread(server).start();
        try{
            Thread.sleep(20*1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Stopping Server");
        server.stop();
    }
}
