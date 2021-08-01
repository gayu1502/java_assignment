package assignment5;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string");
		
		String str=input.nextLine();
		input.close();
		String reverse="";
		int x=str.length();
		for(int i=x-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);

	}
		System.out.println(reverse);
		
		
	}
}
 
