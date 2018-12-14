package com.test;

import java.util.Arrays;

public class Sample097 {

	public static void main(String[] args) {
		// ����)
		// �ζ� ��ȣ(1~45) ���� �� ���
		// -> 1~45 ������ ���ڸ� �ߺ����� �ʰ� 6�� ���� + ���ʽ� ��ȣ 1�� ����
		// -> ��½� ���ĵ� ���·� ��� -> Arrays.sort()
		/*
		 * 813ȸ�� ��÷ ��ȣ : 11, 30, 34, 35, 42, 44 + 27
		 * 
		 * 1�� ��÷��ȣ 6�� ������ġ
		 * 2�� ��÷��ȣ 5�� ������ġ ( + ���ʽ� ���� )
		 * 3�� ��÷��ȣ 5�� ������ġ
		 * 4�� ��÷��ȣ 4�� ������ġ
		 * 5�� ��÷��ȣ 3�� ������ġ
		 */

		int[] lotto = new int[6];
		int[] victory = { 11, 30, 34, 35, 42, 44 };
		int bonus = 27;

		for (int i = 0; i < lotto.length;) {
			int tmp = (int) (Math.random() * 45) + 1;
			boolean flag = true;

			for (int j = 0; j < i; ++j) {
				if (tmp == lotto[j]) {
					flag = false;
				}
			}
			if (flag) {
				lotto[i] = tmp;
				++i;
			}
		}
		Arrays.sort(lotto);
		
		int tmp = 0;
		int bonustmp = 0;
		
		for (int i = 0; i < victory.length; ++i) {
			if (lotto[i] == bonus) {
				++bonustmp;
			}
			for (int j = 0; j < lotto.length; ++j) {
				if (victory[i] == lotto[j]) {
					++tmp;
					}
			
			}
		}
		
		System.out.println("�� �ζǹ�ȣ : " + Arrays.toString(lotto));
		System.out.println("�̴��� ��÷ ��ȣ : " + Arrays.toString(victory) + " ���ʽ� ��ȣ�� [" + bonus + "]");
		
		System.out.println("��ġ�ϴ� �ζǹ�ȣ ������ " + tmp + "�� �Դϴ�.");
		if(bonustmp == 1) {
			System.out.println("���ʽ���ȣ�� ��ġ�մϴ�.");
		} else {
			System.out.println("���ʽ���ȣ�� ��ġ���� �ʽ��ϴ�. ��~~");
		}
		if (tmp == 6) {
			System.out.println("�����մϴ�. 1�� �Դϴ�!");
		} else if (tmp == 5 && bonustmp == 1) {
			System.out.println("�����մϴ�. 2�� �Դϴ�!");
		} else if (tmp == 5) {
			System.out.println("�����մϴ�. 3�� �Դϴ�!");
		} else if (tmp == 4) {
			System.out.println("�����մϴ�. 4�� �Դϴ�!");
		} else if (tmp == 3) {
			System.out.println("�����մϴ�. 5�� �Դϴ�!");
		} else {
			System.out.println("������ �ٽ� �����ϼ���!");
		}
	}

}
