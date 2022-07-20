package com.subairdc.basics.pattern;

import java.util.Scanner;

public class CrossXPattern {

	public static void main(String[] args) {
		
		//CrossX Pattern Program

		String string;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String(Odd No. char):");
		
		string = sc.nextLine();
		
		int n = string.length();
		int r =n;
		
		if(n%2==0) {
			System.out.println("The given word "+string+" is even no. of char. That's not work properly");
			System.out.println("Try odd no. of char");
		}
		
		for(int i =0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					System.out.print(string.charAt(i));
				}else if((i+j)==n-1){
					System.out.print(string.charAt(r-1));
				}else
					System.out.print(" ");
			}
			System.out.println();
			r--;
		}

	}

}
