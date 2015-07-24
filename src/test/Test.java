package test;
import java.util.Arrays;


public class Test {
	 
	//instance variable initializer
	String s;
	{s = "abc";}

 
	//constructor
	public Test() {
		System.out.println("constructor called");
	}
 
	//static initializer
	static {
		System.out.println("static initializer called");
	}
 
	//instance initializer
	{
		System.out.println("instance initializer called");
	}
 
	public static void main(String[] args) {
		new Test();
		new Test();
	}
}