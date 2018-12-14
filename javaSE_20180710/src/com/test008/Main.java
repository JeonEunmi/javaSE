package com.test008;

// 실행 클래스 -> 메인() 메소드만 구성
public class Main {

	public static void main(String[] args) {
			
		//Test 클래스의 plus() 메소드 호출
		//-> Test 클래스의 객체(instance) 생성 필요
		//->plus() 메소드 접근 가능
		Test t = new Test();
		
		//매개변수 형식에 맞게 자료 전달
		//->반환값 분석
		int result = t.plus(10, 20);
		System.out.println("더하기 : " + result);
		
		
		int result1 = t.substract(30, 10);
		System.out.println(result1);
	}

}
