package com.test;

public class Sample045 {

	public static void main(String[] args) {
		// �ݺ��� -> while, do -while ����
		// ������ Ƚ����ŭ �ݺ� �����ϴ� ����

		// ������ ���� Ȯ���� �Ŀ� �����Ѵ�.
		/*
		 * while(Boolean_expression) { // Statements }
		 */

		// ������ �Ŀ� ������ Ȯ���Ѵ�.
		// ���ǹ��� �����̶� �ϴ��� �ּ� �ѹ��� �����Ѵٴ� ���� while���� �ٸ���.
		// for������ ����� �� ���� ������ do-while������ �̿��Ѵ�.
		/*
		 * do { // Statements }while(Boolean_expression);
		 */

		// 1���� 10������ ���� ����Ѵ�.
		for (int i = 1; i <= 10; ++i) {
			System.out.println(i);
		}

		// 1���� 10������ ���� ���
		// �ܺ� �Է� ���� ���� �׼� ���� ���� ������ ���
		// -> do-while ������ ��� ����
		int a = 1;
		do {
			System.out.println(a);
			++a;
		} while (a <= 10);

		// while�������� ����!
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			++i;
		}
		// ���� ����
		while (true) {
			System.out.println("Hello, world!");
		}

		// ���ѽ��� Ż��!
		/*
		 * if (����){ break; }
		 */
	}

}
