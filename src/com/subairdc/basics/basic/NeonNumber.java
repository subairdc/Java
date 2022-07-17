package com.subairdc.basics.basic;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		
		//Check the given number is neon number or not
		//Example. n = 9. square = 81. sum of digits of square = 8 + 1 = 9
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		
		checkNeonNumber(num);
	}

	private static void checkNeonNumber(int num) {
		
		int square = num * num;
		int sum =0;
		
		while(square>0) {
			int rem = square % 10;
			sum = sum + rem;
			square /= 10;
		}
		
		if(num == sum) {
			System.out.println("The given number " + num + " is a Neon Number");
		}else
			System.out.println("The given number " + num + " is not a Neon Number");

		
		
	}

}
