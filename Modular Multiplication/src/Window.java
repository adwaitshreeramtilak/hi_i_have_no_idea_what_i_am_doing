import javax.swing.*;
public class Window {
	public static void main(String[] args){
	  JFrame Frame = new JFrame("Modular Multiplication");
	  Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  Drawing d = new Drawing();
	  Frame.add(d);
	  Frame.setSize(1365, 720);
	  Frame.setVisible(true);
	  }
	}
