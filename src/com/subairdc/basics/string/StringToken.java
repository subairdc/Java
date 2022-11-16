package com.subairdc.basics.string;

import java.util.Scanner;

public class StringToken {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim(); // remove front and back spaces in the string
        if(s.length()==0) {
            System.out.println(0);
        }else {
            String[] string = s.split("['!?,._@ ]+");
            System.out.println(string.length);
            
            for (String str : string)
                System.out.println(str);
            
        }
        scan.close();
	}

}