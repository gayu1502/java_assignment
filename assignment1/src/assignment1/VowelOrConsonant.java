package assignment1;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter input:");
		  char ch=input.next().charAt(0);
		  
		  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			  System.out.println(ch + "is vowel");
		  }else {
			  System.out.println(ch+"is consonant");
		  }
	}

}
