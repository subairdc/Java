package com.subairdc.algorithms.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = { 10, 7, 8, 9, 1, 5 };
//		int[] arr = { 10, 7, 8, 9, 1 };
		int[] arr = { 27, 10, 36, 18, 25, 16 ,27};
		int n = arr.length;

		quickSort(arr, 0, n-1);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}
	
	static void swap(int[] arr, int i, int j){
	    int tmp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = tmp;
//	    System.out.println(Arrays.toString(arr));
	}

	static int partition(int[] arr, int low, int high)
	{
		int pivot = arr[low]; // first element as pivot
		int start = low;
		int end = high;
		
		while(start<end) {
			
			while(arr[start] <= pivot && start<end)
				start++;
			
			while(arr[end] >= pivot && end>=start )
				end--;
			
			if(start<end)
				swap(arr,start,end); // didn't cross each other so swap two value 
		}
			swap(arr,low,end); // pivot swapping
		    return end;
	}

	static void quickSort(int[] arr, int low, int high){
	    if(low < high){
	        int p = partition(arr, low, high);
	        quickSort(arr, low, p);
	        quickSort(arr, p+1, high);
	    }
	}

	// Function to print an array
	static void printArray(int[] arr, int size)
	{
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

}