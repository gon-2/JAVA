package com.mc.c_controll;

import java.util.Scanner;

public class B_ifelse {

	public static void main(String[] args) {
		
		//자바의 변수의 수명(scope)
		// 자바 변수의 스코프 : 블록단위 스코프
		
		// 양자택일 조건문
		// [표현식]
		// if( 조건식){실행코드}else{실행코드}
		
		
		
		
		
		//testIfElse();
		
		
		// 사용자가 입력한 숫자가 0보다 크면 '양수' 0보다 작으면 '음수' 0 이면 0을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		int num1 = sc.nextInt();
		String comment = "";
		
		if(num1 > 0) {
			comment = "양수 입니다.";
		}else if(num1 == 0) {
			comment = "0입니다.";
		}else if(num1 < 0){
			comment = "음수 입니다.";
		}else {
			comment = "문자를 입력하셨습니다.";
			sc.close();
		}
		
		System.out.println(comment);
			
		}

	private static void testIfElse() {
		// 사용자로부터 이름을 입력받아 만약 이름이 본인의 이름이면 [안녕하세요] 를 출력하고
		// 아니면 당신 누구야 를 출력하자
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		String comment = "";
		
		if(name.equals("권용구")) {
			comment = "안녕하세요";
		}else {
			comment = "너 누기야";
		}
		
		System.out.println(comment);
		
		//String comment = name.equals("권용구")?"안녕하세요":"당신누구야"; <- 이것도 같은 결과가 나온다(삼항연산자)
	}

}

