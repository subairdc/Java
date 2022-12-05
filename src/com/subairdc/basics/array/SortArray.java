package com.subairdc.basics.array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = {10,6,5,88,44,36,9,14,75,-5,-5,4,-8,36,55,44,99,7,2,80};
		
		sortArray(arr);
	}

	public static void sortArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]>=arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
