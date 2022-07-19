package com.subairdc.basics.pattern;

import java.util.Scanner;

public class PatternUsingRecursion {

	public static void main(String[] args) {
		
		//Pattern Printing Program using Recursion
				
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		
		System.out.println("******  Pattern 1 Using Recursion  ******");
		patternR1(n,1);
		System.out.println();
		
		System.out.println("******  Pattern 2 Using Recursion  ******");
		patternR2(n,1);
		System.out.println();
		
		System.out.println("******  Pattern 3 Using Recursion  ******");
		patternR3(n,1);
		System.out.println();
		
		System.out.println("******  Pattern 4 Using Recursion  ******");
		patternR4(n,1);

	}

	//Pattern1
	private static void patternR1(int n, int i) {
		
		if (n == 0)
            return;
		
		printRow1(i,1);

        System.out.println();

        patternR1(n - 1, i + 1);
	}

	private static void printRow1(int i, int j) {
		
		if (i==0)
            return;

        System.out.print(j);
        printRow1(i-1,j + 1);
		
	}
	
	//Pattern2
	private static void patternR2(int n, int i) {
		
		if(n ==0)
			return;
		printRow2(n,1);
		
		System.out.println();
		
		patternR2(n-1, i+1);
		
	}

	private static void printRow2(int n,int i) {
		
		if(i>n)
			return;
		System.out.print(i);
		
		printRow2(n,i+1);
		
	}
	
	//Pattern3
	private static void patternR3(int n, int i) {
		
		if(n ==0)
			return;
		
		printSpace3(i - 1);
		printRow3(n,1);
		
		System.out.println();
		
		patternR3(n-1, i+1);
		
	}

	private static void printSpace3(int i) {
		
		if (i == 0)
			return;

        System.out.print(" ");

        printSpace3(i - 1);
		
	}

	private static void printRow3(int n, int i) {
		
		if(i>n)
			return;
		System.out.print(i);
		
		printRow3(n,i+1);
		
	}


	//Pattern4
	private static void patternR4(int n, int i) {
		
		if(n ==0)
			return;
		
		printSpace4(n - 1);
		printRow4(i,1);
		
		System.out.println();
		
		patternR4(n-1, i+1);
		
	}

	private static void printSpace4(int i) {
		
		if (i == 0)
			return;

        System.out.print(" ");

        printSpace4(i - 1);
		
	}

	private static void printRow4(int i, int j) {
		
		if (i==0)
            return;

        System.out.print(j);
        printRow4(i-1,j + 1);

		
	}
	
}
