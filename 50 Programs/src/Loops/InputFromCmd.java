package Loops;

import java.util.Scanner;

public class InputFromCmd {

	public static void main (String[] args)
	  {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter your name: ");
	    String username = scanner.next();
	    System.out.print("Enter your age: ");
	    int age = scanner.nextInt();
	    System.out.println(String.format("%s, your age is %d", username, age));

	  }

}
