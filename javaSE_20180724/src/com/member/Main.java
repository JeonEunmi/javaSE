package com.member;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		Member m1 = new Member("M03", "kim", "1234");
		Member m2 = new Member("M01", "hong", "5678");
		Member m3 = new Member("M02", "park", "9012");
		Member m4 = new Member("M04", "choi", "4567");

		// null값 없는 배열 준비
		Member[] members = new Member[4];

		// Member 객체들 저장
		members[0] = m1;
		members[1] = m2;
		members[2] = m3;
		members[3] = m4;

		// 정렬 전
		// 전체 명단 출력
		for (Member m : members) {
			System.out.println(m.toString());
		}

		// 회원아이디별 정렬 지원 -> 익명 구현 객체 사용
		Arrays.sort(members, new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				return o1.getMid().compareTo(o2.getMid());
			}

		});

		// 정렬 후
		System.out.println("=======================================");
		// 전체 명단 출력
		for (Member m : members) {
			System.out.println(m.toString());
		}
	}

}
