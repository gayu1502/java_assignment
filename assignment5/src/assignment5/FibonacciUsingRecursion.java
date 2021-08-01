package assignment5;

import java.util.Scanner;

public class FibonacciUsingRecursion {
	static int fib(int n) {
		if(n==0||n==1) {
			return n;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}

	public static void main(String[] args) {
		int number,fibonacci;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value of number:");
		number=input.nextInt();
		fibonacci=number*fib(number-1);
		System.out.println(fibonacci);
	}
	
}
