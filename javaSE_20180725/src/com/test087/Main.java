package com.test087;

public class Main {

	public static void main(String[] args) {

		// ���� �������̽� ���� Ŭ����
		// Sub Ŭ������ ��ü ����
		// -> �����ּ� �����ϴ� ������ �ڷ����� �������̽� ����

		Sub sub1 = new Sub();
		sub1.method1(); // Sub
		sub1.method2(); // Sub

		Super sub2 = new Sub();
		sub2.method1();
		sub2.method2(); 

		Super sub3 = new Sub();
		sub3.method1(); 
		sub3.method2();

		// ���� �������̽��� �����ϸ� ���� ���� ��� ���� ������ �ذ��� �� �ִ�.

	}

}
