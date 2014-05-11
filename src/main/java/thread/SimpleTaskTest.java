package thread;

public class SimpleTaskTest extends Task {

	@Override
	public void deal() {
		System.out.println("I am deal with the task");
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadPoolService service = new ThreadPoolService();		
		for (int i = 0; i < 10; i++) {
			service.runTask(new SimpleTaskTest());
		}
		service.start();
		Thread.sleep(30);
		service.stop();
	}
}
