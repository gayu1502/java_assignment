package assignment1;

import java.util.Scanner;

public class DivideByNine {

	public static void main(String[] args) {
		 int n;
	        Scanner input=new Scanner(System.in);
			System.out.println("enter the value of n");
			n=input.nextInt();
			
			if(n%9==0) {
				System.out.println("number is divisible by 9");
			}else {
				System.out.println("number is not divisible by 9");
			}
	}

}
