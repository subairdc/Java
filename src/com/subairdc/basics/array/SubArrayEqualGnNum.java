package com.subairdc.basics.array;

import java.util.Scanner;

public class SubArrayEqualGnNum {

	public static void main(String[] args) {
		
		int size,sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Array Size: ");
		size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.print("Enter the Elements of the Array: ");
		
		for(int i=0; i<size; i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.print("Enter the Sum of the Value: ");
		sum = sc.nextInt();
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]+arr[j] == sum)  {
					System.out.println("Subsets are ("+arr[i]+ "," +arr[j]+ ") with sum 9" );
				}
				
				for(int k=j+1; k<size; k++) {
					if(arr[i]+arr[j]+arr[k] == sum) {
						System.out.println("Subsets are ("+arr[i]+ "," +arr[j]+ ","+ arr[k]+ ") with sum 9" );
					}
				}
			}
		}
		

	}

}
