package CodingTest2;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		str.add("CA");
		str.add("IA");
		str.add("CO");
		str.add("DC");
		str.add("TX");
		str.add("NJ");
		str.add("IA");
		str.add("TX");
		
		System.out.println("Before removing Duplicates "+str);
		HashSet<String> hs = new HashSet<String>();
		hs.addAll(str);
		str.clear();
		str.addAll(hs);
		System.out.println("After removing Duplicates "+str);
		
	}
}
