package assignment1;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		int year,i;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the year in the format YYYY");
		year=input.nextInt();
		
		if(year%400==0||year%4==0&&year%100!=0) {
			System.out.println(year+" is leap year");
		}else {
			System.out.println(year+" is not leap year");
		}
		
	}

}
