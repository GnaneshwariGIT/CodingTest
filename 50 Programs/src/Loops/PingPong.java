package Loops;

import java.util.Scanner;

public class PingPong {
	
	public static void main(String[] args) {
		
	
    int i;
    System.out.println("Enter i value:");
	@SuppressWarnings("resource")
	Scanner x=new Scanner(System.in);
	i=x.nextInt();

	if( i%3 == 0 &&  i%5 == 0 ){
		System.out.print("pingpong");
	}else if( i%3 == 0 ){
		System.out.print("ping");
	}else if( i%5 == 0 ){
		System.out.print("pong");
	}else{
		System.out.print(i);
	}

}
}