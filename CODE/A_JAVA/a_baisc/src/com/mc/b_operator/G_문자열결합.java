package com.mc.b_operator;

public class G_문자열결합 {

	public static void main(String[] args) {
		
		String name = "권용구";
		String job = "학생";
		
		String res = "이름은 " + name + "입니다. \n직업은 " + job + " 입니다.";
		System.out.println(res);
		
		// 문자열과 숫자값을 결합할 때
		// + 의 피연산자 중 하나라도 문자열이면 문자열 결합이 수행됨
		System.out.println(10 + "호 기차");
		System.out.println(10 + 123123 + "호 기차");
		System.out.println("이번 기차는 " + 10 + 23 + "호 입니다."); // 1023호
		System.out.println("이번 기차는 " + (10 + 23) + "호 입니다.");//33호
	}

}
