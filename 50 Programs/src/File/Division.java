package File;

import java.util.Scanner;

public class Division {

	public static void main(String[] args)  {
		int a,b,c;
		System.out.println("Enter a & b values:");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=a/b;
		System.out.println("Division of "+a+" and "+b+" is " +c);
    }
}
