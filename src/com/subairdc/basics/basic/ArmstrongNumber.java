package com.subairdc.basics.basic;

import java.util.Scanner;

public class ArmstrongNumber {
	
	private static void armstong(int num) {
		
		int temp1,temp2,rem,n=0;
		double sum =0;
		temp1 = num;
		temp2 = num;
		
		while(temp1>0) {
			temp1 /= 10;
			n++;
		}
		
		while(temp2>0) {
			rem = temp2 % 10;
			sum = sum + Math.pow(rem,n); 
			//sum = sum + (rem*rem*rem);
			temp2 /= 10;
		}
		
		if(sum == num) {
			System.out.println(num + " is Armstong Number");
		}else
			System.out.println(num +" is not an Armstong Number");
		
	}

	public static void main(String[] args) {
		
		//Check the given number is Armstrong number or not.
		//For example: 153 = 1*1*1 + 5*5*5 + 3*3*3 // 153 is an Armstrong number.
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		
		armstong(num);
		
		
	}

}
