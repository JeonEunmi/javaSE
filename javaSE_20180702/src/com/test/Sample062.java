package com.test;

public class Sample062 {

	public static void main(String[] args) {
		// ������ �������� == ����
		
		String a = "TEST";
		
		String b = "HELLO";
		// ���� b�� ������ �ִ� �����ּҸ� ���� c�� �Ҵ�
		String c = b;
		
		System.out.println(b);
		System.out.println(c);
		
		// ������ �������� == ���� ����� �����ּҸ� ���Ѵ�.
		System.out.println(a == b);
		System.out.println(b == c);
	}

}
