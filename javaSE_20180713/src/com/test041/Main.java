package com.test041;

public class Main {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		System.out.println(t.toString());
		// ���� ������ �� ��ü�� ���� -> ���� ��ü�� ������ ��ü�� �ȴ�.
		// -> �������÷����� ���� �ۼ��̵ȴ�.
		
		t = new Test();
		System.out.println(t.toString());
		
		// ������ �÷��� ����� ȣ��
		// �Ҹ��� �ڵ� ȣ��
		//->������ ��ü �Ҹ� �۾�
		System.gc();
	}

}
