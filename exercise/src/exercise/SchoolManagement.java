package exercise;

class Person{
	protected String name;
	protected int age;


public Person(String name, int age){
	
	this.name = name;
	this.age = age;
	
}

public void displayinfo() {
	
	System.out.println("Name: " +name);
	System.out.println("Age: "+age);
}
}

class Teacher extends Person{
	private String subject;
	public Teacher(String name,int age, String subject) {
		
		super(name,age);
		this.subject =subject;
		
	}
	
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Subject: "+ subject);
	}
	
}

class Student extends Person{
	private String grade;
	public Student(String name, int age,  String grade) {
		super(name,age);
		this.grade = grade;
		
		
	}
	
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Grade:"+grade);
	}
}

public class SchoolManagement{
	public static void main(String[]args) {
		Teacher t= new Teacher("Joyce", 33,"Maths");
		
		Student s = new Student("Josh", 16,"B");
		
		System.out.println("Teacher details");
		System.out.println("");
		t.displayinfo();
		System.out.println("");
		
		System.out.println("Student details");
		System.out.println("");
		s.displayinfo();
		
	}
}