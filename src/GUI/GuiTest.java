package GUI;
import javax.swing.*;
import java.awt.event.*;

public class GuiTest {
	public void changeIt(JButton button) {
		button.setText("I've been changed");
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("click here");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(500,300); // The first one is length, the second one is width.
		frame.setVisible(true); // Make the frame visible.
	}
	
}
