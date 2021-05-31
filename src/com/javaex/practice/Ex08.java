package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) { // 이것도 수강생 참고함...

		int[] lotto45 = new int[6];

		for ( int i = 0; i < lotto45.length; i++ ) {
			lotto45[i] = (int)(Math.random() * 45) + 1;

			for ( int j = 0; j < i; j++ ) {
				if ( lotto45[i] == lotto45[j] ) {
					i--;
					break;
				}
			}

		}
		for ( int num = 0; num < lotto45.length; num++ ) {
			System.out.print(lotto45[num] + "   ");
		}
	}

}
