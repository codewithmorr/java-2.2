package practice;


class commonfunctions{
	

void displaycommonfunctions() {
	
	System.out.println("Left click: True");
	System.out.println("Right click : True");
	System.out.println("Scroll up: True");
	System.out.println("Scroll down : True");
}
}


class ambidextrousMouse extends commonfunctions{
	boolean ambidextrous = true;
	
	
	
	void displayTraits() {
		System.out.println(" Mouse1");
		
		displaycommonfunctions();
		System.out.println("ambidextrous:"+ambidextrous);
		System.out.println("");
	}

	
}

class wirelessMouse extends commonfunctions{
	String wireless = "Bluetooth";
	
	void displayTraits() {
		System.out.println(" Mouse2 ");
		
		displaycommonfunctions();
		System.out.println("This mouse is wireless using "+wireless);
		System.out.println("");
	}
	
}

class matteMouse extends commonfunctions{
	boolean matte = true;
	
	
	void displayTraits() {
		System.out.println(" Mouse3 ");
		
		displaycommonfunctions();
		System.out.println("This mouse has a matte texture:"+matte);
	}
}

public class inheritance{
	public static void main  (String[]args) {
		
		ambidextrousMouse mouse1= new ambidextrousMouse();
		wirelessMouse mouse2 = new wirelessMouse();
		matteMouse mouse3 = new matteMouse();
		
		mouse1.displayTraits();
		
		mouse2.displayTraits();
		
		mouse3.displayTraits();
		
		
		
		
		
		
	}
}





