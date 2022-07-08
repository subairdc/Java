package com.subairdc.basics.basic;

import java.util.Scanner;

public class PrimeNumberN {

	public static void main(String[] args) {
		
		//Find the Prime number of 1 to N.
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		
		primeNumberN(num);

	}

	private static void primeNumberN(int num) {
		
		int i,j;
		boolean flag = true;
		
		System.out.println("The prime numbers are  1 to "+ num +".");
		
		for(i=1; i<=num; i++) {
			
			if(i==1) {
				System.out.print(i + " ");
				continue;
			}
			flag = true;
			
			for(j=2; j<= i/2; j++) {
				
				if(i%j == 0) {
					flag = false;
					break;
				}
			}
			
			if(flag == true)
				System.out.print(i + " ");
		}
		
	}

}
