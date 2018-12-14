package com.test089;

public class Main {

	// 매개변수를 인터페이스 자료형 변수로 선언
	// -> 매개변수 다형성
	// ->Soundable 인터페이스 구현 객체라면 아무거나 대입 가능
	
	public static void main(String[] args) {
		SubMain.printSound(new Cat());
		SubMain.printSound(new Dog());
		
	}

}
