package com.subairdc.basics.basic;

import java.util.Scanner;

public class NearestPrimePalindrome {

	public static void main(String[] args) {
		
		int num;
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num == 0 || num <0)
			System.out.println("Number not valid");
			else {
				int prePrime = num-1;
				int nextPrime = num+1;
				
				while(true) {
					if(findPalindrome(nextPrime) && findPrimeNum(nextPrime)) {
						System.out.println("Nearest Prime(Next): "+nextPrime);
						System.out.println("Difference : " + (num-nextPrime));
						break;
					}
					if(findPalindrome(prePrime) && findPrimeNum(prePrime)) {
						System.out.println("Nearest Prime(Previous): "+prePrime);
						System.out.println("Difference : " + (num-prePrime));
						break;
					}
					
					prePrime--;
					nextPrime++;
				}
			}

	}

	private static boolean findPrimeNum(int num) {
		
		if(num ==1)
			return true;
		
		boolean flag = true;
		
		for(int i=2; i<=num/2; i++) {
			if(num%i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	private static boolean findPalindrome(int num) {
		
		if(num < 0 || (num%10 == 0 && num !=0))
			return false;
		
		int reverseNum=0;
		
		while(num>reverseNum) {
			reverseNum = (reverseNum*10) + num%10; 
			num /= 10;
		}
		
		return (reverseNum == num) || reverseNum/10 == num;
	}

}
