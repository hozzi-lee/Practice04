package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {

		int[] intA = { 3, 6, 9 }; // int형 배열 intA에 공간 3개에 값을 각가 3, 6, 9로 초기화

		int[] intB; // int형 배열 intB 생성
		intB = intA; // intB에 intA를 대입 --> intB에 3개의 공간 생김
		intB[0] = 20; // intB 첫번째 공간 20대입
		// intB 두번째 공간은 intA의 두번째 값인 6대입
		intB[2] = 10; // intB 세번째 공간 10대입

		for (int i = 0; i < intA.length; i++ ) {
			System.out.println(intA[i]); // 20, 6, 10 출력
		}
	}

}
