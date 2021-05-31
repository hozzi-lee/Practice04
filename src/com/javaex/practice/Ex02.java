package com.javaex.practice;

public class Ex02 {
	public static void main(String[] args) {
		
		double[] doubleArray = new double[3]; // doulbe형 배열 공간 3개
		doubleArray[0] = 6.7; // 1번공간 6.7
		doubleArray[1] = 3.3; // 2번공간 3.3
		doubleArray[2] = 1.2; // 3번공간 1.2
		
		for ( int i = 0; i < doubleArray.length; i++ ) {
			System.out.println(doubleArray[i]); // 3개의 공간의 값을 순서대로 출력
		}
	}

}
