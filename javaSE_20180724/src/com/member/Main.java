package com.member;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		Member m1 = new Member("M03", "kim", "1234");
		Member m2 = new Member("M01", "hong", "5678");
		Member m3 = new Member("M02", "park", "9012");
		Member m4 = new Member("M04", "choi", "4567");

		// null�� ���� �迭 �غ�
		Member[] members = new Member[4];

		// Member ��ü�� ����
		members[0] = m1;
		members[1] = m2;
		members[2] = m3;
		members[3] = m4;

		// ���� ��
		// ��ü ��� ���
		for (Member m : members) {
			System.out.println(m.toString());
		}

		// ȸ�����̵� ���� ���� -> �͸� ���� ��ü ���
		Arrays.sort(members, new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				return o1.getMid().compareTo(o2.getMid());
			}

		});

		// ���� ��
		System.out.println("=======================================");
		// ��ü ��� ���
		for (Member m : members) {
			System.out.println(m.toString());
		}
	}

}
