package exception;

public class one {
	
	public static void main(String[]args) {
	one sampleobj= new one();
	}
	
	private void method1(){
		method2();
		
	}
	
	
	private void  method2(){
		method3();
		
	}
private void method3() {
	int b=5/0;
}
}
