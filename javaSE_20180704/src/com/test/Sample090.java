package com.test;

public class Sample090 {

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

		// ������ ���� �غ� -> ���� or �ܺ��Է�  /����/
		int[] scores = new int[names.length];
		for (int i = 0; i < names.length; ++i) {
			scores[i] = (int) (Math.random() * 101);
		}
		
		// ����(���) ��� �׼�
		// 1�ܰ�. ���� ���� �迭 �غ��ؼ� �ʱⰪ�� 1�� ����
		// 2�ܰ�. ù��° ������� ������ ������ ������� ������ ��
		// ���� ������ ������ ���� ����(���)�� +1 ���� ����

		// 3�ܰ�. ������ ����ڵ鵵 2�ܰ� ����

		int[] ranks = new int[names.length];

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
		for (int i = 0; i < names.length; ++i) {
			System.out.println(names[i] + " -> " + scores[i] + " -> " + ranks[i] + "��");
		}

	}

}
