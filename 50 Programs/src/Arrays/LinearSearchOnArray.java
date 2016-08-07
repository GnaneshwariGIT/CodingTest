package Arrays;

import java.util.Scanner;

public class LinearSearchOnArray {

	public static int linerSearch(int[] arr, int key){
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }     
    public static void main(String a[]){
        int[] arr1= {23,45,21,55,234,1,34,90};
        int searchKey;
        System.out.println("Enter searchKey:");
        Scanner in=new Scanner(System.in);
        searchKey=in.nextInt();
        System.out.println("Key "+searchKey+" found at index: "+linerSearch(arr1, searchKey));
        
    }
}
