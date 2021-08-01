package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNo {

	public static void main(String[] args) {
		int n,i,temp,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of array");
		n=input.nextInt();
		int[] arr=new int[n];
		
		
		for(i=0;i<n;i++) {
			System.out.println("enter element");
			arr[i]=input.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("second largest is"+arr[n-2]);
	}
}