package com.test112;

// 제네릭 지원 클래스 선언
// 클래스 선언시 클래스명 뒤에 <타입파라미터> 추가
// 타입 파라미터는 알파벳 대문자 한 글자(예를 들어 E, T, K, V)로 표현
public class Box<T> {
	
	// 내부에서 자료형으로 필요로 하는 부분에 T로만 표현한다.
	// -> 객체 생성시 사용자가 지정한 자료형(예를 들어 String)으로 변하게 된다.
	private T t;

	public Box() {
	}

	public Box(T t) {
		this.t = t;
	}

	public T getT() {
		return this.t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	

}
