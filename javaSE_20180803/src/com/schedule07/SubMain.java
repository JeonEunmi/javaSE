package com.schedule07;

import java.time.LocalDate;
import java.util.*;

// 저장소 + 메인 메뉴별 액션 클래스 선언
public class SubMain {

	private ScheduleList s = new ScheduleList();

	// public method
	// 1. 일정 입력 메뉴 메소드
	public void scheduleAdd(Scanner sc) {
		// 콘솔 액션 필요
		System.out.println("");
		System.out.print("날짜(YYYY-MM-DD)? ");
		String scheduleDate = sc.nextLine();
		System.out.print("내용(200자 이내)? ");
		String scheduleContent = sc.nextLine();

		String sid = s.autoGid();

		Schedule tmp = new Schedule(sid, scheduleDate, scheduleContent);
		this.s.scheduleAdd(tmp);
		
		System.out.println("일정이 입력되었습니다.");

	}

	// public method
	// 2. 일정 출력 및 검색 메뉴 메소드
	public void scheduleSearch(Scanner sc) {

		while (true) {

			System.out.println();
			System.out.println("======================================================");
			System.out.println("1. 오늘 일정  |  2. 특정 일 일정  |  3. 특정 월 일정 ");
			System.out.println("4. 특정 단어 포함 일정  |   5. 전체 일정   |  6. 종료");
			System.out.println("======================================================");
			System.out.print("선택> ");

			int selectNo = 0;

			selectNo = sc.nextInt();
			sc.nextLine();

			if (selectNo == 6)
				break;

			switch (selectNo) {

			case 1:
				this.todaySchedule();
				break;
			case 2:
				this.daySchedule(sc);
				break;
			case 3:
				this.monthSchedule(sc);
				break;
			case 4:
				this.wordSearch(sc);
				break;
			case 5:
				this.allSchedule();
				break;
			}
		}

	}

	// 서브 메뉴 구성
	// -> 1. 오늘 일정 2. 특정 일 일정 3. 특정 월 일정 4. 특정 단어 포함 일정 5. 전체 일정 6. 종료

	// private method
	// 1. 오늘 일정 메뉴 메소드
	private void todaySchedule() {

		String value = LocalDate.now().toString();

		this.print(this.s.scheduleSearch("today", value));
	}

	// private method
	// 2. 특정 일 일정 메소드
	private void daySchedule(Scanner sc) {

		System.out.print("특정일 (YYYY-MM-DD)? ");
		String value = sc.nextLine();

		// 검색 전용 메소드 호출
		// null 값 없는 사본 배열 반환
		// ->출력 전용 메소드 호출
		this.print(this.s.scheduleSearch("day", value));

	}


	// private method
	// 3. 특정 월 일정 메소드
	private void monthSchedule(Scanner sc) {
		System.out.print("특정월 (YYYY-MM)? ");
		String value = sc.nextLine();

		// 검색 전용 메소드 호출
		// null 값 없는 사본 배열 반환
		// ->출력 전용 메소드 호출
		this.print(this.s.scheduleSearch("month", value));
	}

	// private method
	// 4. 특정 단어 일정 메소드
	private void wordSearch(Scanner sc) {
		System.out.print("찾고자하는 검색 단어를 입력하세요. >  ");
		String value = sc.nextLine();

		this.print(this.s.scheduleSearch("content", value));
	}

	// private method
	// 5. 전체 일정 메소드
	private void allSchedule() {
		// 출력시 일정 정보가 날짜순으로 정렬된 상태로 출력되도록 한다.
		/*
		 * this.idx가 null값이 들어있을 경우 정확하지 않을 수 있어서 count로 갯수를 다시 세어주는 것이 좋다. int count =
		 * 0; for (Schedule s : schedule){ if( s != null) ++count; }
		 */


		// 출력 전용 메소드 호출 -> print()
		this.print(this.s.allSchedule());
	}

