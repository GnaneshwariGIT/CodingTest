package Collections;

import java.util.ArrayList;

public class SearchForAnElementInAList {

	public static void main(String[] args) {
		
	    ArrayList arrayList = new ArrayList();
	   
	    arrayList.add("1");
	    arrayList.add("2");
	    arrayList.add("3");
	    arrayList.add("4");
	    arrayList.add("5");
	    arrayList.add("1");
	    arrayList.add("2");
	 
	    int index = arrayList.indexOf("4");
	    if(index == -1)
	      System.out.println("ArrayList does not contain 4");
	    else
	      System.out.println("ArrayList contains 4 at index :" + index);
	     
	    
	    int lastIndex = arrayList.lastIndexOf("1");
	    if(lastIndex == -1)
	      System.out.println("ArrayList does not contain 1");
	    else
	      System.out.println("Last occurrence of 1 in ArrayList is at index :"
	                                                              + lastIndex);
	     
}
}
