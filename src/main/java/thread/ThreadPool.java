package thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadPool {
    private BlockingQueue taskQueue=null;
    private List<PoolThread>threads=new ArrayList<PoolThread>();
    private boolean isStopped=false;
    public ThreadPool(int minThreads,int maxThreads){
        taskQueue=new BlockingQueue(maxThreads);
        for(int i=0;i<minThreads;i++){
            threads.add(new PoolThread(taskQueue));
        }
        for(Thread thread:threads){
            thread.start();
        }
    }
    public  synchronized void execute(Runnable task){
        if(this.isStopped)throw new IllegalStateException("ThreadPool is sttoped");
        try {
            this.taskQueue.enqueue(task);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @SuppressWarnings("deprecation")
    public synchronized void stop(){
        this.isStopped=true;
        for(PoolThread thread:threads){
            thread.stop();
        }
    }
}
