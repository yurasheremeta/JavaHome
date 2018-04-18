package HW3;

import java.util.Random;

public class arrays_HW3 {
	public static void main(String[] args) {
		Random rand = new Random();
		  int b=0;
	        int[] arr = new int[15];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=rand.nextInt(10);
	            System.out.print(arr[i] +" ");
	            if(arr[i]>0&arr[i]%2==0){
	            	b++;
	            }
	        }
	        System.out.println(" ");
	        System.out.println("праних "+ b);
	}

}
