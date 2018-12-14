package com.member03.ver3;

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
		System.out.println();
		
		
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
	
	//private method 이름기준검색
	
	private void memberSearchName(Scanner sc) {
		
		System.out.print("이름 > ");
		String name = sc.nextLine();
		int count = 0;

		this.print(this.memberSearch("nameSearch", name));

		
	}
	private void memberSearchCallNum(Scanner sc) {
		
		System.out.print("전화번호> ");
		String callNum = sc.nextLine();
		int count = 0;

		this.print(this.memberSearch("callSearch", callNum));

		}
	
	
	
	private void memberSearchMail(Scanner sc) {

		System.out.print("메일주소 > ");
		String mail = sc.nextLine();
		int count = 0;

		this.print(this.memberSearch("mailSearch", mail));
		

		}
	
	private void memberSearchRegDate(Scanner sc) {

		System.out.print("등록일 (yyyy-mm) > ");
		String regDate = sc.nextLine();
		int count = 0;

		this.print(this.memberSearch("regDateSearch", regDate));
		
	}
	
	private void print(Member[] memberList) {

		System.out.println("======================================================");


		// 출력 액션
		int count = memberList.length;
		for (Member s : memberList) {
			System.out.println(s.toString());
		}

		System.out.println("------------------------------------------------------");
		System.out.println("총 " + count + "건");

		System.out.println("======================================================");
	}
	
	//검색 전용 메소드 private method
	private Member[] memberSearch(String key, String value) {
		
		Member[] memberSearchList = new Member[this.idx];
		
		int a = 0;
		
		for(Member i : this.memberArray) {
			
			if(i != null) {
				String tmp = null;
				
				if(key.equals("nameSearch")) {
					tmp = i.getName();
				} else if(key.equals("callSearch")) {
					tmp = i.getCallNum();
				} else if (key.equals("mailSearch")) {
					tmp = i.getMail();
				} else if (key.equals("regDateSearch")) {
					tmp = i.getRegistrationDate();
				}
				
				if(tmp.contains(value)) {
					memberSearchList[a] = i;
					++a;
				}
				
			}
		}
		
		return Arrays.copyOfRange(memberSearchList, 0, a);
	}

}