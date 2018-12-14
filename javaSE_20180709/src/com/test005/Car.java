package com.test005;

//자동차 클래스
public class Car {

	//필드 구성
	//-> 자동차의 state 분석 -> 모델명, 회사, 색상, ...
	String model = "그랜저";
	String company = "현대자동차";
	
	//다양한 색상 지정 필요
	//-> 객체 생성시 결정되도록 한다.
	String color;	//null
	
	//생성자(메소드)에 의한 필드 초기화
	//외부에서 전달 받은 매개변수로 내부 필드의 상태값을 덮어씌운다.
	public Car(String color) {
		this.color = color;   //필드 = 매개변수;
	}
}
