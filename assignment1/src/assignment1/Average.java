package assignment1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int i;
	    double avg;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first no:");
		int num1=input.nextInt();
		System.out.println("enter the first no:");
		int num2=input.nextInt();
		System.out.println("enter the first no:");
		int num3=input.nextInt();
		System.out.println("enter the first no:");
		int num4=input.nextInt();
		System.out.println("enter the first no:");
		int num5=input.nextInt();
		
		avg=num1+num2+num3+num4+num5/5;
		System.out.println("average is "+avg);
	}
}
