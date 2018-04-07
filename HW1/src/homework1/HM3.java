package homework1;

import java.util.Scanner;

public class HM3 {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello! Pleace enter three numbers");
		System.out.println("Enter a:");
		int a = scan.nextInt();
		System.out.println("Enter b:");
		int b = scan.nextInt();
		System.out.println("Enter c:");
		int c = scan.nextInt();
		double x1;
		double x2;
		System.out.println("Your quadratic equation is"+":"+" "+a+"x^2"+"+"+b+"x"+"+"+c+"=0");
		System.out.println("************Solution***********");
		System.out.println("D = b^2 - 4*a*c");
		double D;
		D = (Math.pow(b, 2)-4*a*c);
		System.out.println("D ="+a+"^2"+" "+"-"+" "+"4"+"*"+a+"*"+c);
		System.out.println("D = "+D);
		if (D>0){
			x1 = (-b + Math.sqrt(D)) / (2 * a);
			x2 = (-b - Math.sqrt(D)) / (2 * a);
			System.out.println("*********************");
			System.out.println("x1 = -b + sqrt(D) / (2 * a) ="+x1);
			System.out.println("x2 = -b + sqrt(D) / (2 * a) ="+ x2);
			System.out.println("x1 = "+x1);
			System.out.println("x2 = "+x2);
		}else if(D == 0){
			x1 = -b/(2*a);
			System.out.println("x1 = x2 = -b/(2*a) =  "+x1);
		}else {
			System.out.println("Discriminant < 0");
			System.out.println("Please enter correct equation");
		}
	}
}
