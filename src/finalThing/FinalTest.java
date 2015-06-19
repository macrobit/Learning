package finalThing;

class FinalTest {
	final int size;
//	final int x;    // The final instance variable must be initialized.
	static int val;
	final static double PI;
	
	static {  // A static initializer.
		PI = 3.1415926;
	}
	
	FinalTest(){
		val = 42;
		size = 4;
	}
	
	void foo(final int x){
		int a = x;
		System.out.println(a);
		System.out.println(size);
	}
	
	public void doMore() {
		System.out.println(val);
	}
	
//	public static void main(String[] args){
//		System.out.println(PI);
//		FinalTest t = new FinalTest();
//		t.foo(5);
//	}
}

class Test {
	public static void main(String[] args){
		FinalTest t = new FinalTest();
		t.doMore();
		t.foo(5);
		System.out.println(FinalTest.PI);
	}
}
