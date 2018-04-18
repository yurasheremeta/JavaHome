package HW3;

import java.util.Random;

public class arrays_HW12 {
	public static void main(String[] args) {
		int[][] arr = new int [5][8];
		Random rand = new Random();
		int max  = arr[0][0];
		int maxI = 0;
		int maxJ = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = rand.nextInt() % 100;
				System.out.print(arr[i][j]+ " ");
				if (arr[i][j]>max){
					max  = arr[i][j];
					maxI = i;
					maxJ = j;
				}
			}
			
			System.out.println(" ");
			
		}
		System.out.println("max is "+max);
	}

}
