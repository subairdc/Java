package com.subairdc.basics.basic;

public class AdamNumber {

	public static void main(String[] args) {
		
		int n= 12;
		int r = reverse(n);
		
		if(n*n == reverse(r*r)) {
			System.out.println("Adam Number");
		} else
			System.out.println("Not a Adam Number");
	}

	private static int reverse(int n) {
		int sum =0;
		while(n>0) {
			sum = (sum*10) + n%10;
			n /= 10;
		}
		return sum;
	}

}

//12 --- 144(Square) --- 441(reverse) --- 21(Square root) --- 12 
//12 --- 144   ==   12 --- 21 ---441(square) ---144(reverse)


