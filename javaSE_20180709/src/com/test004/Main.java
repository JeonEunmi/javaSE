package com.test004;

public class Main {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		System.out.println("회원 이름 : \t" + member.name);
		System.out.println("회원 나이 : \t" + member.age);
		System.out.println("회원 생일 : \t" + member.birthday);
		System.out.println("전화번호 : \t" + member.call);
		System.out.println("이메일 : \t" + member.mail);
		

	}

}
