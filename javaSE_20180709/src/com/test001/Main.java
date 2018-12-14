package com.test001;

//실행 클래스
public class Main {
	public static void main(String[] args) {
		
		// 같은 패키지 내에 있는 클래스의 멤버 접근
		
		//public 키워드 있는 클래스의 객체
		Sample a = new Sample();
		a.msg();
		
		//public 키워드 없는 클래스의 객체
		Test b = new Test();
		b.msg();
		
	}
}
