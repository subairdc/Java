package com.subairdc.basics.others;

public class RemoveSpecNum {

	public static void main(String[] args) {
		
		int num = 12050;
		int remove = 0;
		
		System.out.println(removeSpecificNumber(num,remove));

	}

	private static int removeSpecificNumber(int num, int remove) {
		
		int sum = 0;
		int rem,b=1;
		
		while(num>0) {
			
			rem = num%10;
			if(remove != rem) {
				sum = sum+ (b*rem);
				b = b*10;
			}
			num /= 10;
			System.out.println(sum);
		}
		
		return sum;
	}

}
