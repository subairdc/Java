package com.subairdc.basics.others;

public class CoinDenomination {

	public static void main(String[] args) {
		
		int num =19;
		
		int five =num/5; // use minimum no. of coins
		//int five =num/5-1; // use all coins
		
		num = num -5*five;
		
		int two = num/2;
		
		int one = num%2;
		
		
		
		System.out.println(five+two+one + "\nfive:"+ five+"\ntwo:"+two+"\none"+one);

	}

}
