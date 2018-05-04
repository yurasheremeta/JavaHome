package math;

import java.util.Scanner;

public  class MyMath {
	public final static double pi = 3.141592;
	public final double e = 2.71828;
	public final static int ñ = 299792458;
	
	public static void Circle(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter radius: ");
		int r = scan.nextInt();
		if(r >0){
			System.out.println("Square of Circle = pi*r^2");
			System.out.println("S = "+pi*Math.pow(r,2));
		}else if (r == 0){
			System.out.println("Radius = 0");
		}else{
			System.out.println("Error!");
		}
		
			System.out.println("Sircle length");
		
		if(r>0){
			System.out.println("Sircle Length = 2*pi*r");
			System.out.println("C = "+ 2*pi*r);
		}else if(r==0){
			System.out.println("C = 0");
		}
	}
	
	public static void exp(){
		Scanner scan=  new Scanner(System.in);
		System.out.println(" ");
		System.out.print("Enter x: ");
		int x = scan.nextInt();
		System.out.println("exp("+x+")="+ Math.exp(x));
	}
	public static void Einstein(){
		Scanner scan = new Scanner(System.in);
		System.out.println("E = mc^2");
		System.out.println("Enter m:");
		int m = scan.nextInt();
		
		System.out.println("E = "+ m*Math.pow(ñ,2));
	}

	

}
