package com.javaex.practice;

import java.util.Scanner;

public class Ex07_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] wonArray = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.print("금액: ");
		int money = sc.nextInt();
		int[] count = new int[10];
		int minus = money;

		for ( int i = 0; i < wonArray.length; i++ ) {
			minus = minus - wonArray[i];
			count[i] = minus / wonArray[i];
		}
		
		System.out.println("50000원:"+count[0]+"개");
		System.out.println("50000원:"+count[1]+"개");
		System.out.println("50000원:"+count[2]+"개");
		System.out.println("50000원:"+count[3]+"개");
		System.out.println("50000원:"+count[4]+"개");
		System.out.println("50000원:"+count[5]+"개");
		System.out.println("50000원:"+count[6]+"개");
		System.out.println("50000원:"+count[7]+"개");
		System.out.println("50000원:"+count[8]+"개");
		System.out.println("50000원:"+count[9]+"개");


		sc.close();

	}

}
