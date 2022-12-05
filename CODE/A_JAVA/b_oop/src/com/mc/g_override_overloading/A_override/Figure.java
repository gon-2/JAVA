package com.mc.g_override_overloading.A_override;

public class Figure {
	
	private String privateTest = "private 변수도 상속이 안된다";
	
	public double calArea() {
		return 0.0;
	}
	
	private void testExtends() {
		System.out.println("private 메서든느 상속이 안됩니다.");
	}

	
	public static void testStaticExtends() {
		System.out.println("static 메서드는 상속이 안된다.");
	}
}
