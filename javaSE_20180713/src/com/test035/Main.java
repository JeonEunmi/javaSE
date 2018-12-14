package com.test035;

import com.test035.Member;

public class Main {

	public static void main(String[] args) {
		
		Member member1 = new Member("Jeon", "M001", "Jeonkakao", "010-1111-2222", 26);
		System.out.printf("%s, %s, %s, %s, %s%n", member1.getName(), member1.getMemberNumber(), member1.getAge(), member1.getKakaoID(), member1.getCall(), member1.getGroup());
		
		System.out.println("-----------------------------------------");
		
		Member member2 = new Member("Park", "M002", "Parkkakao", "010-2222-3333", 27);
		System.out.printf("%s, %s, %s, %s, %s%n", member2.getName(), member2.getMemberNumber(), member2.getAge(), member2.getKakaoID(), member2.getCall(), member2.getGroup());
		
		//객체의 상태값 수정 -> setter
		
		System.out.println("-----------------------------------------");
		member1.setCall("010-3333-4444");
		System.out.printf("수정 후 -> %s, %s, %s, %s, %s%n", member1.getName(), member1.getMemberNumber(), member1.getAge(), member1.getKakaoID(), member1.getCall(), member1.getGroup());

	}

}
