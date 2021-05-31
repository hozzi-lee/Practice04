package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) { // 고민고민 하다가 수강생 깃허브 참고함..

		Scanner sc = new Scanner(System.in);

		int[] wonArray = new int[10];

		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;

		int[] divWonArray = new int[10];


		System.out.print("금액: ");
		int won = sc.nextInt();
		int j = won;

		for ( int i = 0; i < wonArray.length; i++ ) {
			if ( won >= wonArray[i]) {
				divWonArray[i] = j / wonArray[i];
				j = j - ( divWonArray[i] * wonArray[i] );
			}
		}
		 System.out.println("50000원:"+divWonArray[0]+"개");
		 System.out.println("10000원:"+divWonArray[1]+"개");
		 System.out.println("5000원:"+divWonArray[2]+"개");
		 System.out.println("1000원:"+divWonArray[3]+"개");
		 System.out.println("500원:"+divWonArray[4]+"개");
		 System.out.println("100원:"+divWonArray[5]+"개");
		 System.out.println("50원:"+divWonArray[6]+"개");
		 System.out.println("10원:"+divWonArray[7]+"개");
		 System.out.println("5원:"+divWonArray[8]+"개");
		 System.out.println("1원:"+divWonArray[9]+"개");

		sc.close();
	}

}