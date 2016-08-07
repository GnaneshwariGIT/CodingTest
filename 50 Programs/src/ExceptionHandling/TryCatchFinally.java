package ExceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		try{
		String name = null;		
		for(int i=0;i<name.length();i++){
			System.out.println("Letters-- "+name.charAt(i));
		}
		System.out.println("Successfully Running");
		} 
		catch(NullPointerException e){
			System.out.println("Null Pointer Exception "+e);
		}
		finally{
			System.out.println("Executed Successfully");
		}
	}
}
