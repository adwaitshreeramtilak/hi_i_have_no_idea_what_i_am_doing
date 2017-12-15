import java.awt.*;
import javax.swing.*;
public class Drawing extends JPanel{
	int m = 4   ;
	int n = 100 ;
	int r = 300 ;
	double a = (2 * 3.14159265358979323846)/n;
	double x[]= new double[n];
	double y[]= new double[n];
	int cx[] = new int[n];
	int cy[]= new int[n];
	public void paintComponent(Graphics s) {
		 super.paintComponent(s); 
		 this.setBackground(Color.WHITE);
		 for (int i = 0 ; i < n ; i++ ) {
			 int c = i+1;
			 x[i]=((Math.cos(c*a))*r)+350;
			 y[i]=((Math.sin(c*a))*r)+350;
			 }
		 for (int i = 0 ; i < n ; i++ ) {
			 cx[i] = (int) Math.round(x[i]); 
			 cy[i] = (int) Math.round(y[i]); 
		 	 }
		 for (int z = 0 ; z < n ; z++ ) {
			 int c = z+1;
			 int k = (c*m)%n;
			 s.drawLine(cx[z],cy[z],cx[k],cy[k]); 	
			 }
		 }
	 }
