package com.test117;

// 제네릭 클래스가 부모 클래스인 경우
// 자식 클래스는 동일한 제네릭 표현 지정 필수
// 또는 타입파라미터 확장 가능
public class SmallBox<T, M> extends Box<T>{

	// 추가된 타입파라미터 구성
	private M m;

	public SmallBox() {

	}
	
	public SmallBox(M m) {
		super();
		this.m = m;
	}


	public M getM() {
		return this.m;
	}

	public void setM(M m) {
		this.m = m;
	}
	
	
}
