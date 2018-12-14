package com.test017;

public class Main {
	
	public static void main(String[] args) {
		
		// 같은 패키지, 다른 클래스에서 (instance) 메소드 호출
		// -> 객체(instance) 생성 필요
				
		Test t = new Test();
				
		t.method();
		// t.method2(); // private , 같은 클래스 내에서만 보인다.
		t.method3();
		t.method4();
	}

}
