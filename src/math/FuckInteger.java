package math;

public class FuckInteger {
	public int getFirstDigit(int n) {
		int div = 1;
		while(n/div >= 10) {
			div *= 10;
		}
		return n/div;
	}
}


