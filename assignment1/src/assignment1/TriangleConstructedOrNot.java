package assignment1;

import java.util.Scanner;

public class TriangleConstructedOrNot {

	public static void main(String[] args) {
		int a,b,c;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=input.nextInt();
		System.out.println("Enter the value of b");
		b=input.nextInt();
		System.out.println("Enter the value of c");
		c=input.nextInt();
		
		if(a+b>c&&b+c>a&&a+c>b)
		{
			System.out.println("Triangle is constructed");
		}else {
			System.out.println("Triangle is not constructed");
		}
		
		
	}

}
