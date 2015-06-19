package singleton;
/* This Singleton cannot work in multiple threads environment:
 *   If multiple threads call getInstance() simultaneously, more than one thread pass the judgement (singtleton==null),
 *   which result in more than one instance are created.
 */
// version 1.0
//public class Singleton {
//	private static Singleton singleton = null;
//	private int value;
//	private Singleton(){}
//	public static Singleton getInstance() {
//		if (singleton == null) {
//			singleton = new Singleton();
//		}
//		return singleton;
//	}
//	
//	public int getValue(){
//		return value;
//	}
//	
//	public void setValue(int input) {
//		value = input;
//	}
//}

// version 1.1
/* volatile:
 * 1. never be cached thread-locally: all reads and writes will go straight to "main memory".
 * 2. synchronized on itself: any other thread's read will be scheduled behind its initialization. 
 */
public class Singleton {
	private volatile static Singleton singleton = null; // volatile
	private int value;
	private Singleton() {}
	public static Singleton getInstance() {
		if (singleton == null) { // double check
			synchronized(Singleton.class) { // multiple threads
				if (singleton == null) {			  
					singleton = new Singleton();
				/* for singleton's initialization, referring the object to the memory location can be done
				 * 	before the instances' initialization. If a thread insert into these two processes, and 
				 *  return an uninitialized instance, error will come.
				 */
				}
			}
		}
		return singleton;
		
	}
	
	public int getValue(){
	return value;
}

public void setValue(int input) {
	value = input;
}
}
class SingletonTest {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		s1.setValue(3);
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1.getValue());
		System.out.println(s2.getValue());
	}
}