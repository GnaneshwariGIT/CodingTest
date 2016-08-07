package Oops;

public class Shape {

	public static void main(String[] args) {

        double width = 5, length = 7;
        AbstractShape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");
	}
}
