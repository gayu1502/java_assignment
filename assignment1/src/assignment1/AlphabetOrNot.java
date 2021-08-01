package assignment1;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    char ch;
    System.out.println("enter the char:");
    ch=input.next().charAt(0);
    
    if((ch>='A'&&ch>='Z')||(ch>='a'&&ch>='z')){
    	System.out.println("char"+ch+" is alphabet");
    }else {
    	System.out.println("char"+ch+" is  not alphabet");
    }
    
	}

}
