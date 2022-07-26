package com.subairdc.basics.pattern;

import java.util.Scanner;

public class KPattern {

	public static void main(String[] args) {
		
		//K Pattern
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=i; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}

	}

}
