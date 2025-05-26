package polymorphism;

class shape {
	public void area() {
		System.out.println("area");
	}

}

class circle extends shape{
	public void area() {
		System.out.println("circle");
		
	}


public static void main(String[] args) {
	shape s = new circle();
	s.area();
}
}
