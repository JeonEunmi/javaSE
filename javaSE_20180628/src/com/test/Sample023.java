package com.test;

public class Sample023 {

	public static void main(String[] args) {

		// if��
		// ����(����) �м� �� ��� ���
		// ������ 0 ~ 100 ������ �ִ�. ����� A, B, C, D, F ������� ����
		// A : 90�� �̻�, B : 80�� �̻�, C : 70�� �̻�, D : 60�� �̻�, F 60�� �̸�

		int score = 65;

		if (score >= 90) {
			System.out.println("A���");
		} 
		if (80 <= score && score < 90) {
			System.out.println("B���");
		} 
		if (70 <= score && score < 80) {
			System.out.println("C���");
		} 
		if (60 <= score && score < 70) {
			System.out.println("D���");
		} 
		if (score < 60) {
			System.out.println("F���");
		}

	}
}

 