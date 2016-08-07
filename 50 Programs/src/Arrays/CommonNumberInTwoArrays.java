package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class CommonNumberInTwoArrays {

	public static void main(String[] args){
        Integer[] i1 = {17, 25, 36, 47, 53, 17}; 
        Integer[] i2 = {45, 55, 61, 72, 53, 25}; 
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1)); 
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2)); 
        set1.retainAll(set2); 
        System.out.println("Common Numbers is: " +set1);     
    }
}
