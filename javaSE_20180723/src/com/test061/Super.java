package com.test061;

public class Super {

	private int age;

	// �⺻ ������
	public Super() {
		
		// Object Ŭ������ �⺻ ������ ȣ��
		// super();
		System.out.println("Super Ŭ������ �⺻ ������");
	}

	// �Ű������� �ִ� ������
	public Super(int age) {
		this.age = age;
		System.out.println("Super Ŭ������ �Ű������� �ִ� ������");
	}

	// getter
	public int getAge() {
		return this.age;
	}

}
