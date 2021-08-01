package assignment1;

import java.util.Scanner;

public class NaturalNoByFormula {
	
	static int sumOfNaturalNo(int n) {
		return n*(n+1)/2;
	}

	public static void main(String[] args) {
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value of n");
		n=input.nextInt();
		
	
		System.out.println("sum="+sumOfNaturalNo(n));
	}

}
