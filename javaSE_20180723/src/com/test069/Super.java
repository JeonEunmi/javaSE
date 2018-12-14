package com.test069;

public class Super {

	// 접근제한자별 상속 및 오버라이딩
	
	// 상속 불가(오버라이딩 불가)
	private void method1() {
		
	}

	// 다른 패키지에서 접근 불가
	// 상속 불가(오버라이딩 불가)
	void method2() {
		
	}
	
	// 다른 패키지에서 접근시 자식 클래스에서만 접근 가능
	// 상속 가능(오버라이딩 가능)
	protected void method3() {
		
	}
	
	// 상속 가능(오버라이딩 가능)
	public void method4() {
		
	}
}
