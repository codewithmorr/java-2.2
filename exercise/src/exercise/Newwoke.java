package exercise;

class Employee{
	protected String name;
	protected Double salary;
	
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void displayinfo() {
		System.out.println("Empoyee name:" + name);
		System.out.println("Salary: kes "+ salary);
	}
}
class Manager extends Employee{
	private int teamsize;
	
	
	public Manager(String name,double salary, int teamsize) {
		super(name,salary);
		this.teamsize = teamsize;
	}
	
	public void displayinfo() {
	super .displayinfo();
	System.out.println("Teamsize:"  +teamsize);
		
		
		
	
}}

class Developer extends Employee{
	protected String Programminglanguage;
	
	public Developer(String name,double salary,String Programminglanguage) {
		super(name,salary);
		this.Programminglanguage = Programminglanguage;
		
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Programming language:" +Programminglanguage);
	}
}




public class Newwoke{
	public static void main(String[]args) {
		Manager m = new Manager("Alice", 300000, 15);
		Developer d = new Developer("Bob",250000,"python");
		
		
		System.out.println("Manager details");
		m.displayinfo();
		
		System.out.println("");
		
		System.out.println("Developer details");
		d.displayinfo();
		
	
		
	}
}