package com.test011;

public class Main {

	public static void main(String[] args) {
		
		// Test Ŭ������ ��ü(instance) ���� �� �޼ҵ� ȣ��
	
		Test t = new Test();
		
		int result1 = t.method1();
		System.out.println(result1);
		
		String result2 = t.method2();
		System.out.println(result2);
		
		t.method3();  // void
		
	}

}
