package com.subairdc.basics.array;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[] = {9,85,4,5,3,6,9,3,1,6,2,3,4,6,66,250,99,250,100,250,25,66,225,25,250,100,225,222};

		int n= arr.length;
		sortArray(arr, n);
		//removeDuplicateElement(arr, n); // another way
		secondLargest(arr, n);

	}

	private static void secondLargest(int[] arr, int n) {
		
		if(arr[n-1] == arr[n-2]) {
			secondLargest(arr, n-1);
		}else 
			System.out.println(arr[n-2]);
			
	}

	private static void sortArray(int[] arr, int n) {

		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>=arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("sort "+Arrays.toString(arr));

		
	}

	private static void removeDuplicateElement(int[] arr, int n) {
		int j=0;
		
		for(int i=0; i<n-1; i++) {
			if(arr[i] != arr[i+1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n-1];
		System.out.println(j);

		System.out.println("Second Largest Element: " +arr[j-2]);
		
	}
}
