package com.test;

//���� Ŭ����(main �޼ҵ� ���� Ŭ����)
public class OOP012 {
	
	public static void main(String[] args) {
		// ����� ������ Ŭ������ �޼ҵ� ȣ��
		Test007 t = new Test007();
		// ��� ���� ������ �޼ҵ忡 ����
		// -> �ڷ� ����
		// -> ����� ��ȯ
		int result = t.add(10, 20);
		System.out.println(result);
		
		// java.lang.Math Ŭ������ random() �޼ҵ带 �̿��ؼ� 
		// ���� ȹ��
		System.out.println(Math.random());
	}

}
