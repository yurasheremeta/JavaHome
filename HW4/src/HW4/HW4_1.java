package HW4;

import java.util.Scanner;

public class HW4_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ведіть число");
		double a = scan.nextDouble();
		System.out.println(num(a));
		
	}
	static double num(double a){
		Scanner scan = new Scanner (System.in);
		if(a%2==0){
			System.out.println(a+"Парне число");
		}else if(a % 1!=0){
			System.out.println("False");
		}
		else{
			System.out.println(a+" Не парне число");
		}
		return a;
	}
	
}
