package HW3;

import java.util.Random;

public class arrays_HW11 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[][] arr =new int[8][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]= 10 + rand.nextInt(99);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
