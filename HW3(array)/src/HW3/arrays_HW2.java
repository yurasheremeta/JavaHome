package HW3;


public class arrays_HW2 {
	public static void main(String[] args) {
		   
        int a=0;
        for(int i=1;i<=99;i++){
            if(i%2!=0){
            	a++;
            }
        }
    
        int[] arr = new int[a];
        for(int i=1,b=0;i<=99;i++){
                if(i%2!=0){
                    arr[b]=i;
                    System.out.print(arr[b]+" ");
                    b++;
                }
        }
    
        System.out.println(" ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
		
	}


