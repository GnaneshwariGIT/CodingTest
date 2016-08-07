package Loops;

import java.util.Scanner;

public class Factorial {

	public static void main (String[ ] args) {
	    System.out.println("Enter the number for "
	         + "factorial calculations : "); 
	 
	    Scanner scanner = new Scanner(System.in);
	    
	    int a = scanner.nextInt();
	      double fact= 1;
	 
	      System.out.println("Factorial of " +a+ ":");
	      for (int i= 1; i<=a; i++){
	        fact=fact*i;
	      }
	      System.out.println(fact);
	      
	      System.out.println("Enter the number for "
	 	         + "factorial calculations : "); 
	 	 
	 	    Scanner input = new Scanner(System.in);
	       
	    int x = input.nextInt();
	    int result = factusingrecursion(x);
	    System.out.println("Factorial of " +x+ " is :"+result);
	       
	  }
	  static int factusingrecursion(int b){
	   if(b <= 1)
	     return 1;
	   else
	     return b * factusingrecursion(b-1);
	  }
}
