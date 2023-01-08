package com.subairdc.basics.string;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str = "racecarh";
		int length = str.length();
		boolean isPalindrome = true;
		
		for(int i=0; i<length/2; i++) {
			if(str.charAt(i) != str.charAt(length-i-1)) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println("Palindrome");
		}else
			System.out.println("Not a Palindrome");

	}

}
