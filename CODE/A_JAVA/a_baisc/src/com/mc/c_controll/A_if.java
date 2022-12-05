package com.mc.c_controll;

import java.util.Scanner;

public class A_if {
	
	public static void main(String[] args) {
		
		// 제어문 : 코드의 흐름을 제어하는 문법
		// 제어문에는 조건문(if)과 반복문(for)이 있다
		
		// 단독 if문
		// [표현식]
		// if(조건식){실행문}
		// 조건식이 참이면 실행코드를 수행함
		// 조건식이 거짓이면 실행코드를 무시함
		
		
		
		//sq1();
		
		
		
		int milkCnt = 1;
		boolean isExists = true;
		if(isExists) {
			milkCnt = 6;
		}
		
		System.out.println("우유 " + milkCnt + "개 사옴");
		
	
	}

	private static void q1() {
		// 사용자가 입력한 숫자가 0보다 크거나 같으면 양수입니다를 출력해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int input = sc.nextInt();
		if(input >= 0) {
			System.out.println("양수입니다.");
		}else {
			System.out.println("음수입니다.");
		}
	}
}
