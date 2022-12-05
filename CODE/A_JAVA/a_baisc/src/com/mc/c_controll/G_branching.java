package com.mc.c_controll;

import java.util.Scanner;

public class G_branching {
	
	// break : 반복문에서 즉시 탈출
	// continue : 실행코드 안에서 continue를 만날 경우 즉시 반복문의 조건식으로 이동

	public static void main(String[] args) {
		
		// 사용자로부터 문자열을 입력받아 출력하는 반복문을 작성하라
		// 사용자로부터 end 라는 문자열을 입력받을 경우 반복문은 멈춘다.
		
		//whileEx();
		//whileEx2();
		//whileEx3();
		
		
		// 1에서 10까지 정수들의 합계를 반복을 사용해서 구하시오.
		// 단 4의 배수는 제외하고 합산하시오.
		
		int sum = 0;
		
		for(int i = 1; i < 11; i++) {
			if(i % 4 == 0) continue;
			sum += i;
		}
		
		System.out.println(sum);
		
		
		
		
		
	}

	private static void whileEx3() {
		Scanner sc = new Scanner(System.in);
		boolean flg = true;
		
		
		
		while(flg) {
			System.out.println("메세지를 입력하세요.");
			String message = sc.nextLine();
			
			if(!message.equals("end")) {
				System.out.println(message);
				continue;
			}
			System.out.println("프로그램을 종료합니다.");
		
		
		}
	}

	private static void whileEx2() {
		Scanner sc = new Scanner(System.in);
		boolean flg = true;
		
		while(flg) {
			System.out.println("메세지를 입력하세요.");
			String message = sc.nextLine();
			
			if(message.equals("end")) {
				System.out.println("프로그램을 종료합니다.");
				flg = false;
				
				//return : 반복문 뿐만 아니라, 반복문이 사용된 메서드를 멈추고 호출부로 돌아간다.
				break; // 즉시 반복문만 탈출
			}
			
			System.out.println(message);
		}
	}

	private static void whileEx() {
		Scanner sc = new Scanner(System.in);
		boolean flg = true;
		int i = 0;
		
		while(flg) {
			String message = sc.nextLine();
			
			if(i == 4) {
				System.out.println("비밀번호 입력횟수 초과로 인해 프로그램 종료됩니다.");
				flg = false;
			}else {
				if(!message.equals("end")) {
					System.out.println(message);
					i++;
				}else {
					System.out.println("프로그램을 종료합니다.");
					flg = false;
					
				}
			}
			
		}
	}
}
