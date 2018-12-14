package com.test;

public class Sample077 {

	public static void main(String[] args) {
		
		// 배열 저장소를 이용한 성적 처리
		// 다수의 사용자에 대한 성적들을 저장하고 합, 평균 등을 계산하여 출력함
		// 사용자 한 명당 성적 1개로 가정 - 과목1에 대한 성적
		/* park, kim, lee의 성적
		 * park : 100
		 * kim : 90
		 * lee : 85
		 */
		
		// 서로 짝이 맞아야 하는 자료의 인덱스를 일치시킬 것
		String[] names = {"park", "kim", "lee"};
		int[] scores = {100, 90, 85};
		
		
		// 총점, 평균 계산 액션 
		int sum = 0;
		double avr = 0.0;
		
		for(int i=0; i<names.length; ++i) {
			sum += scores[i];
		}
		
		avr = (double) sum / scores.length;
		
		// System.out.println(Arrays.toString(names))
		// 결과 출력
		for(int i = 0; i < names.length; ++i) {
		System.out.println(names[i] + "의 점수는 ?? " + scores[i]);
		}
		
		System.out.println("--------------------");		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avr);
		
		/*
		 * 실행예)
		 * park의 점수는 ?? xx
		   kim의 점수는 ?? xx
		   lee의 점수는 ?? xx
		  ---------------------
		  총점 : xxxx
		  평균 : xxx.xxx
		 */
	}

}
