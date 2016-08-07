package File;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sub {
	
	public static void main(String[] args) throws Exception {
		
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    int a,b,c;
	    System.out.println("Enter a & b values:");
	    a = Integer.parseInt(reader.readLine());
	    b = Integer.parseInt(reader.readLine());
	    c=a-b;
	    System.out.println("Subtraction of "+a+" and "+b+" is " +c);
	}    
}
