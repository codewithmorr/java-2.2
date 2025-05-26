package threads;

class MultiThreadingDemo extends thread5{
	public void run() {
		try {
			System.out.println("Thread" + Thread.currentThread().getId()+"Is running");
}
		catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}	
}
public class Multithread{
	public static void Main (String[]args) {
		int n = 8;
		for(int i =0;i<n;i++) {
			MultiThreadingDemo  object  = new MultiThreadingDemo();
			object.start();
		}
	}
}
