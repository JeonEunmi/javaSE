package com.test;

public class Sample067 {

	public static void main(String[] args) {
		// �ֹι�ȣ(�����-����...)���� ���� ����
		// 1, 3 -> ����
		// 2, 4 -> ����

		String ssn = "930831-2345678";

		char gender = ssn.charAt(7); // ���� 2

		if (gender == 1 || gender == 3) {
			System.out.println("������ �����Դϴ�.");
		} else {
			System.out.println("������ �����Դϴ�.");
		}
	}

}
