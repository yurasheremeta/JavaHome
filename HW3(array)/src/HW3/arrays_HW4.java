package HW3;

import java.util.Random;

public class arrays_HW4 {
	public static void main(String[] args) {
		Random rand = new Random ();
		int a = 0;
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1+ rand.nextInt(10);
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] %2!=0){
				arr[i] =0;
			}
		
			System.out.print(" "+arr[i]);
			
		}
		System.out.println("Заміна пройшла успішно!");
	}

}
