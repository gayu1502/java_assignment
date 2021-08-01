package assignment1;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		int area, length,breath;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length");
		length=input.nextInt();
		System.out.println("enter the breath");
		breath=input.nextInt();
		
		area=length * breath;
		System.out.println("area of rectangle " +area);
	}

}
