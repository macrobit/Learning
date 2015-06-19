package GUI;
import javax.swing.*;
import java.awt.event.*;


public class SimpleGui1B implements ActionListener { // SimpleGui1B is an ActionListener.
	JButton button; // declare but not initiate
	JMenuBar menuBar;
	JMenu  menu;
	JMenuItem menuItem;
	JRadioButtonMenuItem rbMenuItem;
	JCheckBoxMenuItem cbMenuItem;
	JRadioButton radio;
	
	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("Click here");
		button.addActionListener(this); // register with the button
		
		menuBar = new JMenuBar();
		menu = new JMenu("I'm menu");
		menuBar.add(menu);
		menuItem = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
		menu.add(menuItem);
		
		radio = new JRadioButton("Radio button");
		
		
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(radio);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) { // Implement the interface
		button.setText("I've been clicked!"); // Provide the event-handling		
	}	
}

class Test {
	public static void main(String[] args) {
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();
	}
}
