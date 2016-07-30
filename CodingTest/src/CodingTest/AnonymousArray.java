package CodingTest;

//Anonymous array is an array without any name.
//Second Commit
public class AnonymousArray {

	 public static void main(String[] args) {
	        System.out.println("Sum of numbers: " + sum(new int[]{6,3,55,3,55,22,54}));
	    }
	 //Anonymous array follows same syntax like normal array in Java e.g. new [] { };



	    public static int sum(int[] numbers){
	        int Sum = 0;
	        for(int x: numbers){
	            Sum = Sum + x;
	        }
	        return Sum;
	    }
}
