package com.test023;

public class Test {
	
	//접근제한자
	//클래스, 메소드(생성자), 필드 모두 적용 가능
	//->객체 지향 특징 중 하나인 캡슐화(외부로부터의 접근 제한) 구현
	/*
	Visible to the package, the default. No modifiers are needed.
	Visible to the class only (private).
	Visible to the world (public).
	Visible to the package and all subclasses (protected).
	*/
	
	//field - 필드. 객체의 상태값 저장용 변수. Global. 자동 초기화.

	//default - 같은 패키지 내에서만 접근 가능 
	int n1;

	//public - 다른 패키지에서도 접근 가능
	public double n2;
	
	//private - 같은 클래스 내에서만 접근 가능. 권장.
	private String n3;
	
	public void method() {
		//(instance) field 접근
		System.out.println(this.n1); //0
		System.out.println(this.n2); //0.0
		System.out.println(this.n3); //null
	}
	
	
	//private field에 대한 외부 접근을 도와주는 getter, setter 메소드 추가
	/*
	public 반환자료형 getXXXX() {
		return 반환값;
	} 
	public void setXXXX(자료형 변수) {
		this.변수 = 변수;
	} 
	*/
	public String getN3() {
		return this.n3;
	}
	public void setN3(String n3) {
		this.n3 = n3;
	}
	
}
