package CodingTest;

public class Arrays {
	
	 public static void main(String[] args) {

		 
         int sarray[] = {10,20,30}; 
         System.out.println("Single Dimensional Array is ");
		 for (int i=0;i<sarray.length;i++){
                  System.out.println(sarray[i]);
      }   
	
    	  int marray[][] = {{3,5,6},
    			  {5,66,7},
    			  {4,7,2}};
    	  System.out.println("Multi Dimensional Array is ");
    	   for (int i=0;i<marray.length;i++){
    		   for (int j=0;j<marray.length;j++){
    			   System.out.println(marray[i][j]);  
    		   }
    	   }
      }	
	}
