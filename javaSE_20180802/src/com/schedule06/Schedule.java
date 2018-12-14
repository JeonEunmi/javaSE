package com.schedule06;

public class Schedule {
	
	// �ڷ��� Ŭ���� ����
	
	// �ڷ� �׸� ���� �ʵ� ����
	// ->��ȣ, ��¥, ����
	private String sid;
	private String scheduleDate;
	private String scheduleContent;
	
	// ������ -> �⺻ ������, �Ű����� �ִ� ������
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
	
	// toString() �޼ҵ�
	public String toString() {
		String result = "";
		result = String.format("%s		%s  %s",this.getSid(), this.getScheduleDate(), this.getScheduleContent());
		return result;
	}


}
