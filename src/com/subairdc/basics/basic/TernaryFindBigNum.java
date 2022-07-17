package com.subairdc.basics.basic;

public class TernaryFindBigNum {

	public static void main(String[] args) {
		
		 int a,b,c;
	     int largestNum;
	     a=5;b=7;c=10;
	     
	     largestNum = findLargest(a, b, c);
	     
	     System.out.println(largestNum + " is the largest number.");

	}

	private static int findLargest(int a, int b, int c) {
		
		//largest = Math.max(x, y);
        //z > (x>y ? x:y) ? z:(Math.max(x,y));

        return c > (a>b ? a:b) ? c:(a>b ? a:b);
		
	}

}
