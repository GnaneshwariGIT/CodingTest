package Oops;

public class MethodOverriding {

	public static void main(String[] args) {
		oops obj=new oops();
		obj.display();
	}
}
class oops{
	public void display(){
		System.out.println("Object means a real word entity such as pen, chair, table etc");
	}
}
class object extends oops{
	public void display(){
		System.out.println("Collection of objects is called class");
	}
}