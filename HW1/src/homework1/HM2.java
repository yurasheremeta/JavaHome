package homework1;

import java.util.Scanner;

public class HM2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello! Plase enter two numbers");	
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("Okey"+" "+"a = "+a+" "+"b = "+b);
		if (a % 100 > b % 100){
			System.out.println("The number is close to 10 is"+" "+a);
		}else{
			System.out.println("The number is close to 10 is"+" "+b);
		}
//		if (a > b && a < 10){
//			System.out.println("The number is close to 10 is"+" "+a);
//		}else if(a % 100 > b % 100) {
//			System.out.println("The number is close to 10 is"+" "+a);
//		}else if(b > a && b < 10){
//			System.out.println("The number is close to 10 is"+" "+b);
//		}else {
//			System.out.println("The number is close to 10 is"+" "+a);
//		}
	}

}
