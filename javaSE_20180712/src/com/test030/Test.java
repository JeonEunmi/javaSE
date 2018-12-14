package com.test030;

public class Test {

	// 메소드 오버로딩(Method Overloading) - 유사한 기능을 여러가지 작성할때
	// 메소드 이름, 매개변수 자료형, 매개변수 갯수가 일치하는 메소드가 여러개 선언된다.
	// 예를 들어, println() 메소드는 메소드 오버로딩 상태이다.
	
	//접근제한자, 반환자료형은 상관없다
	//메소드 이름은 같아야 한다.
	//매개변수 구성은 달라야 한다.
	public void test(String a) {
		System.out.println(10);  //int
		System.out.printf("%s", "TEST");   //String 
	}
	
	public void test(int a) {
		System.out.println(a); //int
	}
}
