package Collections;

import java.util.ArrayList;

public class CopyArrayListToArray {

	public static void main(String[] args) {
		
		ArrayList<String>  arrlist = new  ArrayList<String>();
		arrlist.add("CA");
		arrlist.add("NC");
		arrlist.add("NY");
		arrlist.add("MI");
		arrlist.add("AZ");		
		System.out.println("ArrayList is "+arrlist);		
		String arr[]=new String[arrlist.size()];
		 arrlist.toArray(arr);
	        System.out.println("Created Array content:");
	        for(String str:arr){
	            System.out.println(str);
	        }
	}
}
