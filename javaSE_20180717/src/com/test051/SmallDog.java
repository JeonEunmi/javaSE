package com.test051;

public class SmallDog extends Dog {

	// Dog 클래스의 기능(메소드)을 물려받는다.
	// ->barking()
	
	//원하는 기능(메소드) 추가 구현
	public void eating() {
		System.out.println("먹는중..");
	}
	
	public void sleeping() {
		System.out.println("자는중..zz");
	}
}
