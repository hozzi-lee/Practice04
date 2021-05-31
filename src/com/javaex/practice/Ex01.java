package com.javaex.practice;

public class Ex01 {
	public static void main(String[] args) {
		
		int[] intArray = new int[5]; // intArray에 대해 5개의 공간을 RAN(주기억장치)에 만든다.
		intArray[0] = 3; // 첫번째칸 공간 3으로 초기화
		intArray[1] = 7; // 두번째칸 공간 7로 초기화
		intArray[2] = 12; // 세번째칸 공간 12로 초기화
		// 네번째, 다섯번째 공간을 값을 정해주지 않았기 때문에 0으로 초기화 됨
		
		int result = 0; // 배열의 값들을 더해주기 전에 더한값을 0으로 초기화
		
		for ( int i = 0; i < intArray.length; i++ ) { // 기존 <=  --> < 로 변경, 조건식은 0부터 시작하기 때문에 <=를 쓰면 공간개수를 초과해서 오류
			result = result + intArray[i]; // 3 + 7 + 12 + 0 + 0 == 22
		}
		System.out.println(result); // 22
	}

}
