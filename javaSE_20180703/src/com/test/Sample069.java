package com.test;

public class Sample069 {

	public static void main(String[] args) {
		// String Ŭ���� ( ���� �ڷ��� )
		// replace() �޼ҵ�
		// -> Ư�� ���ڿ��� ������ �־��� ���ڿ� ������ ���� ���ڿ��� ���ο� ���ڿ��� ġȯ
		// ����) ���ڿ� ġȯ ����� ���ο� ���ڿ� ��ü�̴�.
				
		String a = "This method returns the index within this string of the first occurrence of the specified substring. If it does not occur as a substring, -1 is returned.";
		String b = "string";
		String c = "test";
		
		System.out.println(a.replace(b,c));

	}

}
