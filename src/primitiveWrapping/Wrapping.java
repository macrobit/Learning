package primitiveWrapping;
import java.util.ArrayList;

public class Wrapping {
	public static void main(String[] args){
		int x = 32;
		Integer iwrp = new Integer(x);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(iwrp);
		System.out.println(list.get(0));
	}
}
