package com.test039;

public class Main {

	public static void main(String[] args) {
		
		Member member1 = new Member("Jeon", "M001", "Jeonkakao", "010-1111-2222", 26);
		System.out.println(member1);
		
		System.out.println("-----------------------------------------");
		
		Member member2 = new Member("Park", "M002", "Parkkakao", "010-2222-3333", 27);
		System.out.println(member2.toString());
		
		//객체의 상태값 수정 -> setter
		System.out.println("-----------------------------------------");
		member1.setCall("010-3333-4444");
		System.out.printf("수정 후 -> " + member1);

	}

}
