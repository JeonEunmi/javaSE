package com.test050;

public class Main {

	public static void main(String[] args) {

		// �ڽ� ���� Ŭ������ Sub Ŭ������ ��ü(instance) ����
		Sub sub = new Sub();

		// Sub Ŭ������ ������ ���(�޼ҵ�)�� ������
		// �θ� ���� Ŭ������ ����� ����� �� �ִ�.
		// toString() -> Object Ŭ������ �޼ҵ�
		// -> �ڵ� ȣ�� -> ���� ����
		System.out.println(sub.toString());
		System.out.println(sub);
		
		//�ڱ⸸�� ���(�޼ҵ�) ȣ�� ����
		sub.method();
	}
}
