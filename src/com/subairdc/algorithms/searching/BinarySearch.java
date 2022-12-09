package com.subairdc.algorithms.searching;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		int target = 7;

		int start =0;
		int end =arr.length-1;
		int mid;
		
		while(start<end) {
			if(arr[start] == target) {
				System.out.println("value found in position" +start+" = "+ arr[start]);
				return;
			}else if(arr[end] == target) {
					System.out.println("value found in position " +end+" = "+ arr[end]);
					return;
			}
			
			mid = (start+end)/2;
			
			if(arr[mid] == target) {
				System.out.println("value found in position " +mid+" = "+ arr[mid]);
				return;
			}
			
			if(target > arr[mid]) {
				start = mid+1;
				end = end -1;
			}else {
				start = start+1;
				end = mid-1;
			}
		}
		
		System.out.println("value not found");
		
	}
}
