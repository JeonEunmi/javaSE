package com.test051;

public class Maltese extends SmallDog {
	
	//Dog, SmallDog 클래스의 기능(메소드)를 물려받는다.
	//->barking(), eating(), sleeping()
	
	//원하는기능(메소드) 추가 구현
	public void tagging() {
		System.out.println("영역 표시중..");
	}
}
