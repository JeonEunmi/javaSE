package com.test;

import java.util.Arrays;

public class Sample096 {

	public static void main(String[] args) {
		// 문제)
		// 로또 번호 (1~45) 추출 및 출력
		// -> 1~45 범위의 숫자를 중복되지 않게 6개 추출
		// -> 출력시 정렬된 상태로 출력 -> Arrays.sort()

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
