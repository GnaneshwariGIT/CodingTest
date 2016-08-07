package ExceptionHandling;

public class ParentFunction {

	String name = null;
	public void getDataDemo(){
	    if(name == null)
	       System.out.println("Entered String is null");
	    else
	       System.out.println(name);
	}
	public static void main(String[] args) {
		ParentFunction obj=new ParentFunction();
		obj.function();
	}
	public void function(){
			try{	
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
