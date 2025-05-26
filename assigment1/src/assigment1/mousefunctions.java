package assigment1;

class MouseFunctions {
	public void clickLeft() {
		System.out.println("Left click");
		
	}
	
	public void clickRight() {
		System.out.println("Right click");
	}
	public void scrollUp() {
		System.out.println("Scroll up");
	}
	
	public void scrollDown() {
		System.out.println("Scroll down");
	}
}


class MouseTraits{
	boolean ambidextrous;
	boolean iswireless;
	boolean isMatte;
	
	
	
	public MouseTraits(boolean ambidextrous, boolean iswireless, boolean isMatte
) {
		this.ambidextrous = ambidextrous;
		this.iswireless = iswireless;
		this .isMatte = isMatte;
	}
	
	public void displayambidextrous() {
		if(ambidextrous) {System.out.println("This mouse is ambidextrous");
	}
		else {System.out .println("----");
	}}
		
		public void  displayiswireless() {
		if(iswireless) {System.out.println("This mouse is wireless");
	}
		else {System.out .println("-------");
		}}
		
		
		
		public void displayisMatte() {
			if(isMatte) {System.out.println("This mouse is Matte");
			}
				else {System.out .println("------");}}}



class mouse1 extends MouseFunctions {
	MouseTraits   traits  ;
	public   mouse1 (boolean ambidextrous) {
		this.traits= new
				MouseTraits(ambidextrous,false,false);
	}
	public void displayTraits() {
		traits.displayambidextrous();
	}
}

class mouse2 extends MouseFunctions{
	MouseTraits traits;
	public mouse2 (boolean iswireless) {
		this.traits= new
				MouseTraits(false,iswireless,false);
		
	}
	public void displayTraits() {
		traits.displayiswireless();
}
}
 class mouse3 extends MouseFunctions{
	MouseTraits  traits;
	public mouse3(boolean isMatte) {
		this.traits = new
				MouseTraits(false,false,isMatte);
		
	}
	public  void displayTraits() {
		traits.displayisMatte();
	}
}
 
 public class  mousefunctions{
	 public static void main(String[]args) {
		 mouse1 mouse1 = new mouse1(true);
		 
		 mouse2 mouse2 = new mouse2 (true);
		 
		 mouse3 mouse3 = new mouse3(true);
		 
		 
		 System.out.println("Test mouse :1");
		 mouse1.clickLeft();
		 mouse1.clickRight();
		 mouse1.displayTraits();
		 mouse1. scrollUp();
		 mouse1. scrollDown();
		 
		 
		 
		 
		 System.out.println("Test mouse :2");
		 mouse2.clickLeft();
		 mouse2.clickRight();
		 mouse2.displayTraits();
		 mouse2. scrollUp();
		 mouse2. scrollDown();
		 
		 
		 
		 
		 
		 
		 System.out.println("Test mouse :3");
		 mouse3.clickLeft();
		 mouse3.clickRight();
		 mouse3.displayTraits();
		 mouse3. scrollUp();
		 mouse3. scrollDown();
		 
	 }
 }


			
	

