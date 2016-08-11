package CodingTest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseOnlyLettersOfAWordInAString {

	public static void main(String[] args)throws IOException {
       
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string to be reversed");
        String OriginalString=br.readLine();
        char ReversedString;
        int k=0;        
        for(int i=0;i<OriginalString.length();i++)
        {           
            if(OriginalString.charAt(i)==32 ||i==OriginalString.length()-1)
            {
                for(int j=i;j>=k;j--)
                {
                	ReversedString=OriginalString.charAt(j);
                    System.out.print(ReversedString);
                }
                k=i;
                continue;
            }             
        }
    }
}


