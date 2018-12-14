package com.test094;

public class Main {

	public static void main(String[] arg) {

		// Outer Class의 객체 생성
		Outer outer = new Outer();
		
		outer.method();
		
		// 외부에서 접근 가능한 중첩 클래스의 객체 생성
		// ->Outer 클래스의 객체 생성 도움 없이 단독 객체 생성 가능
		Outer.Test test = new Outer.Test();
		test.method();
	}

}
