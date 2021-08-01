package assignment5;

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	static int fact(int n) {
		if(n==0) {
			return 1;
		}else {
			return(n*fact(n-1));
		}
	}

	public static void main(String[] args) {
		int i,factorial=1;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value of number:");
		int number=input.nextInt();
		factorial=fact(number);
		System.out.println("factorial of "+number+" is "+factorial);
		
	}
}
