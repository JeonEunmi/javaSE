package com.test063;

public class Sub extends Super{
	
	// �θ� �����ϴ� toString() �޼ҵ带 ������ ������� ������
	// -> �޼ҵ� �������̵�(method overriding)
	// -> �θ� ������ �� �ִ� �޼ҵ� ��� Ȯ�� �ʿ�
	// -> �θ� �޼ҵ� �ñ״�ó�� �����ϰ� �ۼ�
	// -> �޼ҵ� ������ ������ �Ѵ�.

	// Object Ŭ������ toString() �޼ҵ带 �������̵�
	//@Override ������̼� ǥ�� ����
	@Override
	public String toString() {
		return "Sub Ŭ�������� �������̵��� �޼ҵ�";
	}
	
	// Super Ŭ������ method() �޼ҵ带 �������̵�
	//@Override ������̼� ǥ�� ����	
	@Override
	public void method() {
		System.out.println("Sub Ŭ�������� �������̵��� �޼ҵ�");
	}	
	
}
