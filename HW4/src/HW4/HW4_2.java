package HW4;

import java.util.Scanner;

public class HW4_2 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double a = scan.nextDouble();
	double b = scan.nextDouble();
	System.out.println(sum(a,b));
	}
	static double sum (double a , double b){
		Scanner scan = new Scanner (System.in);
		double sum = 0 ;
		 if(a % 1!=0 || b % 1 !=0){
			System.out.println("False");
		}
		else{
			System.out.println(sum =a+b);
		}
		return sum;
	}
	
	

}
