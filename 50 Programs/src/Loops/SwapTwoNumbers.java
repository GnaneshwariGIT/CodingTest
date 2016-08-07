package Loops;

import java.util.Scanner;

public class SwapTwoNumbers {
	
  public static void swapa(){
	  int a = 10;
	  int b = 20;
	  System.out.println("value of a and b before swapping, a: " + a +" b: " + b);
	  a = a+ b;
	  b = a -b;
	  a = a -b;
	  System.out.println("value of a and b after swapping, a: " + a +" b: " + b);
  }
  public static void swapb(){
      int x, y, temp;
      System.out.println("Enter x and y");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt(); 
      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
      temp = x;
      x = y;
      y = temp;
      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
  }

public static void main(String args[]){

	SwapTwoNumbers.swapa();
	SwapTwoNumbers.swapb();
}	
}


