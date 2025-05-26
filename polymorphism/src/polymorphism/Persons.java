package polymorphism;

 class Persons {
	 
	 public void role() {
		 System .out.println("This is a person");
	 }

}
class customer extends Persons{
	public void role() {
		System.out.println("This is a customer"); 
}
}
class  father extends Persons{
	public void role() {
		System.out.println("This person is a father");
	}
}

class student extends Persons{
	public void role() {
		System.out.println("This is a student");
	}
}

class Teacher extends Persons{
	public void role () {
		System.out.println("This is a  Teacher");
	}
	
	public static void main(String[]args) {
		father f =  new father();
		f.role();
		customer c = new customer();
		c.role();
		Teacher t=  new Teacher();
		t.role();
		student s= new student();
		s.role();
		
}
}