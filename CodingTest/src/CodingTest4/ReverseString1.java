package CodingTest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString1 {
	 public static void main(String[] args) {
	        String OriginalString="";
	        System.out.println("Enter the OriginalString:");
	        try
	        {
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            OriginalString = br.readLine();
	            char[] ReversedString= OriginalString.toCharArray();
	            System.out.print("Reversed string is ");
	            for (int i=ReversedString.length-1;i>=0;i--)
	            System.out.print(ReversedString[i]);
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
