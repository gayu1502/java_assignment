package assignment1;

import java.util.Scanner;

public class FibonacciUptoNTerm {

	public static void main(String[] args) {
		int x=0,y=1,z=0,n,term=1;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value of n:");
		n=input.nextInt();
		while(term<=n) {
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;
			term=term+1;
		}
	}

}
