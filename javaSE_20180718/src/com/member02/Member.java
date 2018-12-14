package com.member02;

// �ڷ��� Ŭ���� ����
public class Member {
	
	// �ڷ� �׸� ���� �ʵ� ����
	private String memberNum;
	private String name;
	private String callNum;
	private String mail;
	private String registrationDate;
	
	// ������ -> �⺻ ������, �Ű����� �ִ� ������
	public Member() {
		
	}
	
	public Member(String memberNum, String name, String callNum, String mail, String registrationDate) {
		this.memberNum = memberNum;
		this.name = name;
		this.callNum = callNum;
		this.mail = mail;
		this.registrationDate = registrationDate;
	}
	
	// getter, setter
	
	public String getMemberNum() {
		return this.memberNum;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCallNum() {
		return this.callNum;
	}
	
	public void setCallNum(String callNum) {
		this.callNum = callNum;
	}
		
	public String getMail() {
		return this.mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getRegistrationDate() {
		return this.registrationDate;
	}
	
	// toString()�޼ҵ�
	
	public String toString(){
		String result = "";
		result = String.format("ȸ����ȣ : %s | ȸ���̸� : %s | ��ȭ��ȣ : %s | ���� : %s | ����� : %s",
				this.getMemberNum(), this.getName(), this.getCallNum(), this.getMail(), this.getRegistrationDate());
		return result;
	}
}
