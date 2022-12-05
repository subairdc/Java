package com.subairdc.basics.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int n = arr.length;
		//reverseArray(arr, n); //use new array
		reverseArraySwape(arr, n); // use same array
	}

	public static void reverseArray(int arr[], int n) {
		
		int arr1[] = new int[n];
		for(int i=0;i<n; i++) {
			arr1[n-i-1] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr1));
	}

	public static void reverseArraySwape(int arr[], int n) {
		
		for(int i=0; i<n/2; i++) {
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
