package assignment1;

import java.util.Scanner;

public class SmallestNo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=input.nextInt();
		System.out.println("Enter the value of b:");
		b=input.nextInt();
		System.out.println("Enter the value of c:");
		c=input.nextInt();
		
		if(a>b&&a>c)
		{
			System.out.println("a is the greatest");
		}else if(b>c)
		{
			System.out.println("b is the greatest");
		}else {
			System.out.println("c is the greatest");
		}
		
	}

}
