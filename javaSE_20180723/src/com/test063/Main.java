package com.test063;

public class Main {

	public static void main(String[] args) {
		// Super Ŭ������ ��ü ����
		Super super1 = new Super();
		
		// toString() �޼ҵ� ȣ��
		// Super ��ü�� ���� ��ȯ
		// -> com.test063.Super@7852e922
		System.out.println(super1.toString());
		
		// Sub Ŭ������ ��ü ����
		Sub sub1 = new Sub();
		
		// toString() �޼ҵ� ȣ��
		// -> �������̵��� ����
		// -> Sub Ŭ�������� �������̵��� �޼ҵ�
		System.out.println(sub1.toString());
		
		// toString() �޼ҵ常 ȣ��� ���� ����
		System.out.println(sub1);
		
		// ��ǥ���� toString() �޼ҵ� ȣ�� ��
		// -> String, Integer Ŭ����
		// -> �������̵��� ����
		String s1 = new String("TEST");
		System.out.println(s1.toString());  //TEST
		Integer i1 = new Integer(10);
		System.out.println(i1.toString());  //10
	}

}
