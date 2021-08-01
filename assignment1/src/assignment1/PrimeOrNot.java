package assignment1;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int n,i,m=0,flag=0;
		System.out.println("enter the number:");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		m=n/2;
		if(n==0||n==1) {
			System.out.println("not prime number");
		}else {
			
		for(i=2;i<=m;i++)
		{
		if(n%i==0) {
			System.out.println("number is not prime no");
			flag=1;
			break;
		}
		}
		}if(flag==0) {
			System.out.println("number is prime no");
		}
	
	}

}
