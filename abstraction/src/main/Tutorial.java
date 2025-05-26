package main;

abstract class Dogs{
	public void bark() {
	System.out.println("bark");
	
}
	public abstract void poop();
}

class chihuahua extends Dogs{
	public void poop() {
		System.out.println("dog poooped");
		
		
	}
}

public class Tutorial {
	public static void main(String [] args) {
		chihuahua c = new chihuahua();
			c.bark();
			c.poop();
	}
}
