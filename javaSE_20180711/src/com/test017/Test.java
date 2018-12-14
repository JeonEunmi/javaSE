package com.test017;

public class Test {
	
	// 접근제한자
	// 클래스, 메소드, 필드 모두 적용 가능
	// -> 객체 지향 특징 중 하나인 캡슐화 구현
	/*
	Visible to the package, the default. No modifiers are needed.
	Visible to the class only (private).
	Visible to the world (public).
	Visible to the package and all subclasses (protected)
	*/
	
	// default - 같은 패키지 내에서만 접근 가능
	void method() {
	
		// 같은 클래스 내에서 다른 (instance) 메소드 호출
		this.method2();
		this.method3();
		this.method4(); 
		
		//this. 는 생략 가능하지만, 같은 클래스의 다른 메소드를 호출한다는 의미
		// static에는 this. 를 붙일 수 없다. instance와 static과의 차이점
		
	}
	
	// private - 같은 클래스 내에서만 접근 가능
	private void method2() {
		
		this.method2();
		this.method3();
		this.method4(); 
		
	}
	
	// public - 다른 패키지 내에서도 접근 가능
	public void method3() {
		
	}
	
	// protected - 같은 패키지 내 + 상속 관계인 경우 접근 가능
	protected void method4() {
		
	}
}
