package CodingTest2;

import java.util.ArrayList;

public class ListOfListOfStrings {

	public static void main(String args[]){

		ArrayList<String> str=new ArrayList<String>();
		str.add("CA");
		str.add("IA");
		str.add("CO");
		str.add("DC");
		str.add("TX");

		for(int i=0;i<str.size();i++)
			System.out.println("List of List of Strings is "+str.get(i));
		
		}
}
