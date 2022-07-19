package com.subairdc.basics.pattern;

import java.util.Scanner;

public class HillPattern {

	public static void main(String[] args) {
		
		//Hill And Reverse Pattern (Recursion method also)
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		
		hillPattern(n);
	    reverseHillPattern(n);
	    
		System.out.println("****** Hill Pattern Using Recursion  ******");
	    hillPatternR(n,1);
	    System.out.println();
	    
		System.out.println("****** Hill Pattern Using Recursion  ******");
	    reverseHillPatternR(n,1);
	}
	
	//Hill Pattern
	private static void hillPattern(int n) {
        System.out.println("******  Hill Pattern  ******");
        for(int i=1; i<=n; i++){
            for(int space =1; space<=n-i; space++)
                System.out.print(" ");
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=i-1; j>=1; j--){
                System.out.print(j);
            }

            System.out.println();
        }
        System.out.println();
    }

    private static void reverseHillPattern(int n) {
        System.out.println("******  Reverse Hill Pattern  ******");
        int count=n;
        for(int i=n; i>=1; i--){
            for(int space =n; space>i; space--)
                System.out.print(" ");
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=count-1; j>=1; j--){
                System.out.print(j);
            }
            count--;
            System.out.println();
        }
        System.out.println();
    }

    
    //Hill Pattern Using Recursion
	private static void hillPatternR(int n, int i) {
		
		if(n ==0)
			return;
		
		printSpace(n - 1);
		printRow1(i,1);
		printRow2(i-1,i-1);
		
		System.out.println();
		
		hillPatternR(n-1, i+1);
		
	}

	private static void printSpace(int i) {
		
		if (i == 0)
			return;

        System.out.print(" ");

        printSpace(i - 1);
	}
	
	private static void printRow1(int i, int j) {
		if (i==0)
            return;

        System.out.print(j);
        printRow1(i-1,j + 1);

	}
	private static void printRow2(int i, int j) {
		if (i==0)
            return;

        System.out.print(j);
        printRow2(i-1,j - 1);

	}

	//Reverse Hill Pattern Using Recursion
		private static void reverseHillPatternR(int n, int i) {
			
			if(n ==0)
				return;
			
			printSpace(i - 1);
			printRow3(n,1);
			printRow4(n,n-1);
			System.out.println();
			
			reverseHillPatternR(n-1, i+1);
		}

		private static void printRow3(int n, int i) {
			
			if(i>n)
				return;
			System.out.print(i);
			
			printRow3(n,i+1);
			
		}
		
		private static void printRow4(int n, int i) {
			
			if(i==0)
				return;
			System.out.print(i);
			
			printRow4(n,i-1);
			
		}

}
