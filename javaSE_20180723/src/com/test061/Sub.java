package com.test061;

public class Sub extends Super {

	// �ڱ� �ڽ��� �ʵ�(age)�� ����.
	
	public Sub() {
		// super Ű���带 �̿��� Super Ŭ������ �⺻ ������ ȣ��
		// super();   --> ������ ������ super()�� �����Ǿ��ִ�.
		System.out.println("Sub Ŭ������ �⺻ ������");
	}

	public Sub(int age) {
		// superŰ���带 �̿��� Super Ŭ������ �Ű������� �ִ� ������ ȣ��
		super(age);
		// this.age = age;
		System.out.println("Sub Ŭ������ �Ű������� �ִ� ������");
	}
	
	// Super Ŭ������ public ��� ���� ����
	// -> getAge()
	// -> �θ�(Super) Ŭ���� age ������ �� ��ȯ
}
