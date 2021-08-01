package assignment5;

import java.util.Scanner;

public class SortArrayUsingBubbleSort {
	

	public static void main(String[] args) {
		int n,i,temp,j;
		Scanner input = new Scanner(System.in);
			System.out.println("enter the size of array");
			n=input.nextInt();
			int[] arr=new int[n];
			
			System.out.println("enter"+n+"integer");
			for(i=0;i<n;i++) {
				arr[i]=input.nextInt();
			}
			for(i=0;i<(n-1);i++) {
				for(j=0;j<(n-i-1);j++) {
					if(arr[j]>arr[j+1]) {
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			System.out.println("sorted list");
			for(i=0;i<n;i++);
			for (int i1: arr) {
				System.out.println(i1);
			}
	}
	
}
