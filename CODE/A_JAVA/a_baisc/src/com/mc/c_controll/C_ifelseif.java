package com.mc.c_controll;

import java.util.Scanner;

public class C_ifelseif {

	public static void main(String[] args) {
		// 다중 조건문
		// 표현식
		//if(조건식){실행코드}
		//else if(조건식){실행코드}
		//else if(B조건식){실행코드} -> A조건식에 일치하지 않는 경우 중에서 B조건식이 참인 경우 실행코드를 수행
		//else if(C조건식){실행코드}
		//else if(D조건식){실행코드}
		//else if(E조건식){실행코드}
		//else{실행코드}
		
		//testIfElseIf();
		//q2();
		q3();
		
		
		
		
		
		
		
		
	}
	
	  // 1P유저로부터 가위바위보 중 하나를 입력받으세요
	   // 2P유저로부터 가위바위보 중 하나를 입력받으세요.
	   // 1P유저기준에서 승/패/비김 여부를 출력해주세요.
	   
	   private static void q3() {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("1P :" );
	      String p1 = sc.next();
	      System.out.print("2P : ");
	      String p2 = sc.next();
	   }

	private static void q2() {
		//  사용자로 부터 점수를 입력 받아 등급을 출력하세요
		//   90점 이상이면 A
		//   80점 이상 90점 미만이면 B
		//   70점 이상 80점 미만이면 C
		//   60점 이상 70점 미만이면 D
		//   60점 미만이면 F 로 등급입니다.
		
		// 이때 F가 아닌경우 점수가 반올림 했을 때 올림처리 되는 경우에는 (1의자리수가 5 이상이라면) 등급뒤에 +를 붙혀라
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		String grade = "";
		
		if(score >= 95) {
			grade = "A";
		}else if(80 <= score && score < 90) {
			grade = "B";
		}else if(70 <= score && score < 80) {
			grade = "C";
		}else if(60 <= score && score < 70) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		// 1의 자리가 5 이상이면 반올림인데 이때 점수를 10 으로 나누고난 뒤 나머지가 5 이상이면 +를 더해주면된다
		if(score % 10 >= 5) {
			grade += "+";
		}
		
		System.out.println("당신의 등급은 " + grade + "입니다.");
		sc.close();
	}

	private static void testIfElseIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를하나 입력하세요.");
		int input = sc.nextInt();
		
		String comment = "";
		
		if(input > 0) {
			comment = "양수";
		}else if(input < 0) {
			comment = "음수";
		}else {
			comment = "0";
		}
	}

}
