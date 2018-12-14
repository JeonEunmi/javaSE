package com.test;

import java.util.Arrays;

public class Sample079 {

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
  			 합격자 :
  			 XXX
  			 XXX
  			 XXX
  			 불합격자
  			 XXX
  			 XXX
  			 */
		// 성적은 난수(0~100)을 이용해서 얻는다.
		
		String[] names = {"park", "kim", "lee", "choi", "hong"};
		int[] scores = new int[5];

		for(int i =0; i<scores.length; ++i) {
			scores[i] = (int)(Math.random()*101);
		}

		for(int i = 0; i < names.length; ++i) {
		System.out.println(names[i] + "의 점수는 ?? " + scores[i]);
		}
		
		System.out.println("--------------------");		
		System.out.println("합격자 (60점 이상) : " );
		for(int i=0; i<names.length; ++i) {
			if(scores[i]>=60)
			System.out.println(names[i]);
		}
		System.out.println("불합격자 (60점 미만) : ");
		for(int i=0; i<names.length; ++i) {
			if(scores[i]<60)
			System.out.println(names[i]);
					
	}

}
}
