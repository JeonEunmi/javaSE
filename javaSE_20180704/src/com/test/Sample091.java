package com.test;

import java.util.*;
public class Sample091 {

	public static void main(String[] args) {
		// �迭 ����Ҹ� �̿��� ���� ó��
		// �������� �����(5��)�� ���� �������� �����ϰ�, ����(���)�� ���
		// ����� 1��� ���� 1�� - ����1�� ���� ����
		// ���� ����(0~100)�� �̿��ؼ� ��´�.
		/*
		 * ���࿹) choi -> ??
		 * park -> ??
		 * hong -> ??
		 * min -> ??
		 * jeon -> ??
		 * -----------
		 * choi -> 100 -> 1��
		 * park -> 90 -> 3��
		 * hong -> 95 -> 2��
		 * min -> 80 -> 4��
		 * joen -> 70 -> 5��
		 */

		// ����� ���� ����(�̸�)
		String[] names = { "choi", "park", "hong", "min", "jeon" };

		// ������ ���� �غ� -> ���� or �ܺ��Է�
		int[] scores = new int[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < names.length; ++i) {
			System.out.print(names[i] + " -> ");
			scores[i] = scanner.nextInt();
			scanner.nextLine();
			while(0 > scores[i] || scores[i] > 100) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���. ������ 0~100 �����Դϴ�.");
				System.out.print(names[i] + " -> ");
				scores[i] = scanner.nextInt();
				scanner.nextLine();
			}
		}
		scanner.close();
		
		// ����(���) ��� �׼�
		// 1�ܰ�. ���� ���� �迭 �غ��ؼ� �ʱⰪ�� 1�� ����
		// 2�ܰ�. ù��° ������� ������ ������ ������� ������ ��
		// ���� ������ ������ ���� ����(���)�� +1 ���� ����

		// 3�ܰ�. ������ ����ڵ鵵 2�ܰ� ����

		int[] ranks = new int[names.length];
		
		/*
		 * for ( int a =0; a<names.length; ++a) {
		 * ranks[a] =1;
		 * }
		 */
		
		Arrays.fill(ranks, 1);
		
		for (int i = 0; i < ranks.length; ++i) {
			ranks[i] = 1;
		}

		for (int i = 0; i < ranks.length; ++i) {
			for (int j = 0; j < ranks.length; ++j) {
				if (scores[i] < scores[j]) {
					++ranks[i];
				}
			}
		}

		// ������
		System.out.println("-----------------------");
		for (int i = 0; i < names.length; ++i) {
			System.out.println(names[i] + " -> " + scores[i] + " -> " + ranks[i] + "��");
		}

	}

}
