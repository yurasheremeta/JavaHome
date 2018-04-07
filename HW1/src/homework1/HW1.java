package homework1;

import java.util.Scanner;

public class HW1 {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
	
		System.out.println("Please enter the number");
		int n = scan.nextInt();
		System.out.println("Okey, your number is " + n); 
		if(n % 2 == 0){
			System.out.println(n+" is even");
		}else {
			System.out.println(n+" is odd");
		}
	}

}
