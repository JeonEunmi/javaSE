package com.member;

public class Main {

	public static void main(String[] args) {
		// Member Ŭ������ ��ü ����
		Member m1 = new Member("M01", "HONG", "010-1234-1234");
		Member m2 = new Member("M02", "JEON", "010-5678-5678");
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		// �迭 ����ҿ� ����
		Member[] memberList = new Member[5];
		memberList[0] = m1;
		memberList[1] = m2;
		
		// �迭 ����ҿ� ����� Member ��ü ���
		// -> null �� ����
		System.out.println("------------------------------------------------");
		for(Member m : memberList) {
			if(m != null) {
				// toString() �޼ҵ尡 ������ ����
				System.out.println(m);				
			}
		}

	}

}
