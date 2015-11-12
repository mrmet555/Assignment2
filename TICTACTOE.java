import java.awt.Graphics;

import javax.swing.JApplet;


public class TICTACTOE extends JApplet {

	public void paint(Graphics canvas) {
	
		canvas.drawLine(60, 20, 60, 200);
		canvas.drawLine(120, 20, 120, 200);
		canvas.drawLine(10, 70, 170, 70);
		canvas.drawLine(10, 140, 170, 140);
		
		//Xs
		canvas.drawLine(10, 20, 50, 60);
		canvas.drawLine(50, 20, 10, 60);
		canvas.drawLine(130, 20, 170, 60);
		canvas.drawLine(130, 60, 170, 20);
		canvas.drawLine(70, 20, 110, 60);
		canvas.drawLine(70, 60, 110, 20);
		canvas.drawLine(10, 150, 50, 190);
		canvas.drawLine(10, 190, 50, 150);
		
		//Os
		canvas.drawOval(10, 80, 40, 40);
		canvas.drawOval(70, 150, 40, 40);
		canvas.drawOval(70, 80, 40, 40);
		
		//Line
		canvas.drawLine(10, 40, 170, 40);
	}

}
