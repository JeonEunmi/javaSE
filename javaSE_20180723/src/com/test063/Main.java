package com.test063;

public class Main {

	public static void main(String[] args) {
		// Super 클래스의 객체 생성
		Super super1 = new Super();
		
		// toString() 메소드 호출
		// Super 객체의 정보 반환
		// -> com.test063.Super@7852e922
		System.out.println(super1.toString());
		
		// Sub 클래스의 객체 생성
		Sub sub1 = new Sub();
		
		// toString() 메소드 호출
		// -> 오버라이딩된 상태
		// -> Sub 클래스에서 오버라이딩된 메소드
		System.out.println(sub1.toString());
		
		// toString() 메소드만 호출시 생략 가능
		System.out.println(sub1);
		
		// 대표적인 toString() 메소드 호출 예
		// -> String, Integer 클래스
		// -> 오버라이딩된 상태
		String s1 = new String("TEST");
		System.out.println(s1.toString());  //TEST
		Integer i1 = new Integer(10);
		System.out.println(i1.toString());  //10
	}

}
