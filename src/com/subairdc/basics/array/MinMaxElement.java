package com.subairdc.basics.array;

public class MinMaxElement {

	public static void main(String[] args) {
		
		int arr[] = {2,6,4,9,3,7,55,99,26,42,68,92,32,94,93,12,35};
		int n = arr.length;
		int min =arr[0],max=arr[0];
		
		for(int i=0; i<n; i++) {
			if(arr[i]<=min) {
				min = arr[i];
			}
			
			if(arr[i]>=max) {
				max= arr[i];
			}
		}
		
		System.out.println("Min= " + min + ". Max= "+ max);

	}

}
