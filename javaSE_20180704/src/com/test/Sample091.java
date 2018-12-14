package com.test;

import java.util.*;
public class Sample091 {

	public static void main(String[] args) {
		// 배열 저장소를 이용한 성적 처리
		// 여러명의 사용자(5명)에 대한 성적들을 저장하고, 석차(등수)를 계산
		// 사용자 1명당 성적 1개 - 과목1에 대한 성적
		// 적은 난수(0~100)를 이용해서 얻는다.
		/*
		 * 실행예) choi -> ??
		 * park -> ??
		 * hong -> ??
		 * min -> ??
		 * jeon -> ??
		 * -----------
		 * choi -> 100 -> 1등
		 * park -> 90 -> 3등
		 * hong -> 95 -> 2등
		 * min -> 80 -> 4등
		 * joen -> 70 -> 5등
		 */

		// 사용자 개인 정보(이름)
		String[] names = { "choi", "park", "hong", "min", "jeon" };

		// 가상의 점수 준비 -> 난수 or 외부입력
		int[] scores = new int[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < names.length; ++i) {
			System.out.print(names[i] + " -> ");
			scores[i] = scanner.nextInt();
			scanner.nextLine();
			while(0 > scores[i] || scores[i] > 100) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. 점수는 0~100 사이입니다.");
				System.out.print(names[i] + " -> ");
				scores[i] = scanner.nextInt();
				scanner.nextLine();
			}
		}
		scanner.close();
		
		// 석차(등수) 계산 액션
		// 1단계. 석차 전용 배열 준비해서 초기값을 1로 설정
		// 2단계. 첫번째 사용자의 점수와 나머지 사용자의 점수를 비교
		// 상대방 점수가 높으면 나의 석차(등수)를 +1 연산 수행

		// 3단계. 나머지 사용자들도 2단계 진행

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

		// 결과출력
		System.out.println("-----------------------");
		for (int i = 0; i < names.length; ++i) {
			System.out.println(names[i] + " -> " + scores[i] + " -> " + ranks[i] + "등");
		}

	}

}
