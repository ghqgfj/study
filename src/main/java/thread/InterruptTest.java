package thread;

public class InterruptTest {
	public static void main(String[] args){
		Thread t=new Thread(new Runnable(){

			public void run() {
				try{
					System.out.println("before start");
					Thread.sleep(1*60*1000);
					System.out.println("after the interrupt");
				} catch (InterruptedException e) {
					System.out.println("Catched the exception");
				}
			}
			
		});
		t.start();
		t.interrupt();
	}
}
