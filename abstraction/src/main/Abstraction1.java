package main;







abstract class A {
	abstract void display();
	public void show() {
	
	System.out.println("show method");
}
}
class B  extends A {
	
	void display() {
		System.out.println("above method in A");
		
	}
	
}


public class Abstraction1{
	public static void main(String[]args) {
		B obj = new B();
		obj.display();
		obj.show();
	}
}
