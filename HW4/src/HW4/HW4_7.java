package HW4;

import java.util.Scanner;

public class HW4_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String day = scan.next();
		System.out.println(week(day));
	}
	static int week(String day){
		
		switch(day){
		case "Monday":
			return 1;
			
		case "Tuesday":
			return 2;
			
		case "Wednesday":
			return 3;
			
		case "Thursday":
			return 4;
		
		case "Friday":
			return 5;
			
		case "Saturday":
			return 6;
			
		case "Sunday":
			return 7;
			
			default:
				System.out.println("Ўось не так");
				
		}
		return 0;
		
			
	}

}
