package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class PrintElementsInReverseOrderUsingListIterator {

	public static void main(String[] args) {

	    ArrayList<String> aList = new ArrayList<String>();

	    aList.add("1");
	    aList.add("2");
	    aList.add("3");
	    aList.add("4");
	    aList.add("5");

	    ListIterator<String> listIterator = aList.listIterator();

	    System.out.println("Traversing ArrayList in forward direction using ListIterator");
	    while(listIterator.hasNext())
	      System.out.println(listIterator.next());
	     
	    System.out.println("Traversing ArrayList in reverse direction using ListIterator");
	    while(listIterator.hasPrevious())
	      System.out.println(listIterator.previous());
	     
	  }
}
