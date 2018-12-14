package com.schedule06;

import java.util.*;
// 저장소 운영
public class ScheduleList {

	// 필드 선언 -> List 컬렉션 저장소 운영
	private List<Schedule> scheduleArray = new ArrayList<Schedule>();

	// 생성자 -> 필드 초기화
	public ScheduleList() {
		
		this.scheduleArray.add(new Schedule("S001", "2018-01-01", "신정"));
		this.scheduleArray.add(new Schedule("S002", "2018-12-25", "크리스마스"));
		this.scheduleArray.add(new Schedule("S003", "2018-06-06", "현충일"));
		this.scheduleArray.add(new Schedule("S004", "2018-08-15", "광복절"));
		this.scheduleArray.add(new Schedule("S005", "2018-03-01", "삼일절"));
		this.scheduleArray.add(new Schedule("S006", "2018-10-03", "개천절"));
		this.scheduleArray.add(new Schedule("S007", "2018-10-09", "한글날"));
		
	}

	// 번호 자동 증가 메소드
	public String autoGid() {

		String result = "";
		result = String.format("S%03d", (this.scheduleArray.size() + 1));
		return result;

	}

	// 스케쥴 입력
	public void scheduleAdd(Schedule schedule) {

		this.scheduleArray.add(schedule);

	}

	// 출력 메소드
	public List<Schedule> allSchedule() {

		return this.scheduleArray;

	}

	// private method
	// -> 검색 전용 메소드
	// -> 검색 진행은 매개 변수가 String key, String value로 고정
	public List<Schedule> scheduleSearch(String key, String value) {

		// key -> 검색 기준, 예를 들어, "특정일"
		// value -> 검색 단어. 예를 들어 "2018-07-19"
		// 검색 결과에 null 은 없음

		// 검색 결과 저장용 임시 배열 준비
		List<Schedule> scheduleList = new ArrayList<Schedule>();

		// 배열 저장소에 있는 일정 정보를 검색하기 위한 반복문
		for (Schedule s : this.scheduleArray) {
			
				String temp = null;
				if (key.equals("today") || key.equals("day") || key.equals("month")) {
					temp = s.getScheduleDate();
				}

				if (key.equals("content")) {
					temp = s.getScheduleContent();
				}

				if (temp.contains(value)) {
					scheduleList.add(s);
				}
		}

		return scheduleList;
	}

}
