package thread;

public class TaskThread extends Thread {
	private ThreadPoolService tps;

	public TaskThread(ThreadPoolService service) {
		tps = service;
	}

	public void run() {
		while (tps.isRunning()) {
			TaskQueue queue = tps.getTaskQueue();
			Task task = queue.getTask();
			if (task != null) {
				task.deal();
			}
			queue.removeTask(task);
		}
	}
}
