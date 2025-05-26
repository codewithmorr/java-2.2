package threads;



public class thread5 implements Runnable{
	public static void main(String[]args) {
		Main obj = new Main();
		Thread thread = new Thread((Runnable) obj);
		
		thread.start();
		System.out.println("This code isoutside of the thread");
		}
	public void run() {
		System.out.println("This code is running in a thread");
	}
}


		
				
		
		
		
	
