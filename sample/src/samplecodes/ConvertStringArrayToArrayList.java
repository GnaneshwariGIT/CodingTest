package samplecodes;

import java.util.Arrays;
import java.util.List;

public class ConvertStringArrayToArrayList {

	 public static void main(String[] args)  
	   {  
	      String[] states = {"DC", "TX", "OR", "AZ", "CA"};  

	      List<String> wordList = Arrays.asList(states);  

	      for (String e : wordList)  
	      {  
	         System.out.println(e);  
	      }  
	   }
}
