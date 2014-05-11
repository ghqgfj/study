package thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadPoolService {
	public static final int THREAD_COUNT = 5;
	private Status status = Status.NEW;
	private TaskQueue queue = new TaskQueue();

	public enum Status {
		NEW, RUNNING, TERMINATED,
	}

	public List<Thread> threads = new ArrayList<Thread>();

	public ThreadPoolService() {
		for (int i = 0; i < THREAD_COUNT; i++) {
			threads.add(new TaskThread(this));
		}
	}

	public boolean isRunning() {
		return status == Status.RUNNING;
	}

	public void start() {
		this.status = Status.RUNNING;
		for (int i = 0; i < THREAD_COUNT; i++) {
			threads.get(i).start();
		}
	}

	public void stop() {
		this.status = Status.TERMINATED;
	}

	public void runTask(Task task) {
		queue.addTask(task);
	}

	protected TaskQueue getTaskQueue() {
		return queue;
	}
}
