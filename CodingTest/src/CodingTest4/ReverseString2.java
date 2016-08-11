package CodingTest4;

public class ReverseString2 {

	public static void main(String[] args) {
		  String OriginalString="String class in java do not have reverse() method";
		  StringBuilder ReversedString = new StringBuilder();
		  ReversedString.append(OriginalString);
		  ReversedString=ReversedString.reverse();
		  System.out.println("Reversed string is :");
		  for (int i=0;i<ReversedString.length();i++)
		  System.out.print(ReversedString.charAt(i));  
		 }
}
