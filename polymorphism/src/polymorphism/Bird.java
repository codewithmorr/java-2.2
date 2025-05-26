package polymorphism;

 class Bird {
	 
	 public void sings() {
		 System.out.println("Tweet");
	 }
	 
 }
class Robin extends Bird{
	public void sing() {
		System.out.println("twindle");
		
	}
}
	
class Pelican extends Bird{
		public void sing() {
			System.out.println("kwaah");
		}
	
	
	public static void main(String[]args) {
		Pelican p =  new Pelican();
		p.sing();
	


 }
	}
