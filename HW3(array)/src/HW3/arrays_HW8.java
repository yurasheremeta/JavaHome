package HW3;

import java.util.Random;

public class arrays_HW8 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] arr = new int[12];
		int index = 0;
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt() % 16;
			System.out.print(arr[i]+" ");
			if (arr[i]<min){
			min = arr[i];
			index = i;
			}
			
			
		}
		System.out.println("min "+min);
		System.out.println("index "+index);
	}

}
