package com.schedule07;

import java.util.*;

// 메인 메뉴 운영 클래스 선언
public class Main {

	public static void main(String[] args) {
		// 일정 관리 v1.2 (콘솔 버전)
		/*
		1. 요구분석
		- 일정 입력, 일정 출력 및 검색(오늘 기준, 특정 일 기준, 특정 월 기준, 특정 단어 기준, 전체)
		- 일정 출력시 익명 구현 객체를 이용한 정렬 기능 지원
		- 클래스 4개(Schedule, ScheduleList, SubMain, Main) 사용
		- List 컬렉션 저장소 사용
		- 일정 삭제 기능 추가
 		*/
		SubMain sub = new SubMain();

		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int selectNum = 0;
		
		System.out.println("** 일정 관리 v1.2 **");
		
		while(flag) {
		System.out.println("==================================================================");
		System.out.println("1. 일정 입력  |  2. 일정 출력 및 검색  |  3. 일정삭제  |  4. 종료");
		System.out.println("==================================================================");
		System.out.print("선택 > ");
		selectNum = sc.nextInt();
		sc.nextLine();
		
		switch(selectNum) {
		
		case 1 : 
			sub.scheduleAdd(sc);
			break;
		
		case 2 :
			sub.scheduleSearch(sc);
			break;
			
		case 3 :
			sub.scheduleRemove(sc);
			break;
			
		case 4 :
			flag = false;
		}
		
		}
		
		sc.close();
		System.out.println("프로그램 종료");
	}

}
