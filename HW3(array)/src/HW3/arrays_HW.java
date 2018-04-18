package HW3;



public class arrays_HW {
	public static void main(String[] args) {
	
		
	     int[] arr = new int[10];
	        int i = 0;
	        int b = 2;
	        while (i < 10) {
	            arr[i] = b;
	            b += 2;
	            i++;
	        }        
	        
	        for (i = 0; i < arr.length; i++){
	        	System.out.print(arr[i] + " ");
	        }
	        
	        System.out.println(" ");
	        for (i = 0; i < 10; i++)
	            System.out.println(arr[i]+" ");
	}

}
