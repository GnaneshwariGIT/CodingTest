package samplecodes;

import java.util.ArrayList;

public class RemoveDuplicatesFromArrayListWithoutUsingCollections {
	public static void main(String[] args){
	    
	    ArrayList<Object> states = new ArrayList<Object>();
	    
	    states.add("CA");
	    states.add("TX");
	    states.add("AZ");
	    states.add("NC");
	    states.add("MI");
	    states.add("NM");
	    states.add("CA");
	    states.add("AZ");
	    states.add("IO");
	    states.add("SC");
	    
	System.out.println("Before Remove Duplicate elements:"+states);
	 for(int i=0;i<states.size();i++){
	 for(int j=i+1;j<states.size();j++){
	            if(states.get(i).equals(states.get(j))){
	            	states.remove(j);
	                j--;
	            }
	    }
	 }
	    System.out.println("After Removing duplicate elements:"+states);
	}
}
