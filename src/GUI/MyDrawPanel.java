package GUI;
import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {

		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	public void paintComponent(Graphics g) {
//		g.setColor(Color.orange);
//		g.fillRect(20,50,100,100);
//	}

    // paintComponent image.
	public void paintComponent(Graphics g) {
		Image image = new ImageIcon("yankee.jpg").getImage();
		g.drawImage(image,0,0,this);
	}
	
	// paintComponent colors.
	public void paintComponent_color(Graphics g) {
		g.fillRect(0,0,this.getWidth(), this.getHeight());
		
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		
		Color randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillOval(70,70,100,100);
	}
	
}


