package com.test;

public class Sample015 {

	public static void main(String[] args) {
		
		// ������
		// �� ������
		// -> ����� true or false
		// ==, !=, >, <, >=, <=
		
		int a = 10;
		int b = 20;
		
		System.out.println(a == b);   // false
		System.out.println(a != b);   // true
		System.out.println(a > b);    // false
		System.out.println(a < b);    // true
		System.out.println(a >= b);   // false
		System.out.println(a <= b);   // true
		
		// �Ǽ� �� ����� ����! 
		// �� ����� �ڷ����� �ٸ� ��� ����ȯ �������� ���е��� ������
		// �ս��� �߻��� �� �־� ��Ȯ�� ����� ������ ���� �� �ִ�.
		
		double c = 0.1;
		float d = 0.1f;
		
		System.out.println(c == d);   // �޸� �� ���� ������ �� ���� �߻�
		System.out.println((float)c == d);
		System.out.println(c == (double)d); // float�� double�� �ٲ�� �������� �ս� �߻�
	}

}

 