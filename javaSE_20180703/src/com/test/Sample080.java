package com.test;

import java.util.*;

public class Sample080 {

	public static void main(String[] args) {

		// 입력
		String[] names = {"park", "kim", "lee", "choi", "hong"};
		int[] scores = new int[5];
		
		// 외부 입력 액션
		// java.util 패키지의 Scanner 클래스
		// 점수 입력 -> nextInt() 메소드 -> scores 배열에 저장
		// 점수의 범위 -> 0~100
		Scanner scanner = new Scanner (System.in);
		
		for(int i = 0; i < scores.length; ++i) {
			System.out.print(names[i]+"의 성적을 입력해주세요. 점수는 0~100사이입니다. > ");
			int num = scanner.nextInt();
			scanner.nextLine();			
			while(num < 0 || num >100) {
				System.out.println("잘못된 점수를 입력하셨습니다. 다시 입력해주세요.");
				System.out.print(names[i]+"의 성적을 입력해주세요. 점수는 0~100사이입니다. > ");
				num = scanner.nextInt();
				scanner.nextLine();	
			}
				scores[i] = num;

		} 
		scanner.close();
		
		// 전체 명단 및 성적 출력
		System.out.println("---------------------------");
		for(int i=0; i<scores.length; ++i) {
		System.out.println(names[i]+ "의 성적은 " + scores[i] + "점 입니다.");
		
		}
		System.out.println("---------------------------");
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
