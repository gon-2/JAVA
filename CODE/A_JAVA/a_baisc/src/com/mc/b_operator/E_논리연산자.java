package com.mc.b_operator;

public class E_논리연산자 {

	public static void main(String[] args) {
		
		// 논리연산자 : &&, ||
		// && : 두 항이 모두 true일때 true, ~이면서, 그리고, and
		// || : 두 항이 모두 false일때 false 두 항중 한 항이 true이면 true이다, 또는, ~거나, or
		
//		System.out.println(2 >= 2 || 2 > 3); // true || false == true
//		System.out.println(2 > 1 || 3 > 2);  // true || true == true
//		System.out.println(2 > 3 || 2 > 3);  // false || false == false
//		System.out.println(2 > 2 || 2 < 3);  // false || true == true 
//		
//		System.out.println(2 >= 2 && 2 > 3); // true || false == false
//		System.out.println(2 > 1 && 3 > 2);  // true || true == true
//		System.out.println(2 > 3 && 2 > 3);  // false || false == false
//		System.out.println(2 > 2 && 2 < 3);  // false || true == false
		
		
		boolean a = true;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		
		// 아래 논리연산의 출력값을 예상해 보세요
		System.out.println(a || b && c || d); // true
		System.out.println( ( a || b ) && ( c || d ) ); // false
		
		// 왼쪽부터 연산을 수행해보면
		// true || false == true
		// true && false == false
		//false || false == false
		
		// false(b) && false(c) \\ false
		// true(a) || false(b) == true
		//true || false == true
		
		// 따라서 연산 결과는 true
		
	}
}
