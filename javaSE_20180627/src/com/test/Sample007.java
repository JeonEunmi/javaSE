package com.test;

public class Sample007 {

	public static void main(String[] args) {
		
		// float �ڷ���
		// �Ǽ� ����� �ڷ���
		// ���̻� F ǥ�� �ʿ�
		// �Ϲ������� �Ǽ� ��޽� double �ڷ����� �⺻���� ����Ѵ�.
		// �Ǽ� �ڷ� ����� ����Ȯ�� ����� ���� �� �ִ�. -> �޸� ���� ���
		// �Ǽ��� �Ϲ����� ���´� 0.123 ���� �����̴�.  -> �޸𸮿����� ������, �����η� �����ؼ� ����
		// ���� ǥ�� 5E7 �� 5*10^7�� ��Ÿ����.

		double a = 3.141592;		
		double b = 0.123456789012;
		
		double c = 2E-3F;  // 2*10^-3 , 0.002 �����߻�
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
