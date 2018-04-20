package HW4;

import java.util.Scanner;

public class HW_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		System.out.println(min(a,b,c));
	}
	
	static double mod(double a){
		if(a<0){
			return -a;
		}else {
			return a;
		}
		
		
	}
	static double min (double a, double b , double c){
		
		double min = mod(a);
		double buffer = a;
		
		if(mod(b) < min){
			min = mod(b);
			buffer = b;
		}else if(mod(c)< min){
			min = mod(c);
			buffer = c;
		}
		return buffer;
//		if(mod(b) < min ){
//			min = mod(b);
//		}else if(mod(c) < min){
//			min = mod (c);
//		}
	
	}

}
