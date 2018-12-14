package com.test;

public class Sample010 {

	public static void main(String[] args) {
		
		//성적처리 -> 과목1, 과목2, 과목3의 점수에 대한 총점 계산
		
		//1단계. 입력
		//변수 선언 및 값 저장
		//-> 자료형
		byte sub1 = 90;
		byte sub2 = 68;
		byte sub3 = 62;
		//byte sub4 = 200; // max 127
		
		//2단계. 처리
		//총점 계산 액션 코드
		int total = sub1 + sub2 + sub3;
		
		//평균 계산 액션 코드
		//정수의 정수의 연산 결과는 정수
		//double avg = total / 3;
		//정수와 실수의 연산 결과는 실수
		double avg = total / 3.0;
				
		//3단계. 출력
		//총점 결과 출력 코드
		System.out.println(total);
		//평균 결과 출력 코드
		System.out.println(avg);
	}

}

