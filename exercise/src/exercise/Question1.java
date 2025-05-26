package exercise;

class animal{
	public void makesound() {
		System.out.println("Sound");
	}
}

class bird extends animal{
	public void makesound()
	{
		System.out.println("Tweet");
	}
}

class dog extends animal{
	public void makesound()
	{
		System.out.println("Bark");
	}
}

public class Question1{
	public static void main(String[]args) {
		dog d = new dog();
		d.makesound();
		
		bird b= new bird();
		b.makesound();
	}
}
