package Strings;

public class ReverseAString {

	public static void main(String[] args) {		
	String str = "HelloWorld";	 
	char[] strArray = str.toCharArray();	 
	for (int i = strArray.length - 1; i >= 0; i--){
	    System.out.print(strArray[i]);   
    }
    }
}