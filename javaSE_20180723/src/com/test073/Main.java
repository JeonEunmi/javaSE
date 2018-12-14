package com.test073;

public class Main {

	public static void main(String[] args) {
		
		// Super Ŭ������ ��ü ����
		Super s1 = new Super();
		Super s2 = new Super();
		
		// �����ּ� ���
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		// �����ּ� ��
		// -> equals() �޼ҵ� �ñ״�ó Ȯ��
		// -> public boolean equals(Object obj)
		// -> Super �ڷ��� ��ü -> Object �ڷ��� obj ������ ����
		// -> �Ű������� �ڷ����� Ŭ����(Object Ŭ����)�� ��� �Ű���(Super �ڷ����� ��ü) �� �ڽ� ��ü�� ����
		// -> �Ű������� ������(�ϳ��� �ڷ��� ������ ���� �ڷ����� ��ü�� ����� �� �ִ� �ɷ�)
		
		System.out.println(s1.equals(s2));  // false
		
		// �� ��
		// -> �������̵� equals() �޼ҵ�
		// -> String Ŭ������ equals() �޼ҵ�
		String str1 = new String("TEST");
		String str2 = new String("TEST");
		System.out.println(str1.equals(str2));  // true
		
		// ������ ������ ���� �� ���� Member ��ü �غ�
		Member m1 = new Member("M01", "hong","010-1234-1234");
		Member m2 = new Member("M01", "hong","010-1234-1234");
	
		// �� �� -> ȸ�����̵� ��ġ�ϴ��� Ȯ��
		// -> equals() �޼ҵ� �������̵�
		System.out.println(m1.equals(m2));  // true
		
	}

}
