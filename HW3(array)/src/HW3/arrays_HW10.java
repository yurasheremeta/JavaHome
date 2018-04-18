package HW3;

import java.util.Random;

public class arrays_HW10 {
	public static void main(String[] args) {
		Random rand = new Random();
		int a = 0;
		int a1 = 0;
		int a2 = 0;
		int []arr = new int[11];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt() % 2;
			System.out.print(" "+arr[i]);
			if(arr[i] > 0){
				a++;
			}
			if(arr[i]==0){
				a1++;
			}
			if(arr[i] < 0){
				a2++;
			}
			System.out.print(" ");
			if(i == arr.length-1){
				if(a>a1 && a>a2){
					System.out.println(" Найчастіше - 1");
				}
				if(a1>a && a1>a2){
					System.out.println(" Найчастіше - 0");
				}
				if(a2>a1 && a2> a){
					System.out.println(" Найчастіше - -1");
				}
					
			}
		
			
		}
	}

}
