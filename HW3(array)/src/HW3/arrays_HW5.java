package HW3;

import java.util.Random;

public class arrays_HW5 {
	public static void main(String[] args) {
		Random rand = new Random();
		double sum1 = 0;
		double sum2 = 0;
		
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(6);
			System.out.print(" "+arr[i]);
			sum1=(double)arr[i]/arr.length;
		
		}
		System.out.println("Середнє "+sum1);
		System.out.println(" ");
		int[] arr2 = new int[5];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = rand.nextInt(5);
			System.out.print(" "+arr2[i]);
			sum2+=(double)arr[i]/arr.length;
		
		}
		System.out.println("Середнє"+ sum2);
		if(sum1>sum2){
			System.out.println("Середнє арифметичне першого масиву більше");
		}else if(sum1<sum2){
			System.out.println("Середнє арифметичне другого масиву більше");
		}else{
			System.out.println("Середнє двої масивів рівні");
		}
	}

}
