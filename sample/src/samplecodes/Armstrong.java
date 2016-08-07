package samplecodes;

public class Armstrong {


public static void main (String [] args){ 
	for (int n=10; n <10000; n++){ 
        int sum = 0; 
            int number =n; 
            int original = number; 
            while(number>0){ 
                int t= number%10; 
                sum += t*t*t; 
                number = number/10; 
            }  
            if (sum == original) { 
                System.out.println(original); 
            } 
        } 
    }
}
