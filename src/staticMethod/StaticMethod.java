package staticMethod;

class Duck {
	private int size;
	
	public Duck(int s){
// A non-static method can use instance variables directly.
		size = s;  
	}
	
//	public static void setSize(int s) {
//		size = s;
//	}
	
	public int getSize(){
		return size;
	}
	
	public static void main(String[] args) {
		Duck d = new Duck(10);
		System.out.println("Size of duck is " + d.getSize());
		
	}

}
