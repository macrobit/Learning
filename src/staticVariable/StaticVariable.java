package staticVariable;

class Duck {
	private int size;
	public static final int LARGESTAGE; // Constant.
	static int duckCount;
	
	static {
		LARGESTAGE = 10;
	}
	public Duck(int s) {
		size = s;
		duckCount++;
	}
	
	public void setSize(int s){
		size = s;
	}
	
	public int getSize(){
		return size;
	}
	
	public int getCount(){
		return duckCount;
	}
	
//	public static void main(String[] args) {
//		System.out.println(Duck.duckCount);		
//		Duck a = new Duck(2);
//		System.out.println(Duck.duckCount);
//		Duck b = new Duck(4);
//		System.out.println(Duck.duckCount);
//		Duck c = new Duck(6);
//		System.out.println(Duck.duckCount);
//		
//		System.out.println(a.getSize());
//		System.out.println(b.getSize());
//		System.out.println(c.getSize());
//
//	}

}

class DuckTest {
	public static void main(String[] args) {
// static variables are initialized before any object of that class
// can be created and any static method of the class runs.
		System.out.println(Duck.duckCount);		
		Duck a = new Duck(2);
		System.out.println(Duck.duckCount);
		Duck b = new Duck(4);
		System.out.println(Duck.duckCount);
		Duck c = new Duck(6);
		System.out.println(Duck.duckCount);
		
		System.out.println(a.getSize());
		System.out.println(b.getSize());
		System.out.println(c.getSize());

	}	
}
