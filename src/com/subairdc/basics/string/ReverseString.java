package com.subairdc.basics.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev = "";
        
        for(int i=A.length()-1;i>=0;i--) {
            rev = rev + A.charAt(i);
        }
        if(rev.equals(A)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

	}

}