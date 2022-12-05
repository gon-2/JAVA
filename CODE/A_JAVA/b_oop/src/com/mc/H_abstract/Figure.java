package com.mc.H_abstract;

// 추상클래스
//추상메섣,가 0개이상 존재한느 클래스이다
//추상메서드가 존재한다면 반드시 추상클래스로 만들어야 한다.

//추상클래스는 미완성의 클래스이기 때문에. 인스턴스화가 불가능하다
//추상클래스를 상속받은 자식클래스는 추상메서드를 Overrie함으로써 추상클래스를 완성시킨다

public abstract class Figure {
	
	
	//추상메서드
	//abstract : 미완의, 추상의
	//Figure클래스를 상속받는 클래스에서는 반드시 calArea메서드르르 Override해야만 한다.
	//어떤 용도로 쓰이냐면 도형마다 넓이를 구하는 공식이 있지만 그 공식의 내용은 모두 다르기 때문에
	// Figure 클래스를 상속받는 모든 자식 클래스에서 규칙을 재정의 하도록 강제한다.
	public abstract double calArea() ;

	
	
}
