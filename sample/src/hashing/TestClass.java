package hashing;

import java.util.HashMap;
import java.util.Map;

public class TestClass {
	
	
	public static void main(String[] args) {
		Map<Object,Object> myHashMap= new HashMap<Object,Object>();
		ClassWithHash h1= new ClassWithHash("Hashing");
		ClassWithoutHash h2 = new ClassWithoutHash("NoHashing");
		ClassWithHash h3= new ClassWithHash("Hashing");
		ClassWithoutHash h4 = new ClassWithoutHash("NoHashing");
		myHashMap.put("test", "Testing");
		myHashMap.put(h1, "Used HAshing");
		myHashMap.put(h2, "Not Used HAshing");
		
		
		
		System.out.println(h1.equals(h3));
		System.out.println(h2.equals(h4));		 
		System.out.println(myHashMap.get(h3));
		System.out.println(myHashMap.get(h4));
		System.out.println(myHashMap.get(new ClassWithHash("Hashing")));
		System.out.println(myHashMap.get(new ClassWithoutHash("NoHashing")));
		System.out.println(myHashMap.get("test"));

	}

}
