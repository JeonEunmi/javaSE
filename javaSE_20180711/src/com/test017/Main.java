package com.test017;

public class Main {
	
	public static void main(String[] args) {
		
		// ���� ��Ű��, �ٸ� Ŭ�������� (instance) �޼ҵ� ȣ��
		// -> ��ü(instance) ���� �ʿ�
				
		Test t = new Test();
				
		t.method();
		// t.method2(); // private , ���� Ŭ���� �������� ���δ�.
		t.method3();
		t.method4();
	}

}
