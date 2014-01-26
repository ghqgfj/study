package thread;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {
    private List<Object> queue=new LinkedList<Object>();
    private int limit=10;
    public BlockingQueue(int size){
        this.limit=size;
    }
    public synchronized void enqueue(Object o) throws InterruptedException{
        while(this.queue.size() == this.limit) {
            wait();
          }
          if(this.queue.size() == 0) {
            notifyAll();
          }
          this.queue.add(o);
    }
    public synchronized Object dequeue() throws InterruptedException{
        while(this.queue.size()==0){
            wait();
        }
        if(this.queue.size()==this.limit){
            notifyAll();
        }
        return this.queue.remove(0);
    }
}
