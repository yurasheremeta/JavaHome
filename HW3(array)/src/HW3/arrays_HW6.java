package HW3;

import java.util.Random;

public class arrays_HW6 {
	public static void main(String[] args) {
		Random rand = new Random ();
		int[] arr = new int[4];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 +rand.nextInt(99);
			System.out.print(arr[i]+" ");
			}
		for (int i = 0; i < arr.length; i++) {
			if(i>0){
				if(arr[i-1]>=arr[i]){
					System.out.println("Не зростаюча");
					break;
				}
			}
			if(i==arr.length){
				System.out.println("Зростаюча");
			}
		}
	}

}
