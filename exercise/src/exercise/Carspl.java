package exercise;

abstract class cars{
	abstract void startengine();
	abstract void carbrand();
}

class Audi extends cars{
	public void startengine() {
		System.out.println("Key is push to start");
		}
	public void carbrand() {
		System.out.println("Audi RS6");
	}
}

class  Subaru extends cars{
	public void  startengine() {
		System.out.println("Key is manual ignition");
	}
	
	public void  carbrand() {
		System.out.println("SubaruWRX");
	}
}

public class Carspl{
	public static void main(String[]args) {
		cars a= new Audi();
		a.startengine();
		a.carbrand();
		System.out.println("");
		
		cars s = new Subaru();
		s.startengine();
		s.carbrand();
	}
}