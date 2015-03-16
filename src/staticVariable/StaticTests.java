package staticVariable;
import java.lang.Math;

class StaticSuper{
	static {
		System.out.println("super static block");// run when class StaticSuper is loaded.
	}
	
	StaticSuper() {
		System.out.println("super constructor");// run before subclass's constructor 
	}
}

public class StaticTests extends StaticSuper {
	static int rand;
	
	static { // run when class StaticTests is loaded.
		rand = (int)(Math.random() * 6);
		System.out.println("static block" + rand);
	}
	
	StaticTests() { // run after superclass's constructor
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("in main");// run before constructors.
		StaticTests st = new StaticTests();
	}
}
