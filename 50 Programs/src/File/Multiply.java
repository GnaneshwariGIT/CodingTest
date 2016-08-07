package File;

import java.io.DataInputStream;
import java.io.IOException;

public class Multiply {

	public static void main(String[] args) throws IOException {
	    System.out.print("Enter a & b values:");
		DataInputStream dis = new DataInputStream(System.in);
		int a =dis.readInt();
		int b =dis.readInt();
	    int c=a*b;
	    System.out.print("Multiplication of "+a+" and "+b+" is " +c);
	}
}

