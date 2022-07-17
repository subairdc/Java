package com.subairdc.basics.pattern;

public class Pattern {

    public static void pattern1(int n){
        System.out.println("******  Pattern 1  ******");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern2(int n){
        System.out.println("******  Pattern 2  ******");
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern3(int n){
        System.out.println("******  Pattern 3  ******");
        int space=1;
		for(int i=1,k=n; k>=1; i++,k--) {
			if(space<i) {
				System.out.printf("%-"+space+"s", " ");
				space++;
			}
			for(int j=1;j<=k;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
        System.out.println();
    }

    public static void pattern4(int n){
        System.out.println("******  Pattern 4  ******");
        for(int i=1; i<=n; i++){
            for(int i_space =n-1; i_space>=i; i_space--)
                System.out.print(" ");
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        int n =3;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
    }
}
