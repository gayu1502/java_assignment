package assignment1;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		int n,z,count=0,digit,i,pro,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value of n");
		n=input.nextInt();
		z=n;
		while(z>0)
		{
			count=count+1;
			z=z/10;
		}
		z=n;
		while(z>0)
		{
			digit=z%10;
			pro=1;
			for(i=0;i<=count;i++)
			pro=pro * digit;
			sum=sum+pro;
			z=z/10;
		}
		if(sum==n)
		{
			System.out.println(n+ " is Armstrong no");
		}else {
			System.out.println(n+ " is not Armstrong no");
		}
		
	}
}
