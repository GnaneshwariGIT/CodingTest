package CodingTest4;

public class ReverseStringByWords1 {

	public static void main(String args[]){
	    String OriginalString = "String class in java do not have reverse() method";
	    String temp = "";
	    String ReversedString = "";
	        for(int i =OriginalString.length()-1;i>=0;i--){
	            temp +=i!=0?OriginalString.charAt(i):OriginalString.charAt(i)+" ";
	            if(OriginalString.charAt(i) == ' '||i==0){
	                for(int j=temp.length()-1;j>=0;j--){
	                	ReversedString += temp.charAt(j);
	                }
	                temp = "";
	            }
	         }
	         System.out.println("Reversed string is : " + ReversedString);
	    }
}
