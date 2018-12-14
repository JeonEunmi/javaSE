package com.test;

import java.util.Arrays;

public class Sample096 {

	public static void main(String[] args) {
		// ����)
		// �ζ� ��ȣ (1~45) ���� �� ���
		// -> 1~45 ������ ���ڸ� �ߺ����� �ʰ� 6�� ����
		// -> ��½� ���ĵ� ���·� ��� -> Arrays.sort()

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; ) {
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
		System.out.println(Arrays.toString(lotto));
	}

}
