package com.test047;

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
		
		// �б� ����
		System.out.println(t.getDept());
	}
}
