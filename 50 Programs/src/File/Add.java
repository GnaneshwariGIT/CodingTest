package File;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {		
	int a,b,c;
	System.out.println("Enter a & b values:");
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	c=a+b;
	System.out.println("Sum of "+a+" and "+b+" is " +c);
	}

}
