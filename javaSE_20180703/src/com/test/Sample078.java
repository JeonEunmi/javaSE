package com.test;

public class Sample078 {

	public static void main(String[] args) {
		
		// 배열 저장소를 이용한 성적 처리
		// 다수의 사용자에 대한 성적들을 저장하고 합, 평균 등을 계산하여 출력함
		// 사용자 한 명당 성적 1개로 가정 - 과목1에 대한 성적
		/*   park -> ??
  			 choi -> ??
  			 hong -> ??
  			 kim -> ??
  			 lee -> ??
  			 ----------
  			 총점: XXX
  			 평균: XXX.X
  			 */
		// 성적은 난수(0~100)을 이용해서 얻는다.
		
		String[] names = {"park", "kim", "lee", "choi", "hong"};
		int[] scores = new int[5];
		
		for(int i =0; i<scores.length; ++i) {
			scores[i] = (int)(Math.random()*101);
		}
		
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
		
	}

}
