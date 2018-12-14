package com.test093;

public class Main {

	public static void main(String[] args) {

		// Outer Class의 객체 생성
		// -> 추상 클래스이므로 직접 객체 생성 불가

		// Cannot instantiate the type Outer
		// Outer outer = new Outer();

		// Anonymous Inner Class
		// -> 물리적인 저장(.java)이 되지 않는다.
		Outer outer = new Outer() {

			@Override
			public void method2() {
				System.out.println("추상 메소드에 대한 오버라이딩 구현");

			}

		};
		
		outer.method1();
		outer.method2();
	}

}
