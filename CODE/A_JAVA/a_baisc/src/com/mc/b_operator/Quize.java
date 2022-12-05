package com.mc.b_operator;

import java.util.Scanner;

public class Quize {

   public static void main(String[] args) {
      //q1();
      q2();
      //q3();
   }

   private static void q3() {
      //q3. 사용자가 입력한 정수가 짝수 인지 판단하고
      //짝수라면 '짝수 입니다.'
      //홀수라면 '홀수 입니다.' 를 출력하세요. 
	  //짝수 홀수 구분 방법은 2로 나누었을때 나머지가 1이면 홀수 0이면 짝수이다.
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt(); // 입력된 수
      
      
   }

   
   private static void q2() {
      //q2. 사용자로 부터 아이디와 비밀번호를 입력받아
      // 사용자가 알맞은 아이디와 비밀번호를 입력하였다면, '로그인 되었습니다'를 출력하고
      // 아이디와 비밀번호가 맞지 않다면 '누구야 당신?' 을 출력하세요
      // 아이디 : test / 비밀번호 : java
      
      //사용자로부터 아이디와 비밀번호를 입력받는다.
      Scanner sc1 = new Scanner(System.in);  
      System.out.print("id: ");
      String input1 = sc1.nextLine();
      
      Scanner sc2 = new Scanner(System.in);  
      System.out.print("pw: ");
      String input2 = sc2.nextLine();
      
      
      
      
      
   }

   private static void q1() {
      // q1. 사용자로 부터 사다리꼴의 윗변, 아랫변, 높이를 입력받아 넓이를 구하시오 
      //사용자로 부터 정수를 하나 입력 받으세요
      Scanner sc1 = new Scanner(System.in);
      Scanner sc2 = new Scanner(System.in);
      Scanner sc3 = new Scanner(System.in);
      
      System.out.print("윗변을 입력하세요: ");
      int num1 = sc1.nextInt();
      System.out.println();
      
      System.out.print("아랫변을 입력하세요: ");
      int num2 = sc2.nextInt();
      System.out.println();
      
      
      System.out.print("높이를 입력하세요: ");
      int num3 = sc3.nextInt();
      System.out.println();
      
      System.out.println("사다리꼴의 넓이는 : " + (num1 + num2) * num3 / 2 + "입니다.");
   }

}