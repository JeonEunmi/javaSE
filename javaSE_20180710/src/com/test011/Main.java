package com.test011;

public class Main {

	public static void main(String[] args) {
		
		// Test 클래스의 객체(instance) 생성 및 메소드 호출
	
		Test t = new Test();
		
		int result1 = t.method1();
		System.out.println(result1);
		
		String result2 = t.method2();
		System.out.println(result2);
		
		t.method3();  // void
		
	}

}
