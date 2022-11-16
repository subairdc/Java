package com.subairdc.basics.string;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		String str1 = "hash1agile2tech3company";
		String str2 = "Tit4Tat";
		
//		Scanner sc = new Scanner(System.in);
//		str1 = sc.next();
//		str1 = sc.next();
		
		revString(str1);
		revString(str2);
	}

	private static void revString(String str1) {
		String revString = "";
		for(int i = str1.length()-1; i>=0; i--) {
			if(!(str1.charAt(i) >= '1' && str1.charAt(i) <= '9')) {
				revString = revString + str1.charAt(i);
			}
		}
		System.out.println(revString);
	}

}
