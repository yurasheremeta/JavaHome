package HW3;


public class arrays_HW7 {
	public static void main(String[] args) {
		
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			if(i<2){
				arr[i] =1;
			}else{
				arr[i] = arr[i-2]+arr[i-1];
			}
			System.out.println(" "+arr[i]);
		}
		
	}

}
