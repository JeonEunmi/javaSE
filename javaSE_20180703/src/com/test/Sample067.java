package com.test;

public class Sample067 {

	public static void main(String[] args) {
		// 주민번호(년월일-성별...)에서 성별 구분
		// 1, 3 -> 남자
		// 2, 4 -> 여자

		String ssn = "930831-2345678";

		char gender = ssn.charAt(7); // 문자 2

		if (gender == 1 || gender == 3) {
			System.out.println("성별은 남자입니다.");
		} else {
			System.out.println("성별은 여자입니다.");
		}
	}

}
