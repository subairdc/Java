package com.subairdc.basics.array;

import java.util.Arrays;

public class RemoveDupElement {

	public static void main(String[] args) {
		
		int arr[] = {1,2,2,2,3,2,4,5,7,4,5,6,8,9,8,1};
		int n= arr.length;
		
		arr = sortArray(arr,n);
		
		removeDuplicateElement(arr,n);
			
	}

	
	private static int[] sortArray(int[] arr, int n) {
		
		for(int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				
				if(arr[i]>= arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//System.out.println(Arrays.toString(arr));
		
		return arr;	
	}
	
	private static void removeDuplicateElement(int[] arr, int n) {
		int j=0;
		for(int i=0; i<n-1; i++) {
			
			if(arr[i] != arr[i+1]) {
				arr[j++] = arr[i];
			}
		}
		
		arr[j++] = arr[n-1];
		
		for(int i=0; i<j; i++) {
			System.out.print(arr[i]+" ");
		}
	
		
	}


}
