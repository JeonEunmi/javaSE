package com.schedule01;

import java.time.LocalDate;
import java.util.*;

// 저장소 + 메인 메뉴별 액션 클래스 선언
public class SubMain {

	// 필드 선언 -> 배열 저장소 운영
	private Schedule[] scheduleArray = new Schedule[10];

	private int idx;

	// 생성자 -> 필드 초기화
	public SubMain() {
		scheduleArray[this.idx] = new Schedule("S001", "2018-01-01", "신정");
		++this.idx;
		scheduleArray[this.idx] = new Schedule("S002", "2018-12-25", "크리스마스");
		++this.idx;
		scheduleArray[this.idx] = new Schedule("S003", "2018-06-06", "현충일");
		++this.idx;
		scheduleArray[this.idx] = new Schedule("S004", "2018-08-15", "광복절");
		++this.idx;
		scheduleArray[this.idx] = new Schedule("S005", "2018-03-01", "삼일절");
		++this.idx;
		scheduleArray[this.idx] = new Schedule("S006", "2018-10-03", "개천절");
		++this.idx;
		scheduleArray[this.idx] = new Schedule("S007", "2018-10-09", "한글날");
		++this.idx;
	}

	// public method
	// 1. 일정 입력 메뉴 메소드
	public void scheduleAdd(Scanner sc) {
		// 콘솔 액션 필요
		System.out.println("");
		System.out.print("날짜(YYYY-MM-DD)? ");
		String scheduleDate = sc.nextLine();
		System.out.print("내용(200자 이내)? ");
		String scheduleContent = sc.nextLine();

		String sid = String.format("S%03d", (this.idx) + 1);

		this.scheduleArray[this.idx] = new Schedule(sid, scheduleDate, scheduleContent);
		++this.idx;
		System.out.println("일정이 입력되었습니다.");

		if (this.scheduleArray.length == this.idx) {
			this.extendArray(this.scheduleArray);
		}
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

		this.print(this.scheduleSearch("today", value));
	}

	// private method
	// 2. 특정 일 일정 메소드
	private void daySchedule(Scanner sc) {

		System.out.print("특정일 (YYYY-MM-DD)? ");
		String value = sc.nextLine();

		// 검색 전용 메소드 호출
		// null 값 없는 사본 배열 반환
		// ->출력 전용 메소드 호출
		this.print(this.scheduleSearch("day", value));

	}

	// private method
	// 3. 특정 월 일정 메소드
	private void monthSchedule(Scanner sc) {
		System.out.print("특정월 (YYYY-MM)? ");
		String value = sc.nextLine();

		// 검색 전용 메소드 호출
		// null 값 없는 사본 배열 반환
		// ->출력 전용 메소드 호출
		this.print(this.scheduleSearch("month", value));
	}

	// private method
	// 4. 특정 단어 일정 메소드
	private void wordSearch(Scanner sc) {
		System.out.print("찾고자하는 검색 단어를 입력하세요. >  ");
		String value = sc.nextLine();
		
		this.print(this.scheduleSearch("content", value));
	}

	// private method
	// 5. 전체 일정 메소드
	private void allSchedule() {
		// 출력시 일정 정보가 날짜순으로 정렬된 상태로 출력되도록 한다.
		/*
		 * this.idx가 null값이 들어있을 경우 정확하지 않을 수 있어서 count로 갯수를 다시 세어주는 것이 좋다. int count =
		 * 0; for (Schedule s : schedule){ if( s != null) ++count; }
		 */

		// null 값을 제외한 일정 정보만 들어있는 사본 배열 만든다.
		Schedule[] sch = new Schedule[this.idx];
		int i = 0;
		for (Schedule s : this.scheduleArray) {
			if (s != null) {
				sch[i] = s;
				++i;
			}
		}

		// 출력 전용 메소드 호출 -> print()
		this.print(sch);
	}

	// private method
	// -> 정렬 + 출력 액션 메소드
	// -> null 값이 없는 배열을 외부에서 전달 받는다.
	private void print(Schedule[] allSchedule) {

		System.out.println("======================================================");
		System.out.println("번호		날짜	    내용");
		System.out.println("======================================================");

		// 정렬 액션 추가
		Arrays.sort(allSchedule);

		// 출력 액션
		int count = allSchedule.length;
		for (Schedule s : allSchedule) {
			System.out.println(s.toString());
		}

		System.out.println("------------------------------------------------------");
		System.out.println("총 " + count + "건");

	}

	// 배열 저장소
	private void extendArray(Schedule[] schedule) {

		schedule = Arrays.copyOf(schedule, schedule.length + 10);

		this.scheduleArray = schedule;

		System.out.println();
		System.out.println("*****************  경    고  *****************");
		System.out.println("배열 저장소 초과. 자동으로 10개 증가시킵니다.");
		System.out.println("**********************************************");
		System.out.println();

	}

	// private method
	// -> 검색 전용 메소드
	// -> 검색 진행은 매개 변수가 String key, String value로 고정
	private Schedule[] scheduleSearch(String key, String value) {

		// key -> 검색 기준, 예를 들어, "특정일"
		// value -> 검색 단어. 예를 들어 "2018-07-19"
		// 검색 결과에 null 은 없음

		// 검색 결과 저장용 임시 배열 준비
		Schedule[] scheduleList = new Schedule[this.idx];

		int a = 0;
		
		// 배열 저장소에 있는 일정 정보를 검색하기 위한 반복문
		for(Schedule s : this.scheduleArray) {
			if(s != null) {
				//검색 기준(key)과 검색 단어(value)에 맞는 일정
				//임시 배열에 저장
				String temp = null;
				if(key.equals("today") || key.equals("day") || key.equals("month")) {
					temp = s.getScheduleDate();
				}
				
				if(key.equals("content")) {
					temp = s.getScheduleContent();
				}
				
				if(temp.contains(value)) {
					scheduleList[a] = s;
					++a;
				}
			}
		}

		return Arrays.copyOfRange(scheduleList, 0, a);
	}
}
