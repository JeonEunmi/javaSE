package com.test064;

public class Sub extends Super{
	
	// this, super ���� -> �ڵ� ���� -> ��ü�� ���� �ּ� �Ҵ�

	// Super Ŭ������ method1() �޼ҵ常 �������̵�
	// -> �θ� ��ü�� method1() �޼ҵ�� �ڽ� ��ü�� ���� ��������.
	public void method1() {
		System.out.println("SubŬ������ method1()");
		//super Ű���带 ����ϸ� �θ� ��ü�� ������ �� �ִ�.
		super.method1();
	}

	// Super Ŭ������ method2() �޼ҵ�� �����Ǵ� ����
	// -> "Super Ŭ������ method2()"
	
}
