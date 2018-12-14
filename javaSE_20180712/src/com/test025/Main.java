package com.test025;

public class Main {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		//반환자료형이 void인 경우 출력문, 대입문 사용 불가
		t.setA(10);
		
		//반환자료형이 void가 아닌 경우 출력문, 대입문 사용 가능
		System.out.println(t.getA());
		
		t.method1();
		t.method2(10);
		t.method3("TEST");
		
		//매개변수 자료형(String)과 다른 자료형(int)을 가진 값 전달 -> 적용불가
		t.method3(Integer.toString(10));
		//t.method2(Integer.parseInt("T"));
		//t.method3(String.valueOf(10));
		
		//매개변수 목록과 일치하는 값(갯수, 자료형, 순서)을 보내야 한다.
		//t.method4(10);
		t.method4(10, 20);
		//t.method4(10, 20, 30);
		
		//가변 매개변수 사용시(자료형은 동일, 갯수만 조절가능)
		t.method5(10);
		t.method5(10, 20);
		t.method5(10, 20, 30);
		
	}
}
