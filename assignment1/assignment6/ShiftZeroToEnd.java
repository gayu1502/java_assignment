package assignment6;

import java.util.Scanner;

public class ShiftZeroToEnd {

	public static void main(String[] args) {
		int n;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		n=input.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter the element:");
		
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				arr[count++]=arr[i];
			}
		}
		
		while(count<n) {
			arr[count++]=0;
		}
		for(int j=0;j<n;j++) {
			System.out.println(arr[j]);
		}
	}
}