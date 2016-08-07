package samplecodes;

public class TryFinally {

public static void main(String args[]) 
	    { 
	       
	    	System.out.println(TryFinally.proveIt()); 
	    }

	    public static int proveIt()
	    {
	    	try {  
	            	return 1;  
	    	}  
	    	finally {  
	    	    System.out.println("finally block is run before method returns.");
	    	}
	    }
	}


