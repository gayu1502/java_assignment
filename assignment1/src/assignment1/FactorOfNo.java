package assignment1;

import java.util.Scanner;

public class FactorOfNo {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the no");
		
		int n=input.nextInt();
		
		System.out.println("factor of "+n+" are");
		
		for(int i=1;i<=n;++i) {
			if(n%i==0) {
				System.out.println(i+" ");
			}
		}
	}

}
