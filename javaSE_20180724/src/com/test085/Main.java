package com.test085;

public class Main {

	public static void main(String[] args) {

		// ���� Ŭ���� ��ü ���� �� ������ �����ּ� ����� �������̽� �ڷ��� ������ ����
		// Sub Ŭ������ ��ü ����
		// -> Super �ڷ��� ������ ����
		// -> �ڽ� ��ü�� �θ� �ڷ����� ���� ���� - ������ ����
		// Super s1 = new Sub();

		// Super �������̽��� Ư���� ���� �޾Ƽ� ������ �޼ҵ�
		// -> �޼ҵ� �������̵�
		// s1.method();

		// �������̽��� ��ü ���� �Ұ�
		// Super s2 = new Super();

		// �͸� ���� ��ü
		Super s2 = new Super() {

			@Override
			public void method() {
				System.out.println("�͸� ���� ��ü");
			}

		};
	}

}
