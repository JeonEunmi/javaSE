package com.test;

public class Sample037 {

	public static void main(String[] args) {
		// if, switch 사용
		// 과목1, 과목2, 과목3의 점수에 대해서
		// 평균이 60점 이상이면서 과목별 점수가 40점 이상인 경우 -> 합격
		// 평균이 60점 이상이지만, 과목 중에 40점 미만이 있는 경우 -> 과락
		// 평균이 60점 미만인 경우 -> 불합격

		int sub1 = (int) (Math.random() * 101);
		int sub2 = (int) (Math.random() * 101);
		int sub3 = (int) (Math.random() * 101);

		double avg = (sub1 + sub2 + sub3) / 3.0;

		System.out.println("sub1 점수 : " + sub1);
		System.out.println("sub2 점수 : " + sub2);
		System.out.println("sub3 점수 : " + sub3);

		if (avg >= 60) {
			if (sub1 >= 40 && sub2 >= 40 && sub3 >= 40) {
				System.out.println("합격");
			} else {
				System.out.println("과락");
			}
		} else {
			System.out.println("불합격");
		}

	}

}
