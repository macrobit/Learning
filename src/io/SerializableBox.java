package io;
import java.io.*;
/* Serializable is a marker or tag interface, because the interface 
 * doesn't have any methods to implement.
 */
public class SerializableBox implements Serializable {
	private int width;
	private int height;
	
	public void setWidth(int w) {
		width = w;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public void print() {
		System.out.printf("width \u00d7 height = %d \u00d7 %d\n", width, height);
	}
	
	public static void main(String[] args) {
		SerializableBox myBox = new SerializableBox();
		myBox.setWidth(50);
		myBox.setHeight(20);
		myBox.print();
		try {
			FileOutputStream fs = new FileOutputStream("foo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(myBox);
			os.close();		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
