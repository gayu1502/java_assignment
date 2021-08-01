package assignment1;

import java.util.Scanner;

public class DivideByFive {

	public static void main(String[] args) {
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value of n");
		n=input.nextInt();
		
		
		if(n%5==0) {
			System.out.println("number is divisible by 5");
		}else {
			System.out.println("number is not divisible by 5");
		}
	}

}
