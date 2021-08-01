package assignment5;

import java.util.Scanner;

public class AverageMinMaxOfArray {

	public static void main(String[] args) {
		int n,i,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of array:");
		n=input.nextInt();
		int[] array=new int[n];
		
		for(i=0;i<n;i++) {
			System.out.println("enter the n element of array");
			array[i]=input.nextInt();
			sum=sum+array[i];
			}
		int min=array[0],max=array[0];
		
		for(i=0;i<n;i++) {
			if(array[i]>max) {
				max=array[i];
			}
			if(array[i]<min) {
				min=array[i];
			}

			
		}
		System.out.println("max no is"+max);
		System.out.println("min no is"+min);
		System.out.println("average is "+sum/n);
	}

}
