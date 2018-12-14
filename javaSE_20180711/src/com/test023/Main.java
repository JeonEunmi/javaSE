package com.test023;

public class Main {

	public static void main(String[] args) {
		// Test 클래스의 n1, n2, n3(instance) field 접근
		// ->Test  클래스의 객체(insatance) 생성 필요
		Test t = new Test();
		 
		// 필드값 읽기
		System.out.println(t.n1); // 0
		System.out.println(t.n2); // 0.0
//		System.out.println(t.n3); // private
		
		// 필드값 변경
		// -> 객체의 상태값을 외부에서 직접 변경하는 것을 권장하지 않는다.
		// 캡슐화 (Data hiding) 권장                                                                                                                
		t.n1 = 10;
		System.out.println(t.n1); //10
		
		//private n3 변수에 대한 getter, setter 접근
		t.setN3("TEST");
		System.out.println(t.getN3());  //TEST
		
	}

}
