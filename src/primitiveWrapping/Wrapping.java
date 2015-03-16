package primitiveWrapping;
//import java.util.ArrayList;

class Wrap {
	String x = "123";
	String y = "22.22";
	Boolean z = new Boolean("true");
	
	int t = 299;
	Integer iWrap = new Integer(t);
	int unWrapped = iWrap.intValue();// booleanValue(); charValue().
	
	
	int i = Integer.parseInt(x);   // i is an integer.
	Integer j;   // j is a reference with an entry "null".
	double k = Double.parseDouble(y);
	String s = "123" + i;
	
	
	public static void main (String[] args) {
		Wrap t = new Wrap();
		t.go();
	}
	
	public void go() {
	    if(z.booleanValue()){
		j=i;   // An integer can be assigned to an Integer reference.
//		i=j;   // An null Integer reference cannot be assigned to an integer.
		System.out.println(j);
		System.out.println(i);
		System.out.println(k);
		System.out.println(s);
	    }
	}
}
