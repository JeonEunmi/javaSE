package com.test;

public class Sample064 {

	public static void main(String[] args) {
		
		// String Ŭ���� (���� �ڷ���)
		// - ���ڿ� ��޽� ����ϴ� �ڷ���
		
		// ������ ���ڿ� ���ͷ� (�Һ��� Ư��)�� ������ �����ϴ� ���
		String a = "TEST";
		String b = "TEST";
		System.out.println(a == b);
		
		// ���ο� ���ڿ� ��ü�� �غ��ϴ� ��� new String
		String c = new String("HELLO");
		String d = new String("HELLO");
		// �����ּ� ��
		System.out.println(c == d);
		// �ڷ� �� (��ҹ��ڵ� ������)
		System.out.println(c.equals(d));
		
		
		// �⺻ �ڷᰡ ����� ������ ������ null �Ҵ�
		// -> ���� �ڷ�� �޸𸮿��� ������ ��ü�� �ȴ�.
		// -> ������ �÷��Ϳ� ���ؼ� �ڵ� �Ҹ� (������...)
		d = null;
		
	}

}
