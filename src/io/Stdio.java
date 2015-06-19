package io;

import java.util.*;
import java.io.*;

public class Stdio {
	
	static int uTree(int n) {
		if (n==0) return 1;
		if (n==1) return 2;
		if (n%2 == 0) 
			return uTree(n-1) + 1;
		else
			return uTree(n-1) * 2;
	}
	
	public static void main(String[] args){
/* test 1: System.in */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		if (t<1 || t>10) throw new IllegalArgumentException("Exceed limits!");
		int[] cycle = new int[t] ;
		int res;
		for (int i=0; i<t; i++) {
			cycle[i] = in.nextInt();
			if (cycle[i]<0 || cycle[i]>60) throw new IllegalArgumentException("Exceed limits!");
		}
		for (int i=0; i<t; i++) {
			res = uTree(cycle[i]);
			System.out.println(res);
		}
		in.close();
/* test 2: String input */
//		String input = "1 2 three 4 five 6 seven 8 nine 10";
//		Scanner strIn = new Scanner(input);
//		while (strIn.hasNext()) {
//			if (strIn.hasNextInt()) {
//				int output = strIn.nextInt();
//				System.out.println(output);
//			} else {
//				String buffer = strIn.next();
//				System.out.println(buffer);
//			}
//		}
//		strIn.close();
/* test 3: File input */
//		FileWriter fout = new FileWriter("test.txt");
//		fout.write("1 2 three 4 five 6 seven 8 nine 10");
//		fout.close();
//		Scanner fileIn = new Scanner(new File("test.txt"));
//		while(fileIn.hasNext()) {
//			if (fileIn.hasNextInt())
//				System.out.println(fileIn.nextInt());
//			else 
//				System.out.println(fileIn.next());
//		}
//		fileIn.close();
		
		
	}
}
