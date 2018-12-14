package com.test;

public class Sample033 {

	public static void main(String[] args) {
		
		int score = (int)(Math.random()*101);
		
		System.out.println("점수는"+score+"입니다.");
		
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

	}

}
