package CodingTest4;

public class ReverseStringByWords2 {

	public static void main(String args[]){
	    String OriginalString[] = "String class in java do not have reverse() method".split(" ");
	    String ReversedString="";
	        for(int i = OriginalString.length-1; i>= 0 ;i--){
	        	ReversedString += OriginalString[i]+" ";
	        }
	        System.out.println("Reversed string is : " + ReversedString);
	    }
}
