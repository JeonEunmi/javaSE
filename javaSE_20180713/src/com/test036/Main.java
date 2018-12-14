package com.test036;

public class Main {

	public static void main(String[] args) {
		// Test Ŭ������ ��ü(instance) ����
		
		// new -> ��ü ����. heap ����
		// Test() -> �⺻ ������ ȣ��. �ʵ�((field) �ʱ�ȭ - �ڵ� �ʱ�ȭ, ����� �ʱ�ȭ
		// Test t = -> ��ü�� �����ּ� ����. stack ����.
		
		//�����ڿ� ���� �ʱ�ȭ
		Test t1 = new Test(10);
		System.out.println(t1.getA());   //Test Ŭ����
		//System.out.println(t1.toString());  //Object Ŭ����
		
		//setter�� ���� �ʱ�ȭ -> �ݺ�ȣ��
		t1.setA(20);
		System.out.println(t1.getA());
		
		t1.setA(30);
		System.out.println(t1.getA());
		
		/*
		Test t2 = null;
		
		System.out.println(t2.getA());  //NullPointException
		*/
	}

}
