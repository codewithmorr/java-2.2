 package exception;

public class Three {
	
	void display() {
	try { 
		int a = 5/0;
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	}
}
	class Except{
		
		public static void main(String[]args) {
		 Three obj = new Three();
			obj.display();
		}
	}


