package com.test138;

import java.io.Serializable;

//�ڷ��� Ŭ���� ����
//->Serializable �������̽� ����
public class Schedule implements Serializable {

	private static final long serialVersionUID = 4109260190659700349L;
	
	//�ڷ� �׸� ���� �ʵ� ����
	//->��ȣ, ��¥, ���� 
	private String sid;
	private String scheduleDate;
	private String scheduleContent;
	
	//������ -> �⺻ ������, �Ű����� �ִ� ������
	public Schedule() {
		
	}
	public Schedule(String sid, String scheduleDate, String scheduleContent) {
		//�ʵ� �ʱ�ȭ �׼� �߰�
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
	
	//toString() �޼ҵ�
	public String toString() {
		return String.format("%s / %s / %s"
					, this.getSid(), this.getScheduleDate(), this.getScheduleContent() );
	}
	
}
