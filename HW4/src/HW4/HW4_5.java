package HW4;

import java.util.Scanner;

public class HW4_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String fromUser = scan.next();
		char buffer = scan.next().charAt(0);
		
		System.out.println(delete(fromUser , buffer));
		
	}
	static char[] delete(String fromUser , char buffer ){
		char[] text = fromUser.toCharArray();  
		for (int i = 0; i < fromUser.length(); i++) {
			if(text[i] == buffer){
			text[i] = ' ';	
			}
		}
		
		return text;
	}

}
