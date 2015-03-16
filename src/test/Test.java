package test;
import java.util.Arrays;


public class Test {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int[] b = Arrays.copyOfRange(a,0,4);
		System.out.println(Arrays.toString(b));
	}
}
