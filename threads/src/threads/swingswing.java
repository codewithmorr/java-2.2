package threads;

import javax.swing.JButton;
import javax.swing.JFrame;

class gui{
	
	public static void main(String[]args) {
		 JFrame frame = new JFrame("My first GUI");
		 frame .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(300 , 300);
		 JButton button1 = new JButton("Button1");
		 JButton button2 = new JButton("Button2");
		 
		 frame.getContentPane().add(button1);
		 
		 frame.getContentPane().add(button2);
		 
		 frame.setVisible(true);
		 
		 
	}
}

