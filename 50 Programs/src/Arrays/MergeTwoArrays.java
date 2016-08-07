package Arrays;

public class MergeTwoArrays {

	public static class CollectionUtils {
		  private CollectionUtils () {}
		  public static String[] join(String [] ... parms) {		    
		    int size = 0;
		    for (String[] array : parms) {
		      size += array.length;
		    }
		    String[] result = new String[size];
		    int j = 0;
		    for (String[] array : parms) {
		      for (String s : array) {
		        result[j++] = s;
		      }
		    }
		    return result;
		  }
		  public static void main(String[] args) {
		    String a[] = { "1", "2", "3" };
		    String b[] = { "4", "5", "6" };
		    String c[] = { "7", "8", "9" };
		    String[] big = (String [])join(a,b,c);
		    System.out.println(java.util.Arrays.toString(big));
		}}
}