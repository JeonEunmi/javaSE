package com.test;

public class Sample036 {

	public static void main(String[] args) {
		
		// 성적(점수) 0 ~ 100 분석
		int score = (int)(Math.random()*101);
		
		System.out.println("점수 : " + score);
		
		switch (score/10) {
		case 10 :
		case 9 :
			System.out.println("A등급입니다.");
			break;
		case 8 :
			System.out.println("B등급입니다.");
			break;
		case 7 :
			System.out.println("C등급입니다.");
			break;
		case 6 :
			System.out.println("D등급입니다.");
			break;
		default :
			System.out.println("F등급입니다.");
		}
		
		/*		 
		if(score>=90) {
			System.out.println("A등급입니다.");
		} else if (score>=80) {
			System.out.println("B등급입니다");
		} else if (score>=70) {
			System.out.println("C등급입니다");
		} else if (score>=60) {
			System.out.println("D등급입니다.");
		} else {
			System.out.println("F등급입니다.");			
		}
		*/
	}

}
