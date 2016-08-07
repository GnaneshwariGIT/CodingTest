package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PrintElementsOfListUsingIterator {

	public static void main(String a[]){
        ArrayList<String> listit = new ArrayList<String>();
        listit.add("An ordered collection (also known as a sequence)");
        listit.add("Unlike sets, lists typically allow duplicate elements");
        listit.add("The List interface provides four methods for positional (indexed) access to list elements");
        listit.add("This interface is a member of the Java Collections Framework");
        Iterator<String> itr = listit.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
