package com.test030;

public class Test {

	// �޼ҵ� �����ε�(Method Overloading) - ������ ����� �������� �ۼ��Ҷ�
	// �޼ҵ� �̸�, �Ű����� �ڷ���, �Ű����� ������ ��ġ�ϴ� �޼ҵ尡 ������ ����ȴ�.
	// ���� ���, println() �޼ҵ�� �޼ҵ� �����ε� �����̴�.
	
	//����������, ��ȯ�ڷ����� �������
	//�޼ҵ� �̸��� ���ƾ� �Ѵ�.
	//�Ű����� ������ �޶�� �Ѵ�.
	public void test(String a) {
		System.out.println(10);  //int
		System.out.printf("%s", "TEST");   //String 
	}
	
	public void test(int a) {
		System.out.println(a); //int
	}
}
