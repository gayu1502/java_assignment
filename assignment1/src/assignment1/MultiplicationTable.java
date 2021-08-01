package assignment1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
      
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the no");
		
		int n=input.nextInt();
		for(int i=0;i<=10;i++) {
			System.out.println(n*i);
		}
		
	}

}