	public void scheduleRemove(Scanner sc) {
		
		while (true) {
			
			System.out.println();
			System.out.println("========================================================");
			System.out.println("1. 특정 번호 일정  |  2. 특정 일 일정  |  3. 특정 월 일정 ");
			System.out.println("4. 특정 단어 포함 일정  |   5. 전체 일정   |  6. 종료");
			System.out.println("========================================================");
			System.out.print("선택> ");
			
			int selectNo = 0;
			
			selectNo = sc.nextInt();
			sc.nextLine();
			
			if (selectNo == 6)
				break;
			
			switch (selectNo) {
			
			case 1:
				this.scheduleRemoveSid(sc);
				break;
			case 2:
				this.scheduleRemoveDate(sc);
				break;
			case 3:
				this.scheduleRemoveMonth(sc);
				break;
			case 4:
				this.scheduleRemoveWord(sc);
				break;
			case 5:
				this.scheduleRemoveAll(sc);
				break;
			}
		}
	}
	
	private void scheduleRemoveSid(Scanner sc) {
		// 1. 특정 조건 확인
		// 2. 특정 조건을 만족하는 일정을 검색하고 출력
		// 3. 삭제 여부 확인
		// 4. 특정 조건을 만족하는 일정에 대한 삭제 진행 -> remove() 메소드
		System.out.print("삭제할 번호를 입력하세요. > ");
		String removeSid = sc.nextLine();
		
		
		this.print(this.s.scheduleSearch("sid", removeSid));
		
		// 삭제 여부 확인 + 삭제 진행 메소드
		this.scheduleRomovePrint(sc, "sid", removeSid);
		
		
	}
	private void scheduleRemoveDate(Scanner sc) {
		
		System.out.print("삭제할 날짜(YYYY-MM-DD)를 입력하세요. > ");
		String removeDate = sc.nextLine();
		
		
		this.print(this.s.scheduleSearch("day", removeDate));
		
		
		this.scheduleRomovePrint(sc, "day", removeDate);
		
	}
	private void scheduleRemoveMonth(Scanner sc) {
		
		System.out.print("삭제할 월(YYYY-MM)을 입력하세요. > ");
		String removeMonth = sc.nextLine();
		
		
		this.print(this.s.scheduleSearch("month", removeMonth));
		
		this.scheduleRomovePrint(sc, "month", removeMonth);
		
	}
	private void scheduleRemoveWord(Scanner sc) {
		System.out.print("삭제할 단어를 입력하세요. > ");
		String removeWord = sc.nextLine();
		
		
		this.print(this.s.scheduleSearch("content", removeWord));
		
		this.scheduleRomovePrint(sc, "content", removeWord);
		
	}
	private void scheduleRemoveAll(Scanner sc) {
		// 1. 전체 일정 출력
		// 2. 삭제 여부 확인
		// 3. 전체 일정 삭제 진행 -> clear() 메소드
		
		System.out.println();
		System.out.println("전체 삭제를 진행합니다.");
		System.out.println("정말 삭제하겠습니까? (Y/N)");
		String num = sc.nextLine();
		
		if(num.equalsIgnoreCase("Y")) {
			this.s.scheduleRemoveAll();
			System.out.println("삭제 작업이 완료 되었습니다.");
		} else {
			System.out.println("삭제 작업이 취소 되었습니다.");
		}
		
	}
	// private method
	// -> 정렬 + 출력 액션 메소드
	// -> null 값이 없는 배열을 외부에서 전달 받는다.
	private void print(List<Schedule> allSchedule) {

		System.out.println("======================================================");
		System.out.println("번호		날짜	    내용");
		System.out.println("======================================================");

		// 정렬 액션 추가
		// Arrays.sort(allSchedule);

		// 정렬 액션
		Collections.sort(allSchedule, new Comparator<Schedule>() {

			@Override
			public int compare(Schedule o1, Schedule o2) {
				return o1.getScheduleDate().compareTo(o2.getScheduleDate());
			}

		});

		// 출력 액션
		int count = allSchedule.size();
		for (Schedule s : allSchedule) {
			System.out.println(s.toString());
		}
		System.out.println("------------------------------------------------------");
		System.out.println("총 " + count + "건");

	}
	
	private void scheduleRomovePrint(Scanner sc, String key, String value) {
		
		System.out.println();
		System.out.println("**삭제를 진행합니다.");
		System.out.println("정말 삭제하겠습니까? (Y/N)");
		
		String num = sc.nextLine();
		
		if(num.equalsIgnoreCase("Y")) {
			int count = this.s.scheduleRemove(key, value);
			System.out.println(count + "건의 일정 삭제가 완료 되었습니다.");
		} else {
			System.out.println("일정 삭제가 취소 되었습니다.");
		}
	}
	

}
