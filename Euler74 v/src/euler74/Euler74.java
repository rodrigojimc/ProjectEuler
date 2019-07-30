package euler74;

import java.util.Arrays;

public class Euler74 {

	public static void main (String[] args) {

		String strOut = step("169");
		System.out.println(sort(strOut));
		
	}
	
	public static int factorial(int n) {
		int fact = 1;
		while (n!=0) {
			fact *= n--;
		}
		return fact;
	}
	
	public static String step (String str) {
		int num = 0;
		
		for(int i = 0; i< str.length(); i++)
			num += factorial(Character.getNumericValue(str.charAt(i)));
		
		return Integer.toString(num);
	}
	
	public static String sort (String str) {
		char[] strArr = str.toCharArray();
		Arrays.sort(strArr);
		return new String(strArr);
		
	}
	
}
