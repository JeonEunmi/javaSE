package com.test;

public class Sample072 {

	public static void main(String[] args) {
		
		// String Ŭ���� (���� �ڷ���)
		// valueOf() �޼ҵ�
		// -> static �޼ҵ�
		// -> �־��� �⺻�� �ڷḦ String �ڷ������� ��ȯ
		
		int a = 10;
		char b = 'A';
		double c = 12.345;
		
		System.out.println(String.valueOf(a));   //'10'
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));

	}

}
