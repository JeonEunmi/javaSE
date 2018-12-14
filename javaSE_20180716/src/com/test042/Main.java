package com.test042;

public class Main {

	
	public static void main(String[] args) {
				
		// 객체 생성 과정 없이 정적 멤버 접근 가능
		
		System.out.println(Test.getDept());
		
		Test t1 = new Test("HONG"); // instance를 불러오기 위해 new 연산자를 이용한 객체 생성
		System.out.println(t1.getName()); // instance 표현 방법
		System.out.println(t1.getDept()); // static 권장하지 않는 표현, but 오류발생은 하지 않는다.
		System.out.println(Test.getDept()); // 권장하는 표현

	}

}
