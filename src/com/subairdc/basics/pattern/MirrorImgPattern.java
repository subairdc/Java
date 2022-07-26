package com.subairdc.basics.pattern;

import java.util.Scanner;

public class MirrorImgPattern {

	public static void main(String[] args) {
		
		//Mirror Image Pattern
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int space =1; space<i; space++) {
				System.out.print(" ");
			}
			
			for(int j=i; j<=n; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		//Reverse Order
		for(int i=1; i<n; i++) {
			for(int space =n-i-1; space>0;space--) {
				System.out.print(" ");
			}
			for(int j=n-i;j<=n;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
