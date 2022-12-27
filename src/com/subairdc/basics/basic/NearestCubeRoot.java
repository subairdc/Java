package com.subairdc.basics.basic;

import java.util.Scanner;

public class NearestCubeRoot {

	public static void main(String[] args) {
		
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int min = 0,max=0;
		int minCube=0;
		int maxCube=0;
		
		for(int i=1; i<=num; i++) {
			int cube = i*i*i;
			if(cube<num) {
				min=cube;
				minCube=i;
			}else {
				max=cube;
				maxCube=i;
				break;
			}
		}
		System.out.println((num - min)<(max-num)?minCube:maxCube);
	}

}
