package com.test088;

// �߻� Ŭ���� ����
// -> �Ϻ� ����� �߻� �޼ҵ��� ��� �߻� Ŭ������ �����ؾ� �Ѵ�.
// -> �߻� �޼ҵ尡 ��� �߻� Ŭ������ ���� ����
// -> �ڱ� �ڽ��� ��ü(instance) ���� �Ұ�
// -> ����(�θ�) Ŭ���� ����
public abstract class Super {

	// ������ ���� ����
	// -> �ڽ� Ŭ������ �����ڸ� ���ؼ� �θ� Ŭ���� ������ ȣ��
	public Super() {
		System.out.println("Super Ŭ������ ������");
	}
	
	// �Ϲ� �޼ҵ� ���� ����
	// -> �޼ҵ� �ñ״�ó + ������(�����ڵ�)
	// -> �ڽ� ��ü�� �޼ҵ带 ȣ���� ���ؼ� �θ� ��ü �޼ҵ� ȣ��
	public void method1() {
		System.out.println("Super Ŭ������ method1()");
	}
	
	// �߻� �޼ҵ� ���� ����
	// -> �޼ҵ� �ñ״�ó
	// public abstract Ű���� ���� �Ұ�
	public abstract void method2();
}