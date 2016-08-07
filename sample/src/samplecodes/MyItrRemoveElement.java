package samplecodes;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MyItrRemoveElement {

	public static void main(String a[]){
        
        String removeElem = "Perl";
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        System.out.println("Before remove:");
        System.out.println(myList);
        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
            if(removeElem.equals(itr.next())){
                itr.remove();
            }
        }
        System.out.println("After remove:");
        System.out.println(myList);
    }
}
