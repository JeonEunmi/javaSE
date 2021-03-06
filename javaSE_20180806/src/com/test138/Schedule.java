package com.test138;

import java.io.Serializable;

//자료형 클래스 선언
//->Serializable 인터페이스 구현
public class Schedule implements Serializable {

	private static final long serialVersionUID = 4109260190659700349L;
	
	//자료 항목에 따른 필드 구성
	//->번호, 날짜, 내용 
	private String sid;
	private String scheduleDate;
	private String scheduleContent;
	
	//생성자 -> 기본 생성자, 매개변수 있는 생성자
	public Schedule() {
		
	}
	public Schedule(String sid, String scheduleDate, String scheduleContent) {
		//필드 초기화 액션 추가
		this.sid = sid;
		this.scheduleDate = scheduleDate;
		this.scheduleContent = scheduleContent;
	}
	
	//getter, setter
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
	
	//toString() 메소드
	public String toString() {
		return String.format("%s / %s / %s"
					, this.getSid(), this.getScheduleDate(), this.getScheduleContent() );
	}
	
}
