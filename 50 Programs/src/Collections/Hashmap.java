package Collections;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1,"California");
		hm.put(2,"Iowa");
		hm.put(3,"Texas");
		hm.put(4,"Nebraska");
		hm.put(5,"Oregon");
		
		String st = hm.get(7);
	    System.out.println(st); 
	    
	    
	    
	}
}
