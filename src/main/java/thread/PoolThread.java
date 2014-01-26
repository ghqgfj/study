package thread;

public class PoolThread extends Thread {
    private BlockingQueue queue = null;
    public PoolThread(BlockingQueue q) {
        this.queue = q;
    }

    public void run() {
        Runnable runnable;
        try {
            runnable = (Runnable) queue.dequeue();
            runnable.run();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
