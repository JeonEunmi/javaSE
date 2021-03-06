package com.test;

import java.util.Arrays;

public class Sample099 {

	public static void main(String[] args) {

		// 오름차순 정렬, 내림차순 정렬
		
		//정수 자료형 배열
		int[] a = { 20, 50, 10, 40, 30 };
		System.out.println("원본 : " + Arrays.toString(a));  //[20, 50, 10, 40, 30]

		/*// 오름차순 정렬
		Arrays.sort(a);
		System.out.println("오름차순 : " + Arrays.toString(a));*/  //[10, 20, 30, 40, 50]
		
		/*
		//내림차순 정렬
		Arrays.sort(a, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println(Arrays.toString(a)); //[50, 40, 30, 20, 10]
		*/
			
		
		
		
		//오름차순 정렬
		//1단계. 첫 번째 숫자와 인접한 숫자를 비교. 첫 번째 숫자가 크면 자리바꿈 액션
		//2단계. 두 번째 숫자와 인접한 숫자를 비교. 두 번째 숫자가 크면 자리바꿈 액션
		//3단계. 나머지 숫자를 같은 방법으로 비교 및 치환.
		//4단계. 모든 숫자 비교가 완성되면 가장 큰 값이 가장 끝에 위치
		//5단계. 정렬된 숫자를 제외한 나머지 숫자를 가지고 1~4단계 진행.
		//-> 큰 경우 자리바꿈을 작은 경우 자리바꿈으로 수정하면 내림차순 정렬 상태
		
		//1회전
		/*
		[20, 50], 10, 40, 30
		20, [50, 10], 40, 30 -> 20, [10, 50], 40, 30
		20, 10, [50, 40], 30 -> 20, 10, [40, 50], 30
		20, 10, 40, [50, 30] -> 20, 10, 40, [30, 50]
		20, 10, 40, 30, [50] -> 결과(가장 큰 값이 가장 끝에 위치)
		*/
		
		//2회전
		/*
		[20, 10], 40, 30| 50 -> [10, 20], 40, 30| 50
		10, [20, 40], 30| 50
		10, 20, [40, 30]| 50 -> 10, 20, [30, 40]| 50
		10, 20, 30, [40]| 50 -> 결과(가장 큰 값이 가장 끝에 위치)
		*/
		
		//3회전
		/*
		[10, 20], 30| 40, 50
		10, [20, 30]| 40, 50
		10, 20, [30]| 40, 50 -> 결과(가장 큰 값이 가장 끝에 위치)
		*/
		
		//4회전
		/*
		[10, 20]| 30, 40, 50
		10, [20]| 30, 40, 50 -> 결과(가장 큰 값이 가장 끝에 위치)
		*/
		
		
				
		int tmp = 0;
		for (int i = 0; i < a.length - 1; ++i) {
			for (int j = 0; j < a.length - 1 - i; ++j) {
				//치환 액션
				if (a[j] > a[j + 1]) {
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
		// 가장 큰 수가 가장 오른쪽에 위치
		System.out.println("오름차순 : " + Arrays.toString(a));

		// 내림차순 정렬
		// 1단계. 첫 번쨰 숫자와 인접한 나머지 숫자를 비교
		// 2단계. 첫 번째 숫자가 크면 자리바꿈 액션
		// 3단계. 두 번째 숫자를 나머지 수와 비교, 첫 번째 숫자는 비교 대상 제외(a[0] 제외, a[1]를 나머지와 비교한다.)
		
		tmp = 0;
		for (int i = 0; i < a.length - 1; ++i) {
			for (int j = 0; j < a.length - 1 - i; ++j) {
				//치환 액션
				if (a[j] < a[j + 1]) {
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
		
		// 관계 연산자 > 는 오름차순 기준
		// 관계 연산자 < 는 내림차순 기준
		/*
		tmp = 0;
		for (int end = 4; end > 0; --end) {
			1회전 -> (0,1) , (1,2), (2,3), (3,4)
			2회전 -> (0,1) , (1,2), (2,3)
			3회전 -> (0,1) , (1,2)
			4회전 -> (0,1)			
			for (int j = 0; j < end; ++j) {
				//치환 액션
				if (a[j] < a[j + 1]) {
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}*/
		
		
		// 가장 큰 수가 가장 왼쪽에 위치
		System.out.println("내림차순 : " + Arrays.toString(a));
		
	}

}
