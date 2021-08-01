package assignment1;

import java.util.Scanner;

public class CapitalOrLower {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter input:");
		  char ch=input.next().charAt(0);
		  
switch(ch)
{
case 'U': if(ch=='U') {
	      upperCase(ch);
	      break;
}
	      
case 'L': if(ch=='L') {
          lowerCase(ch);
          break;
}
 default: System.out.println("not valid");
}
  }
	
static void upperCase(char ch)
{
	for(ch='A';ch<='Z';ch++) {
		System.out.println(""+ch);
		
	}
}
static void lowerCase(char ch)
{
	for(ch='a';ch<='z';ch++) {
		System.out.println(""+ch);
		
	}

}

	

	

}
