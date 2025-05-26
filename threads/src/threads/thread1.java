package threads;

public class Main implements Runnable{
	public static void main (String[]args) {
		Main obj = new Main();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("This code is outside the thread");
	}
	
	public void run() {
		System.out.println("This code is running in a thread");
	}
}

public class ThradExample extends Thread{
	public void run() {
		for(int i = 1; i <=100;i++) {
			System.out.println("Thread"+i);
		}
	}
}



class MultithreadingDemo extends Thread{
	public void run() {
		try {
			System.out.println("Thread"+Thread,currentThread().getId()+"It is running");
		}
		catch (Exception e ) {
			System.out.println("The exception is caught");
		}
	}
}


public class Multithread{
	public static void main(String[]args) {
		int n= 8;
		
		for (int i = 0 ; i<n; i++) {
			MultithreadingDemo object = new MultithreadingDemo();
			object.start();
		}
	}
}