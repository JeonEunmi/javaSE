package com.member01;

import java.util.*;
//메인 메뉴별 액션 클래스 선언 + 저장소 운영
public class SubMain {
	
	// 필드 선언 -> 저장소 운영 -> 저장소 배열 10명
	
	private Member[] memberArray = new Member[10];
	
	// 생성자 선언 -> 필드 초기화
	
	private int idx;
	
	public SubMain() {
		memberArray[this.idx]= new Member("M01", "HONG", "010-2222-2222", "mail@do.com", "2018-07-18");
		++this.idx;
	}
	
	//1. 회원정보입력 메뉴 메소드
	
	public void join(Scanner sc) {
		
		// 외부 입력을 이용해서 이름, 전화번호, 이메일, 등록일자
		// 회원번호('M01' 형태) -> 자동 증가 액션 처리
		String mid = String.format("M%02d", this.idx + 1);
		
		System.out.println();
		System.out.println("=============================================");
		
		// 회원번호, 이름, 전화번호, 이메일, 등록일 정보를 Member
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String callNum = sc.nextLine();
		System.out.print("이메일 : ");
		String mail = sc.nextLine();
		System.out.print("등록일 : ");
		String registrationDate = sc.nextLine();
		
		// 배열 저장소에 Member 객체 저장
		
		this.memberArray[this.idx] = new Member(mid, name, callNum, mail, registrationDate); 
		
		// 인덱스 번호 1 증가
		++this.idx;
		
		//메세지출력 "회원이 등록되었습니다."
		System.out.println("회원이 등록되었습니다.");
		
		
		// 저장소배열 증가
		for(int i = 0; i < this.idx; ++i) {
			if(this.idx == memberArray.length) {
				this.extendArray(memberArray);
			}
			
		}
	}
	
	//2. 회원정보출력 메뉴 메소드
	public void memberOutput() {
		System.out.println();
		System.out.println("=======================================");
		
		for(Member i : this.memberArray) {
			if(i != null) {
				System.out.println(i);
			}
		}
		System.out.println("총 " + this.idx + "건");
		System.out.println("=======================================");
		System.out.println();
	}
	
	//private method - 배열 확장
	private void extendArray(Member[] member) {
		member = Arrays.copyOf(member, member.length + 10);
		this.memberArray = member;
		
		System.out.println();
		System.out.println("*****************  경    고  *****************");
		System.out.println("배열 저장소 초과. 자동으로 10개 증가시킵니다.");
		System.out.println("**********************************************");
		System.out.println();
	}
}
