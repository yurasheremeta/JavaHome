package HW3;

import java.util.Random;

public class arrays_HM9 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr1 = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = 1+rand.nextInt(10);
			System.out.print(arr1[i]+" ");
		}
		System.out.println(" ");
		int[] arr2 = new int[10];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 1 +rand.nextInt(10);
			System.out.print(arr2[i] + " ");
		}
		System.out.println(" ");
		double[] arr3 = new double[10];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = 1+rand.nextDouble();
			System.out.print(arr3[i]+" ");
		
		}
 	}

}
