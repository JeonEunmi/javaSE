package com.test;

public class Sample070 {

	public static void main(String[] args) {
		// String Ŭ���� (���� �ڷ���)
		// substring() �޼ҵ�
		// -> �־��� ���ڿ����� �κ� ���ڿ� ����.
		// ����) ����� �κ� ���ڿ��� ���ο� ���ڿ� ��ü�̴�.
		
		String ssn = "990624-1234567";
		
		// �ֹι�ȣ(�����-����...)���� ������� ����
		
		// String substring(int beginIndex(inclusive), int endIndex(exclusive))
		System.out.println(ssn.substring(0,6));
		
		// String substring(int beginIndex)
		System.out.println(ssn.substring(7));

	}

}
