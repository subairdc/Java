package com.subairdc.basics.basic;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		//Swap two numbers
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		System.out.print("Num1: ");
		num1 = sc.nextInt();
		
		System.out.print("Num2: ");
		num2 = sc.nextInt();
		
		
		System.out.println("Before Swaping: " + num1 +" " +num2 );
		
		swapTwoNum(num1, num2);

	}

	private static void swapTwoNum(int num1, int num2) {
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swaping: "+ num1 + " "+ num2);
		
		
	}

}
