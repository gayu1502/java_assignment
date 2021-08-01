package assignment1;

import java.util.Scanner;

public class LCMAndGCD {


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter the first no:");
		int n=input.nextInt();
		
		System.out.println("enter the first no:");
		int m=input.nextInt();
		
		int temp1=n;
		int temp2=m;

		while(temp2!=0) {
			int temp=temp2;
			temp2=temp1%temp2;
			temp1=temp;
		}
		
		int GCD=temp1;
		int LCM=(n*m)/GCD;
		
		System.out.println("GCD of two no is"+GCD);
		System.out.println("LCM of two no is"+LCM);
		
		
		

	}

}
