package thread;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import thread.Task.State;

public class TaskQueue {
	private List<Task> queue=new LinkedList<Task>();
	synchronized public void addTask(Task task){
		if(task!=null) queue.add(task);
	}
	synchronized public void removeTask(Task task){
		if(task!=null){
			task.setState(State.DESTROYED);
			queue.remove(task);
		}
	}
	synchronized public Task getTask(){
		Iterator<Task> it = queue.iterator();
		Task task;
		while(it.hasNext()){
			task=it.next();
			if(task.getState().equals(State.NEW)){
				task.setState(State.RUNNING);
				return task;
			}			
		}
		return null;
	}
}
