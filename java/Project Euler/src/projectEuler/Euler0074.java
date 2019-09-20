package projectEuler;

import java.util.ArrayList;

//import java.util.Arrays;
//import java.util.HashMap;

public class Euler0074 {

	public static void main (String[] args) {

//		HashMap <String, String> next = new HashMap <String, String>();
//		HashMap <String, String> length = new HashMap <String, String>();

		ArrayList <Integer> list = new ArrayList <Integer>(); 
		int solution = 0;
		
		for(int n=1; n <1000000; n++) {
			while(!list.contains(n)) 
				list.add(n);
				n = step(n);
			
			if (list.size() == 60)
				solution++;
			
			list.clear();
		}
		
		System.out.println(solution);
	}
	
	public static int factorial(int n) {
		int fact = 1;
		
		while (n!=0) 
			fact *= n--;

		return fact;
	}
	
	public static int step (int n) {
		int next = 0;
		
		String str = Integer.toString(n);
		
		for(int i = 0; i< str.length(); i++)
			next += factorial(Character.getNumericValue(str.charAt(i)));
		
		return next;
	}
	
//	public static String sort (String str) {
//		char[] strArr = str.toCharArray();
//		
//		Arrays.sort(strArr);
//		
//		return new String(strArr);
//	}
	
//	public static Set <String> reduce (int n){
//		Set <String> reduced = new HashSet <String>();
//		
//		for(int i=1; i<n; i++) 
//			reduced.add(sort(Integer.toString(i)));
//		
//		return reduced;
//		
//	}
	
}
