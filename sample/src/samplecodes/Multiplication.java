package samplecodes;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		int a,i;
		System.out.println("Enter a value:");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		System.out.println("Table of " +a+ " is " );
		for(i=1;i<11;i++){
			System.out.println(a+" * " +i+ " = " +(a*i));
		}
		
		
	}
}
