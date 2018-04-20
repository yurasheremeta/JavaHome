package HW4;

import java.util.Scanner;

public class HW_4_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		System.out.println(pollindrom(a));

	
		
		
	}
	static boolean pollindrom(String a){
		
		for (int i = 0; i < (a.length()/2) ; i++) {
			if(a.charAt(i) != a.charAt(a.length() -1 -i)){
				System.out.println("Не паліндром ");
				return false;
			}
		}
		System.out.println("Паліндром ");
		return true;
		
	}
	

}
