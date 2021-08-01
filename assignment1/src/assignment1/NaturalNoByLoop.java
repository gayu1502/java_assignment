package assignment1;

import java.util.Scanner;

public class NaturalNoByLoop {

	public static void main(String[] args) {
		int n,i,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value of n");
		n=input.nextInt();
		i=0;
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("sum="+sum);
	}

}
