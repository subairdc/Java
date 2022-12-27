package com.subairdc.basics.basic;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		//Check the given number is palindrome or not
		
		int num;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		
		palindrome(num);

	}

	private static void palindrome(int num) {
		
		int temp,r,sum=0;
		
		temp=num;
		
		while(temp>0) {
			r = temp%10;
			sum = (sum*10) + r;
			temp /= 10;
		}
		
		if(sum == num) {
			System.out.println("The given number "+ num +" is Palindrome");
		}else
			System.out.println("The given number "+ num +" is not a Palindrome");

		
	}

}
