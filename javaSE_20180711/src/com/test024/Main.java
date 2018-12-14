package com.test024;

public class Main {
	
	public static void main(String[] args) {
		
		Member m1 = new Member();
		
		m1.setMemberNum("M001");
		
		m1.setName("Jeon");
		
		m1.setCallNum("010-1111-2222");
		
		System.out.printf("회원번호 : %s | 회원이름 : %s | 전화번호 : %s | 소속 : %s%n", m1.getMemberNum(), m1.getName(), m1.getCallNum(), m1.group);
		
		System.out.println("====================================================================================");
		
		Member m2 = new Member();
		
		m2.setMemberNum("M002");

		m2.setName("Park");
		
		m2.setCallNum("010-2222-3333");
		System.out.printf("회원번호 : %s | 회원이름 : %s | 전화번호 : %s | 소속 : %s%n", m2.getMemberNum(), m2.getName(), m2.getCallNum(), m2.group);
		
	}
}
