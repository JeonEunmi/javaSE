package com.test016;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// ����)
		// �ߺ����� ���� ��ȣ�� ���� �ζǹ�ȣ(6��) �޼ҵ� ȣ��
		// ����ڰ� ���ϴ� �����ŭ �ѹ��� ��µǵ��� �Ѵ�.
		// 5�� ��÷��(��÷��ȣ 3�� ������ġ)�� ��µǵ��� �Ѵ�.
		// 814ȸ(2018.07.07) ��÷��ȣ 2, 21, 28, 38, 42, 45 + 30
		/*
		 * ���࿹) ���ϴ� ��� (n) > 1000 100. [2, 21, 28, ??, ??, ??] 215. [??, 21, 28, 38, ??,
		 * ??] 381. [??, ??, 28, 38, 42, ??] 459. [??, ??, ??, 38, 42, 45] ---------- ��
		 * 4��
		 */

		Test t = new Test();

		int[] win = { 2, 21, 28, 38, 42, 45 };

		Scanner scanner = new Scanner(System.in);

		System.out.println("�ζ� ���� ��ǰǰ���? (1000��) > ");

		int number = scanner.nextInt();
		scanner.nextLine();
		scanner.close();

		System.out.println("===============================");
		System.out.println("814ȸ(2018.07.07) ��÷��ȣ 2, 21, 28, 38, 42, 45 + 30");
		System.out.println("===============================");
		
		int count = 0;
		
		for (int i = 1; i <= number; ++i) {
			
			int[] tmp = t.lotto();
			int temp = 0;
			
			for (int j = 0; j < win.length; ++j) {
				for (int k = 0; k < win.length; ++k) {
					if (win[j] == tmp[k]) {
						++temp;
					}
				}
			}
			if (temp == 3) {
				System.out.println(i + ". " + Arrays.toString(tmp));
				++count;
			}

		}
		System.out.println("===============================");
		System.out.println("��÷�ο� : " + count + "��");
	}

}
