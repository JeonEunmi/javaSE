package com.member04;

import java.util.*;
//메인 메뉴별 액션 클래스 선언 + 저장소 운영
public class SubMain {
	
	// 필드 구성 -> MemberList 클래스의 객체 준비
	private MemberList memberList = new MemberList();
	
	//1. 회원정보입력 메뉴 메소드
	
	public void join(Scanner sc) {
		
		// 외부 입력을 이용해서 이름, 전화번호, 이메일, 등록일자
		// 회원번호('M01' 형태) -> 자동 증가 액션 처리
		String mid = this.memberList.autoMid();
		
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
		
		//회원번호, 이름, 전화번호, 이메일, 등록일 정보를 Member 객체로 만든다.
		Member m = new Member(mid, name, callNum, mail, registrationDate);
		
		this.memberList.join(m);
		
		//메세지출력 "회원이 등록되었습니다."
		System.out.println("회원이 등록되었습니다.");
		
		System.out.println("=============================================");
		System.out.println();
			
		}
	
	//2. 회원정보출력 메뉴 메소드
	public void memberOutput() {
		System.out.println();
		System.out.println("=======================================");
		System.out.println("             회  원  정  보            ");
		System.out.println("=======================================");
		// 회원정보를 반환하는 메소드 호출
		// -> 배열 자료형
		// -> 출력
		
		Member[] temp = this.memberList.memberOutput();
		int count = temp.length;
		
		System.out.println("총 " + count + "건");
		for(int i = 0; i < count; i++) {
			System.out.println(String.format("%s", temp[i]));			
		}
		System.out.println();
	}
	
	//3. 회원정보검색 메뉴 메소드
	public void memberSearch(Scanner sc) {
		
		// 서브메뉴 운영 액션
		// 1. 이름기준  2.전화번호기준 3.이메일기준 4.등록일(yyyy-mm) 기준 5.종료
		System.out.println("=======================================");
		System.out.println("**회원검색 시스템**");
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. 이름기준 | 2.전화번호기준 | 3.이메일기준 | 4. 등록일(yyyy-mm) 기준 | 5.종료");
			System.out.print("선택 > ");
			
			int selectNum = sc.nextInt();
			sc.nextLine();
			
			switch(selectNum) {
			
			//private method로 연결한다.
			case 1 :
				this.memberSearchName(sc);
				break;
			
			case 2 :
				this.memberSearchCallNum(sc);
				break;
			
			case 3 :
				this.memberSearchMail(sc);
				break;
				
			case 4 :
				this.memberSearchRegDate(sc);
				break;
				
			case 5 :
				flag = false;
				break;
				
			default : 
				break;
			}
			
		}
	}
	
	//private method 이름기준검색
	
	private void memberSearchName(Scanner sc) {
		
		System.out.print("이름 > ");
		String name = sc.nextLine();
		
		System.out.println();
		System.out.println("=======================================");
		
		Member[] temp = this.memberList.memberSearchName(name);
		
		System.out.println("총 " + temp.length + "건");
		
		if(temp.length == 0) {
			System.out.println("검색결과가 없습니다.");
		} else {
			for(int i = 0; i < temp.length; i++) {
				System.out.println(String.format("%s", temp[i]));			
			}
		}
		
		System.out.println("=======================================");
		System.out.println();
		
	}
	private void memberSearchCallNum(Scanner sc) {
		
		System.out.print("전화번호> ");
		String callNum = sc.nextLine();
		
		System.out.println();
		System.out.println("=======================================");
		
		Member[] temp = this.memberList.memberSearchCallNum(callNum);
		
		if(temp.length == 0) {
			System.out.println("검색결과가 없습니다.");
		} else {
			for(int i = 0; i < temp.length; i++) {
			System.out.println(String.format("%s", temp[i]));
			}
		}
		
		
		System.out.println("=======================================");
		System.out.println();
	
		}
	
	
	
	private void memberSearchMail(Scanner sc) {

		System.out.print("메일주소 > ");
		String mail = sc.nextLine();
		
		System.out.println("=======================================");
		System.out.println();
	
		Member[] temp = this.memberList.memberSearchMail(mail);
		
		if(temp.length == 0) {
			System.out.println("검색결과가 없습니다.");
		} else {
			for(int i = 0; i < temp.length; i++) {
			System.out.println(String.format("%s", temp[i]));
			}
		}
		
		System.out.println("=======================================");
		System.out.println();
	
		
		}
	
	private void memberSearchRegDate(Scanner sc) {

		System.out.print("등록일 (yyyy-mm) > ");
		String regDate = sc.nextLine();
		
		System.out.println();
		System.out.println("=======================================");
		
		Member[] temp = this.memberList.memberSearchRegDate(regDate);
		
		if(temp.length == 0) {
			System.out.println("검색결과가 없습니다.");
		} else {
			for(int i = 0; i < temp.length; i++) {
			System.out.println(String.format("%s", temp[i]));
			}
		}

		System.out.println("=======================================");
		System.out.println();
	}
	
	

}