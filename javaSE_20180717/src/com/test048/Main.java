package com.test048;

public class Main {

	public static void main(String[] args) {

		// final field -> ���� �Ұ� �׸�

		// �ʱ�ȭ
		Test t = new Test();

		// ���� ����
		t.setName("HONG");
		
		// �б� ����
		System.out.println(t.getName());

		// ���� �Ұ�
		// t.setDept("TEST");
		
		// ��� 
		// ��ü(instance) ������ �����ϰ� �б� ����
		System.out.println(Test.DEPT);
		
		//��ǥ���� ����� �ִ밪, �ּҰ� ǥ��
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Math.PI);
		
	}
}
