package com.test;

public class Sample001 {

	public static void main(String[] args) {
		
		//성적처리 -> 과목1, 과목2, 과목3의 점수에 대한 총점 계산
		
		//1단계. 입력
		//변수 선언 및 값 저장
		//-> 자료형
		byte sub1, sub2, sub3;
		sub1 = 90;
		sub2 = 65;
		sub3 = 80;
		//byte sub4 = 200; // max 127
		
		//2단계. 처리
		//총점 계산 액션 코드
		int total = sub1 + sub2 + sub3;
				
		//3단계. 출력
		//총점 계산 출력 코드
		System.out.println(total);
	}

}

