package com.test084;

public class Main {

	public static void main(String[] args) {

		// 익명 구현 객체
		// -> 명시적인 구현 클래스(class) 없이 바로 구현 객체(instance) 사용
		// -> 오버라이딩 메소드 구현 후 한시적으로 사용할 때 작성한다.
		Super s2 = new Super() {

			@Override
			public void method() {
				System.out.println("익명 구현 객체");
			}
			
		};
		
		s2.method();
		
		// 대표적인 익명 구현 객체 사용은 정렬 기능
		// -> Arrays.sort()
	}

}
