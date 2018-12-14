package com.test080;

public class Super implements Cloneable{

	// Object 클래스의 멤버를 사용할 수 있다.
	// ->toString(), equals(), clone(), ...
	
	// 현재 객체의 상태값에 대한 사본 객체 생성
	// 기본 자료형 상태값 -> 값 복사
	// 참조 자료형 상태값 -> 참조주소 복사 (얕은 복사)
	/*
	protected Object clone()
            throws CloneNotSupportedException
    */
	
	private int a;
	
	public Super() {
		
	}
	
	public Super(int a) {
		this.a = a;
	}
	
	public int getA() {
		return this.a;
	}
	
	public void setA(int a) {
		this.a = a;
	}

	// 얕은 복사
	public Super getCopy() throws CloneNotSupportedException {
		return (Super) this.clone(); 
	}
	
	
}
