package com.test;

import java.util.Arrays;

public class Sample073 {

	public static void main(String[] args) {
		// 배열 (array) 자료형
		// 동일한 자료형(기본형, 참조형 모두 가능)을 가진 자료 여러개를 메모리에 저장하는 방법
		// 배열은 생성시 크기 지정 필수
		// 배열 생성시 자동 초기화 지원 -> 자동으로 값을 저장시킨다.
		// 배열 생성후 크기 변경 불가
		// new 연산자를 이용해서 배열 생성
		// 배열의 크기 확인은 length 필드(field) 사용
		// 배열 탐색시 인덱스 사용

		// 기본형식
		// dataType[] arrayRefVar = new dataType[arraySize];
		// dataType[] arrayRefVar = {value0, value1, ..., valuek};

		int[] a = new int[5];

		System.out.println(a); // 배열 a의 참조주소, 해쉬코드
		System.out.println(a[0]); // 배열 a의 0번째 자리에 들어있는 요소

		a[0] = 10;
		System.out.println(a[0]);

		// 인덱스 사용시 반복문 이용 (입력용)
		for (int i = 0; i < a.length; ++i) {
			a[i] = i;
		}

		// 인덱스 사용시 반복문 이용 (출력용)
		for (int i = 0; i < a.length; ++i) {
			System.out.println(a[i]);
		}
		// 배열 요소 전체 출력
		// ->Arrays 클래스의 toString() 메서드
		System.out.println(Arrays.toString(a));

		// 잘못된 인덴스 접근시 예외(오류) 발생 --> ArrayIndexOutOfBoundsException 발생!
		for (int b = 0; b <= a.length; ++b) {
			System.out.println(a[b]);
		}
	}

}
