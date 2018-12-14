package com.test01;

// 정렬 지원을 위한 인터페이스 구현
public class Schedule implements Comparable <Schedule>{
	
	// 자료형 클래스 선언
	
	// 자료 항목에 따른 필드 구성
	// ->번호, 날짜, 내용
	private String sid;
	private String scheduleDate;
	private String scheduleContent;
	
	// 생성자 -> 기본 생성자, 매개변수 있는 생성자
	public Schedule() {
		
	}
	
	public Schedule(String sid, String scheduleDate, String scheduleContent) {
		this.sid = sid;
		this.scheduleDate = scheduleDate;
		this.scheduleContent = scheduleContent;
	}
	
	// getter, setter
	public String getSid() {
		return this.sid;
	}
	
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	public String getScheduleDate() {
		return this.scheduleDate;
	}
	
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	
	public String getScheduleContent() {
		return this.scheduleContent;
	}
	
	public void setScheduleContent(String scheduleContent) {
		this.scheduleContent = scheduleContent;
	}
	
	// toString() 메소드
	public String toString() {
		String result = "";
		result = String.format("%s		%s  %s",this.getSid(), this.getScheduleDate(), this.getScheduleContent());
		return result;
	}

	// 정렬 지원을 위한 메소드 구현
	@Override
	public int compareTo(Schedule o) {
		return this.getScheduleDate().compareTo(o.getScheduleDate());
	}
	
}
