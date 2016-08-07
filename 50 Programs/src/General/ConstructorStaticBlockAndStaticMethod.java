package General;

public class ConstructorStaticBlockAndStaticMethod {

	  public static void staticmethod() {
		   System.out.println("I am in staticmethod");
	  }
      
	  public ConstructorStaticBlockAndStaticMethod(){
	        System.out.println("I am in constructor");
	  }
	 
	  static {
	        System.out.println("I am in static block");
	        System.out.println("Static block will be called first than constructor.Static block will be called only once");

	  }
	    
		
	  public static void main(String a[]){
	    	staticmethod();
	    	ConstructorStaticBlockAndStaticMethod csbsm1 = new ConstructorStaticBlockAndStaticMethod();
	    	ConstructorStaticBlockAndStaticMethod csbsm2 = new ConstructorStaticBlockAndStaticMethod();
	    	ConstructorStaticBlockAndStaticMethod csbsm3 = new ConstructorStaticBlockAndStaticMethod();
	    	ConstructorStaticBlockAndStaticMethod csbsm4 = new ConstructorStaticBlockAndStaticMethod();
	    	ConstructorStaticBlockAndStaticMethod csbsm5 = new ConstructorStaticBlockAndStaticMethod();
	  }
}
