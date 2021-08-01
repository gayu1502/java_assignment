package assignment1;

import java.util.Scanner;

public class FibonacciUptoNthTerm {

	public static void main(String[] args) {
		int x=0,y=1,z=0,n;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value of n:");
		n=input.nextInt();
		while(z<=n) {
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;
			
		}
	}

}
