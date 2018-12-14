package com.test003;

public class Car {

	//필드(field) 구성
	//->자동차의 state 분석 -> 모델명, 회사, 색상, ...
	
	//Car 객체(instance)의 상태가 고정된 상태
	//->Private 접근제한자 생략된 상태 -> 외부 접근 가능
	String model = "그랜저";
	String company = "현대자동차";
	String color = "black";
	
	//초기화 자료를 외부에서 공급 받는다. -> 생성자 or setter
	//Car 객체(instance)의 상태를 원하는 상태로 설정 가능
	
	
}
