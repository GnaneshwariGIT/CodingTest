package samplecodes;

import java.math.BigInteger;
import java.util.Scanner;
public class AdditionWithoutOperator{
 
public static void main(String [] args){
int a,b;
System.out.println("Enter a,b values:");
Scanner input=new Scanner(System.in);
a=input.nextInt();
b=input.nextInt();
BigInteger c= new BigInteger(new Integer(a).toString());
BigInteger d= new BigInteger(new Integer(b).toString());
BigInteger sum = c.add(d);
System.out.println(sum);
}
}
