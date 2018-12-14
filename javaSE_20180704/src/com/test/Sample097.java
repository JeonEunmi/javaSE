package com.test;

import java.util.Arrays;

public class Sample097 {

	public static void main(String[] args) {
		// 문제)
		// 로또 번호(1~45) 추출 및 출력
		// -> 1~45 범위의 숫자를 중복되지 않게 6개 추출 + 보너스 번호 1개 추출
		// -> 출력시 정렬된 상태로 출력 -> Arrays.sort()
		/*
		 * 813회차 당첨 번호 : 11, 30, 34, 35, 42, 44 + 27
		 * 
		 * 1등 당첨번호 6개 숫자일치
		 * 2등 당첨번호 5개 숫자일치 ( + 보너스 숫자 )
		 * 3등 당첨번호 5개 숫자일치
		 * 4등 당첨번호 4개 숫자일치
		 * 5등 당첨번호 3개 숫자일치
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
		
		System.out.println("내 로또번호 : " + Arrays.toString(lotto));
		System.out.println("이달의 당첨 번호 : " + Arrays.toString(victory) + " 보너스 번호는 [" + bonus + "]");
		
		System.out.println("일치하는 로또번호 갯수는 " + tmp + "개 입니다.");
		if(bonustmp == 1) {
			System.out.println("보너스번호가 일치합니다.");
		} else {
			System.out.println("보너스번호가 일치하지 않습니다. 꽝~~");
		}
		if (tmp == 6) {
			System.out.println("축하합니다. 1등 입니다!");
		} else if (tmp == 5 && bonustmp == 1) {
			System.out.println("축하합니다. 2등 입니다!");
		} else if (tmp == 5) {
			System.out.println("축하합니다. 3등 입니다!");
		} else if (tmp == 4) {
			System.out.println("축하합니다. 4등 입니다!");
		} else if (tmp == 3) {
			System.out.println("축하합니다. 5등 입니다!");
		} else {
			System.out.println("다음에 다시 도전하세요!");
		}
	}

}
