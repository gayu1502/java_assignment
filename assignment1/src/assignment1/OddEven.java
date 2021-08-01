package assignment1;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the value of n");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		if(n%2==0) {
			System.out.println("number is even no");
		}else {
			System.out.println("number is odd no");
		}
	}

}
