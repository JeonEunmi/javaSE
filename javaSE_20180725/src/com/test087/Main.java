package com.test087;

public class Main {

	public static void main(String[] args) {

		// 다중 인터페이스 구현 클래스
		// Sub 클래스의 객체 생성
		// -> 참조주소 저장하는 변수의 자료형은 인터페이스 권장

		Sub sub1 = new Sub();
		sub1.method1(); // Sub
		sub1.method2(); // Sub

		Super sub2 = new Sub();
		sub2.method1();
		sub2.method2(); 

		Super sub3 = new Sub();
		sub3.method1(); 
		sub3.method2();

		// 다중 인터페이스를 구현하면 위와 같은 멤버 접근 제한을 해결할 수 있다.

	}

}
