package com.test;

public class Sample065 {

	public static void main(String[] args) {
		
		// String Ŭ����
		// equals(), equalsIgnoreCase() �޼���
		
		// �޼��� ����
		
		/*
		�޼ҵ� ����
		
		public boolean equals(Object anObject)
		�����ڷ��� ��ȯ�ڷ��� �޼ҵ��̸�(�Ű�����)
		�����ڷ��� - �ܺο��� ���� ���� ���� ����
		��ȯ�ڷ��� - �޼ҵ� ������ ����� �ڷ���
		�Ű����� - �޼ҵ� ���࿡ �ʿ��� �ܺ� �ڷḦ ���� �� �ִ� ����
		*/
		
		String a = "TEST";
		String b = "Test";
		String c = "test";
		String d = c;
		
		// �ڷ��
		System.out.println(a.equals(b));   //false
		System.out.println(a.equalsIgnoreCase(b));   //true
		System.out.println(c.equals(d));   //true
		System.out.println(c.equalsIgnoreCase(d));   //true
		// �����ּҺ�
		System.out.println(c == d);        //true

	}

}
