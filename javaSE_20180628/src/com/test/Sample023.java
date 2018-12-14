package com.test;

public class Sample023 {

	public static void main(String[] args) {

		// if문
		// 성적(점수) 분석 및 등급 출력
		// 점수는 0 ~ 100 범위에 있다. 등급은 A, B, C, D, F 등급으로 구분
		// A : 90점 이상, B : 80점 이상, C : 70점 이상, D : 60점 이상, F 60점 미만

		int score = 65;

		if (score >= 90) {
			System.out.println("A등급");
		} 
		if (80 <= score && score < 90) {
			System.out.println("B등급");
		} 
		if (70 <= score && score < 80) {
			System.out.println("C등급");
		} 
		if (60 <= score && score < 70) {
			System.out.println("D등급");
		} 
		if (score < 60) {
			System.out.println("F등급");
		}

	}
}

 