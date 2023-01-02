package com.subairdc.leetcode;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		
		int arr[] = {2,7,11,15};
		twoSum(arr,9);	
		
	}

	private static void twoSum(int[] arr, int target) {
		
		int res[] = new int[2];
	    for(int i=0; i<arr.length;i++){
	    	for(int j=i+1; j<arr.length; j++){
	    		if((arr[i] + arr[j]) == target) {
	    			res[0] = i;
	                res[1] = j;
	            }
	        }
	     }
	    System.out.println(Arrays.toString(res));		
	}
}

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
