package com.test016;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// 문제)
		// 중복되지 않은 번호를 가진 로또번호(6개) 메소드 호출
		// 사용자가 원하는 장수만큼 한번에 출력되도록 한다.
		// 5등 당첨자(당첨번호 3개 숫자일치)만 출력되도록 한다.
		// 814회(2018.07.07) 당첨번호 2, 21, 28, 38, 42, 45 + 30
		/*
		 * 실행예) 원하는 장수 (n) > 1000 100. [2, 21, 28, ??, ??, ??] 215. [??, 21, 28, 38, ??,
		 * ??] 381. [??, ??, 28, 38, 42, ??] 459. [??, ??, ??, 38, 42, 45] ---------- 총
		 * 4명
		 */

		Test t = new Test();

		int[] win = { 2, 21, 28, 38, 42, 45 };

		Scanner scanner = new Scanner(System.in);

		System.out.println("로또 몇장 사실건가요? (1000장) > ");

		int number = scanner.nextInt();
		scanner.nextLine();
		scanner.close();

		System.out.println("===============================");
		System.out.println("814회(2018.07.07) 당첨번호 2, 21, 28, 38, 42, 45 + 30");
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
		System.out.println("당첨인원 : " + count + "명");
	}

}
