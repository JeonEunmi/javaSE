package com.test062;

public class Sub extends Super {

	// �ڱ� �ڽ��� �ʵ�(age)�� ����.

	// Implicit super constructor Super() is undefined.
	public Sub() {
		// �ڵ� ����Ǿ�����, �θ�(Super) Ŭ�������� �⺻ �����ڰ� ��� ���� �߻�
		// ���� �ڽ� Ŭ������ �⺻ ������ ������ �� �� ���� �ȴ�.
		// super(); 
		
		// �ذ�� -> �θ��� �Ű������� �ִ� �����ڸ� �̿��Ͽ�, ���� ȣ��
		// subŬ������ �⺻ ������ ����
		super(0);
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
