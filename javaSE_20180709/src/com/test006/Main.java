package com.test006;

import com.test006.Member;

public class Main {

	public static void main(String[] args) {
		
		Member member1 = new Member("Jeon", "M001", "Jeonkakao", "010-1111-2222", 26);
		System.out.println(member1.name);
		System.out.println(member1.memberNumber);
		System.out.println(member1.age);
		System.out.println(member1.kakaoID);
		System.out.println(member1.call);
		System.out.println(member1.group);
		
		System.out.println("-------------------");
		
		Member member2 = new Member("Park", "M002", "Parkkakao", "010-2222-3333", 27);
		System.out.println(member2.name);
		System.out.println(member2.memberNumber);
		System.out.println(member2.age);
		System.out.println(member2.kakaoID);
		System.out.println(member2.call);
		System.out.println(member2.group);

	}

}
