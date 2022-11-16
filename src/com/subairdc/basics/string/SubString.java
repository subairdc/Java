package com.subairdc.basics.string;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int start = in.nextInt();
	        int end = in.nextInt();
	    
	       // System.out.print(S.substring(start,end));
	        for(int i=start;i<end;i++){
	            System.out.print(S.charAt(i));
	        }

	}

}