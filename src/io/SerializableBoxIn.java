package io;
import java.io.*;

public class SerializableBoxIn implements Serializable {
	
	public static void main(String[] args) {
		try{
			FileInputStream fileStream = new FileInputStream("foo.ser");
			ObjectInputStream os = new ObjectInputStream(fileStream);
			SerializableBox mybox = (SerializableBox)os.readObject();
			mybox.print();
			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
