package com.test038;

// class�� public�̸� �ڵ����� �����ڵ� public �̴�. ��, ��������� ǥ�� �� ���� ���ϴ� ���������� ��밡���ϴ�.
public class Test {

	// private ������
	// -> �����ڴ� ��ü ������ �����ֱ� ������ public ���������� �ַ� ����Ѵ�.
	// ->private �����ڴ� �ܺ� ���� �Ұ�. ��ü ����(instance) ���� �Ұ�. instance ���(field, method) ����
	// �Ұ�
	// ->�ܺο��� ��ü(instance)�� �����ϴ� ������ �����ϴ� ����
	// Ŭ���� ���ο��� ��ü ���� �� ���� -> ���� �޼ҵ�
	// ->��� ���� ����� static �� ���, ��ü ���� ���ʿ�. ���� ���, Math Ŭ����

	// �ʵ�(field)
	private int a;

	// �Ű����� �ִ� ������(constructor) -> private
	private Test() {

	}

	// getter, setter -> public
	public int getA() {
		return this.a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void method() {
		System.out.println(this.getA());

	}
}
