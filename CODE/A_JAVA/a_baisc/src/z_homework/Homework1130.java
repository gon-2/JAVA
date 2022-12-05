package z_homework;

import java.util.Scanner;

public class Homework1130 {

	public static void main(String[] args) {

		// q1();
		// q2();
		// q3();
//		q5();

//		q6();

		q7();
//		q8();
//		gameResult(p1,p2);

	}
	
	private static void gameResult(String p1, String p2) {
		String msg = "";
		
		
		if(p1.equals(p2)) {
			System.out.println("비겼습니다.");
			return;
		}
		
		if(p1.equals("가위") && p2.equals("보")) {
			System.out.println("이겼습니다.");
		}else if (p1.equals("바위") && p2.equals("가위")) {
			System.out.println("이겼습니다.");
		}else if(p1.equals("보") && p2.equals("바위")) {
			System.out.println("이겼습니다.");
		}else {
			System.out.println("졌습니다.");
		}
	
	}
	

	private static void q8() {
		Scanner sc = new Scanner(System.in);
		
		
		int win = 0;
		int lose = 0;
		int semi = 0;
		
		while(win <2 && lose < 2) {
			System.out.print("1P :" );
			String p1 = sc.next();
			System.out.print("2P : ");
			String p2 = sc.next();
			
			//p1, p2 : 전달인자 gameResult에 사용자로부터 입력받은 패를 전달
			gameResult(p1, p2);
		}
		
		
	}

	private static void q7() { // 피라미드 만들기 정방향 역방향
		// *
		// ***
		// *****
		// *******
		// *********
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하거라:");
		int cnt = sc.nextInt();

		System.out.println("방향(+ , -) : ");
		String dir = sc.next();

		switch (dir) {
		case "+":
			int n = cnt - 1;

			for (int i = 0; i < cnt; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(" ");
				}

				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.print("*");
				}
				n--;
				System.out.println();
			}

			break;
		case "-":
			int n2 = cnt;

			for (int i = 0; i < cnt; i++) {

				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}

				for (int j = 0; j < 2 * n2 - 1; j++) {
					System.out.print("*");
				}

				n2--;
				System.out.println();
			}

			break;
		default:
			System.out.println("기호가 이상합니다.");
			break;
		}

	}

	private static void q6() { // 다이아 만들기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요.");
		int cnt = sc.nextInt();
		int n = cnt - 1;
		int n2 = cnt;

		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			n--;
			System.out.println();
		}
		
		for (int i = 0; i < cnt; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * n2 - 1; j++) {
				System.out.print("*");
			}

			n2--;
			System.out.println();
		}

	}

	private static void q5() {
		// 사용자로부터 숫자와 방향(+,-) 를 입력받아
		// 사용자가 입력한 방향에 따라 삼각형 밑변의 위치를 다르게 출력하시오.
		//
		// 출력예시
		// 숫자 : 4
		// 방향(+ 또는 -) : -
		// ****
		// ***
		// **
		// *

		// 사용자로 부터 정수를 하나 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int cnt = sc.nextInt();
		System.out.print("방향(+ 또는 -) : ");
		String dir = sc.next();

		if (dir.equals("+")) {
			for (int i = 0; i < cnt + 1; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (dir.equals("-")) {
			for (int i = 0; i < cnt + 1; i++) {
				for (int j = cnt; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("올바른 방향을 입력해주세요");
		}
	}

	private static void q4() {

		// 사용자로부터 다운로드 받을 프로그램 갯수를 입력받아
		// 다운로드 진행창을 출력하시오

		// 사용자로부터 다운로드 받을 프로그램의 개수 입력받는다.
		// [출력양식]
		// n번째 프로그램 다운로드 받습니다.
		// 0% 진행중...
		// 20% 진행중...
		// 40% 진행중...
		// 60% 진행중...
		// 80% 진행중...
		// 100% 진행중...
		// n번째 프로그램 다운로드 완료되었습니다.
		// -------------------------------
		// 모든 프로그램 다운로드 완료

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(i + "번째 프로그램 다운로드 받습니다.");
			for (int j = 0; j <= 100; j += 20) {

				System.out.println(j + "% 진행중");

			}
			System.out.println(i + "번째 프로그램 다운로드 완료되었습니다.");
		}

		System.out.println("---------------------------");
		System.out.println("모든 프로그램 다운로드 완료");

	}

	private static void q3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int input = sc.nextInt();

//		for (int i = 1; i < input + 1; i++) { // 가로
//			for (int j = 1; j < input + 1; j++) {   //세로
//				if(j == i) {
//					System.out.print(i);
//					break;
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}

		for (int i = 0; i < input; i++) {
			for (int a = 0; a < i; a++) {
				System.out.print("*");
			}
			System.out.println(i + 1);
			System.out.println();
		}

	}

	private static void q2() {
		// 사용자로부터 정수를 하나 입력받아
		// 사각형을 별로 그리는 데, 대각선에는 숫자를 출력하시오
		// 숫자는 1~사용자가 입력한 숫자까지.

		// 출력 예시
		// 숫자 : 4
		// 1***
		// *2**
		// **3*
		// ***4
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int column = sc.nextInt(); // 5

//		for(int i = 1; i < (column+1); i++) { //가로
//	           // 앞에 * 넣기
//	            for (int v = 1; v < i; v++) { // 세로
//	                System.out.print("*");
//	            }
//	            // 숫자 넣기
//	            System.out.print(i);
//	            // 뒤에 * 넣기
//	           for (int j = i; j < column; j++) { // 숫자뒤에 들어가는 별
//	              System.out.print("*");
//	           }
//	           System.out.println();
//	        }
		for (int i = 0; i < column; i++) {

			for (int j = 0; j < column; j++) {
				if (i != j) {
					System.out.print("*");
				} else {
					System.out.print(i + 1);
				}
			}
			System.out.println();
		}

	}

	private static void q1() {
		// 사용자로부터 줄 수와 칸수를 입력받아서
//	    사각형을 별로 그리는 이중반복문 작성하시오

//	    출력예시
//	      줄 수 : 3
//	      칸 수 : 4
//	      ****
//	      ****
//	      ****
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수를 입력하세요");
		int row = sc.nextInt();
		System.out.print("칸 수를 입력하세요");
		int column = sc.nextInt();

		for (int j = 0; j < column; j++) {
			for (int i = 0; i < column; i++) {
				System.out.print("* ");
			}

			System.out.println();

		}
	}

}
