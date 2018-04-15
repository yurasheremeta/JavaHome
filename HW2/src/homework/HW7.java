package homework;

import java.util.Scanner;

public class HW7 {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter n");
	int start = 1;
	int fromUser = scan.nextInt();
	
	int sum = 1;
	for (int i = start; i<=fromUser ; i++){
		sum = sum*i;
		
	}
	System.out.println(sum);
	

	}

}
