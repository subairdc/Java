package com.subairdc.basics.string;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        
    	String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        
        if (a1.length() == b1.length()) {
            
            int arr[] = new int[256];
            int brr[] = new int[256];
            
            for ( int i = 0; i<a1.length(); i++) {
                arr[(int) a1.charAt(i)] += 1;
                brr[(int) b1.charAt(i)] += 1;
            }
            
            for( int i=0; i<256; i++) {
                if(arr[i] != brr[i]) {
                    return false;
                }
            }
            return true;
        }else
            return false;
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean result = isAnagram(a, b);
        System.out.println( (result) ? "Anagrams" : "Not Anagrams" );
    }
}
