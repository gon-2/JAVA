package com.mc.f_array;

public class A_array_my_Study {

	public static void main(String[] args) {

		// 배열 : 같은 타입의 데이터들을 하나의 묶음으로 다루는 자료구조
		// 배열에 저장된 각 데이터들은 해당 데이터에 접근할 수 있는 index 번호를 부여받는다.
		// 배열은 참조자료형으로 JVM heap 영역에 저장됨
		// 참조형 변수(reference)를 통해 heap영역의 배열에 접근할 수 있고,
		// index를 통해 배열안의 데이터에 접근할 수 있다.

		// 배열 생성해보기
		// String 타입의 데이터를 5개 보관할 수 있는 배열생성.
		String[] food = { "치킨", "피자", "햄버거", "족발", "보쌈" };

		// 배열의 선언과 동시에 초기화
		// 크기가 5인 int[] 을 선언하고 각 인덱스에 5,4,3,2,1 값을 초기화
		
		int[] iArr = {5,4,3,2,1};
		
		//iArr.length : iArr배열의 크기
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		for(int i = 0; i < iArr.length; i++) {
			int[] bigArr = {iArr.length};
			if(iArr[i] < iArr[i+1]) {
				
			}
		}
		
	}
}
