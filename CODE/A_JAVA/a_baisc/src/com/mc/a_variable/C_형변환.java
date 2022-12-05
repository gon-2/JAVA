package com.mc.a_variable;

public class C_형변환 {
	public static void main(String[] args) {
		
		// 자동 형변환
		char ch = 'A';
		System.out.println("ch : " + ch);
		
		int i = ch;
		System.out.println("i : " + i);
	
		// 강제 형변환
		// 형변환을 하면 데이터가 손실될 위험이 있을경우, 자동형변환이 지원되지 않는다.
		
		// * 데이터 손실이 발생하는 경우 혹은 언제 발생하느냐?
		// 1) 크기가 큰 타입의 값을 크기가 작은 타입의 변수에 할당하려고 할 떄 데이터 손실이 발생
		// 2) 실수타입의 값을 정수타입의 변수에 할당하려고 할 때 데이터 손실이 발생
		// 	  정수타입의 변수는 소수부의 값을 보관할 수 없기 때문에, 버림처리 한다.
		
		
		
		
		int inum = 128;
		byte bnum = (byte) inum;
		System.out.println(bnum);
		
		
		
		
		
	}
}
