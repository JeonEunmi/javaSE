package com.test;

import java.util.Arrays;

public class Sample094 {

	public static void main(String[] args) {

		// 단어 사전을 이용한 동적 문자열 준비
		// -> 미리 준비된 단어 사전에 특정 단어를 선택해서 배열에 저장
		// -> 배열에 저장시 중복되지 않도록 한다.

		// 단어 사전 배열 준비
		String[] dict = { "turtle", "know", "student", "shoes", "attack", "heart", "response", "beat", "relieve", "art",
				"remote", "package", "infect", "cellular", "die", "delay", "suffer", "data", "structure", "key" };

		// 참조 자료형 배열
		String[] e = new String[5];
		
		
		for (int i = 0; i < e.length; i++) {
			e[i] = "";
		}

		for (int i = 0; i < e.length;) {
			// 일정 범위(0 ~ dict.length-1)의 난수 발생
			int temp = (int) (Math.random() * dict.length);

			// 난수를 이용해서 단어 사전 배열에서 특정 단어 선택
			String word = dict[temp];

			// 특정 단어가 이미 존재하는 단어인지 검사하는 과정 추가
			// 단어 사전 배열의 요소를 정렬
			
			// 특정 단어가 이미 존재하는 단어인지 검사
			boolean check = true;
			for (int j=0; j<i; ++j) {
				if (word.equals(e[j])) {
					check = false;
				}
			}
			if (check) {
				e[i] = word;
				++i;
			}
			
			// 중간확인 하는 방법
			/*
			System.out.println(word);
			System.out.println(Arrays.toString(e));
			*/
		}
		System.out.println(Arrays.toString(e));

	}

}
