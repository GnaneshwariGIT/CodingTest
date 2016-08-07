package Arrays;

import java.util.Scanner;

public class SwapASortedArray {
     static void swapNumbers(int arr[]){
		for (int i=arr.length-1; i> 0; i--){
	        if (arr[i] <arr[i-1]){
	            int j = i-1;
	            while (j>=0 && arr[i] < arr[j])
	                j--;	           
	            int temp=arr[i];
				arr[i]=arr[j+1];
				arr[j+1]=temp;	           
	            break; 
	        }
	    }
	    for(int j=0;j<arr.length;j++)
	    	System.out.println(arr[j]);	    
}		
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of array");
	int size=s.nextInt();
	int array[]=new int[size];
	System.out.println("enter the elements of sorted array with 2 elements not in the right position");
	
	for(int j=0;j<size;j++){
		array[j]=s.nextInt();
	}
	s.close();
	SwapASortedArray.swapNumbers(array);
	
}
}
