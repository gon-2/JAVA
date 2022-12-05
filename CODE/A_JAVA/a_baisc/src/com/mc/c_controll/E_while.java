package com.mc.c_controll;

import java.util.Scanner;

public class E_while {

	//[표현식]
	//while(조건식){실행문}
	//조건식이 참이면 실해오드를 반복
	//조건식이 거짓이면 반복을 종료
	
	public static void main(String[] args) {
		
		//studyWhile();
		
		
		//사용자로부터 비밀번호를 입력받아서
		//비밀번호가 일치하면 "로그인 되었습니다."를 출력하고 반복문을 종료
	   //비밀번호가 일치하지 않으면 "비밀번호가 틀렸습니다"를 출력하고 다시 비밀번호를
	   //입력받을 수 있도록 한다.
	   //비밀번호를 5회 틀리게 되면 "비밀번호를 5회 잘못 입력하여 프로그램을 종료합니다."
	   //라고 출력하고 반복문을 종료한다.
	   // * 비밀번호 :  123abc
		
		
		Scanner sc = new Scanner(System.in);
		String pw = "123abc";
		boolean isAnony = true; 
		while(isAnony) {
			System.out.println("비밀번호를 입력하세요.");
			String input = sc.nextLine();
			if(input.equals(pw)) {
				System.out.println("로그인 되었습니다.");
				isAnony = false;
			}else {
				System.out.println("비밀번호를 다시 입력하세요.");
			}
		}
		
		
	}

	private static void studyWhile() {
		int num = 0;
		//무한반복문
		while(num < 5) {
			System.out.println("멈추지않아! 중요한 건 꺾이지 않는 마음");
			num++;
		}
	}

}
