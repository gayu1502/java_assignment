package assignment1;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		 int area,side;
	     Scanner input=new Scanner(System.in);
			System.out.println("enter the value of n:");
			side=input.nextInt();
			
			area=side * side;
			System.out.println("area of square is "+area);
	}

}
