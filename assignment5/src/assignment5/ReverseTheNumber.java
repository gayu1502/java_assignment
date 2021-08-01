package assignment5;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int num,rev=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value of num:");
		num=input.nextInt();
		
		while(num>0) {
			rev=rev*10+(num%10);
			num=num/10;
		}
		System.out.println("reverse number is"+rev);
		
		
	}

}
