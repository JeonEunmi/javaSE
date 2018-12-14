package com.test005;

public class Main {

	public static void main(String[] args) {
		
		//Car 클래스의 객체 생성 및 필드 초기화
		
		//검정색을 가진 자동차 객체
		Car c1 = new Car("검정색");
		System.out.println(c1.color);
		System.out.println(c1.model);
		
		//흰색을 가진 자동차 객체
		Car c2 = new Car("흰색");
		System.out.println(c2.color);
		System.out.println(c2.model);
	}

}
