package com.test;

public class Sample068 {

	public static void main(String[] args) {
		// String Ŭ���� ( ���� �ڷ��� )
		// indexOf() �޼ҵ�
		// -> Ư�� ���ڿ��� �־��� ���ڿ� ���� �����ϴ��� �˻�
		// �����ϴ� ��� �ε���(0�̻�) ��ȯ, ���� ��� -1 ��ȯ
		
		String a = "This method returns the index within this string of the first occurrence of the specified substring. If it does not occur as a substring, -1 is returned.";
		String b = "string";
		String c = "test";
		
		System.out.println(a.indexOf(b));
		System.out.println(a.indexOf(c));
				

	}

}
