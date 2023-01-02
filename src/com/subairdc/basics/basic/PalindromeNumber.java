package com.subairdc.basics.basic;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		//Check the given number is palindrome or not
		
		int num;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		
		System.out.println(palindrome(num));

	}

	private static boolean palindrome(int num) {
		
		if(num<0 || (num % 10 == 0 && num !=0))
            return false;

        int reverseNum=0;

        while(num>reverseNum){
            reverseNum = (reverseNum*10) + (num % 10);
            num /=10;
        }

        return num == reverseNum || num == reverseNum /10;		
	}

}
