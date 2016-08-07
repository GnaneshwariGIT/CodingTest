package Oops;

public class MethodOverloading {

	int add(int n1,int n2){
		return n1+n2;
	}
	int add(int n1,int n2,int n3){
		return n1+n2+n3;
	}
	int add(int n1,int n2,int n3,int n4){
		return n1+n2+n3+n4;
	}
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		System.out.println("Sum of two numbers: "+obj.add(20, 21));
    	System.out.println("Sum of three numbers: "+obj.add(20, 21, 22));
    	System.out.println("Sum of four numbers: "+obj.add(20, 21, 22, 23));
				
	}
}
