package com.test;

public class Sample066 {

	public static void main(String[] args) {
		// String Ŭ���� (���� �ڷ���)
		// charAt() �޼ҵ�
		// --> �־��� ���ڿ��� Ư�� �ε����� ���ڿ� ���� char��
		// ex) ���ڿ� TEST -- Ư�� �ε���(0)

		String a = "TEST";
		String b = new String("HELLO");

		// String (���� �ڷ���) -> char (�⺻ �ڷ���)
		System.out.println(a.charAt(0)); // T
		System.out.println(a.charAt(1)); // E
		System.out.println(a.charAt(2)); // S
		System.out.println(a.charAt(3)); // T

		// char -> int
		System.out.println((int) a.charAt(0)); // 84
		System.out.println((int) a.charAt(1)); // 69
		System.out.println((int) a.charAt(2)); // 83
		System.out.println((int) a.charAt(3)); // 84

		// �ε��� ���� �ݺ��� �̿�
		for (int c = 0; c < b.length(); ++c) {
			System.out.println(b.charAt(c));
		}

	}
}
