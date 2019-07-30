package xpackage;

public class Euler73 {

	public static void main(String[] args){
		
		int output = solution(12000);
		
		System.out.println(output);
	
	}
	
	public static int propFrac(int den) {
		
		int count = 0;
				
		for(int num = den/3; num < den/2; num++ ){
			if (hCD(num, den) == 1) {
				count++;
			}
		}
		
		return count;
	}
	
	public static int hCD (int a, int b) {
		int aux;
		
		if (a < b) {
			aux = a;
			a = b;
			b = aux;
		}
		
		return b == 0 ? a : hCD(b,a%b);

	}
	
	public static int solution(int n) {
		int count = 0;
		
		for(int den=5; den<=n; den++) {
			count += propFrac(den);
		}
		
		return count;
	}
}
