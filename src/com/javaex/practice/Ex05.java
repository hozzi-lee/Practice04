package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] intArray = new int[5];

		int sum = 0;

		for ( int i = 0; i < intArray.length; i++ ) {
			int num = sc.nextInt();
			sum = sum + num;
		}
		
		int result = sum / intArray.length;
		System.out.println("평균은 "+result+" 입니다.");

		sc.close();
	}

}
