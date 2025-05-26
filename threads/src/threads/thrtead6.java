package threads;

package Threading;

public class Main implements Runnable{
	
public static int a,b;
public static void main(String[]args) {
	a =100;
	b =100;
	System.out.println("Total before:"+(a +b));
	
	Thread thread1 = new Thread(new Main());
	
	Thread thread2 = new Thread(new Main());
	thread1.start();
	thread2.start();
	
	try {
	thread1.join();
	thread2.join();
	}catch (InterruptedException e) {
		e.printStackTrace();
	}