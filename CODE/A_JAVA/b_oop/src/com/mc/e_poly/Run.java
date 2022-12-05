package com.mc.e_poly;



public class Run {

	
	// 다형성 : 객체를 여러 타입으로 다루는 것
	// 상속을 통해서 부모 클래스의 타입을 물려받기 때문
	// 상속 : 메서드, 속성,타입
	public static void main(String[] args) {
		
		//제조사, 상품명, 가격,inch(크기)
		Desktop desktop = new Desktop("삼성", "울트라",2000000,"intel",16,true);
		
		// 제조사, 상품명, 가격,cpu,ram,통신사
		SmartPhone smartPhone = new SmartPhone("사과", "아이폰", 1300000, "긱벤치", 8, "SKT");
		
		// 제조사, 상품명, 가격,cpu,ram,일체여부
		TV tv = new TV("LG", "LG티비", 3000000, 75);
		
		
		
		Product[] products = {desktop,smartPhone,tv};
		for(int i = 0; i < products.length; i++) {
			System.out.println("아이아이아이" + products[i]);
		}
		
		System.out.println(desktop.toString());
		System.out.println(smartPhone); // 레퍼런스를  println에 넣으면 자동으로 toString을 호출함
		System.out.println(tv);

	}
}
