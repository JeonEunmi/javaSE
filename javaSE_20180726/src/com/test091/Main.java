package com.test091;

public class Main {

	public static void main(String[] arg) {

		// Outer Class의 객체 생성
		Outer outer = new Outer();

		// Outer Class 객체의 인스턴스 멤버 접근
		// -> Inner Class의 객체 생성 과정 및 인스턴스 멤버 접근 실행
		outer.method();

		// Inner Class의 객체 생성
		// Inner inner = new Inner(); // private
		// Inner Class 객체의 인스턴스 멤버 접근
		// inner.method();
		
		// 외부에서 접근 가능한 중첩 클래스의 객체 생성시에만 사용
		Outer outer2 = new Outer();
		Outer.Test test = outer2.new Test();
		// 한 줄로도 표현 가능하다.
		Outer.Test test2 = new Outer().new Test();
		
		test.method();
	}

}
