package com.test;

//실행 클래스(main 메소드 포함 클래스)
public class OOP012 {
	
	public static void main(String[] args) {
		// 사용자 정의한 클래스의 메소드 호출
		Test007 t = new Test007();
		// 산술 연산 과정을 메소드에 위임
		// -> 자료 제공
		// -> 결과값 반환
		int result = t.add(10, 20);
		System.out.println(result);
		
		// java.lang.Math 클래스의 random() 메소드를 이용해서 
		// 난수 획득
		System.out.println(Math.random());
	}

}
