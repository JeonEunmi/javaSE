package com.test024;

//ȸ�������� ǥ���ϴ� Ŭ���� ����
public class Member {

	//state �м� -> ȸ����ȣ, �̸�, ��ȭ��ȣ, .. -> field ǥ�� -> private ���� ������
	
	private String memberNum;
	private String name;
	private String callNum;
	public String group = "�ֿ뱳������";

	//private field�� ���� getter, setter ����
	/*
	public ��ȯ�ڷ��� getXXXX() {
		return ��ȯ��;
	} 
	public void setXXXX(�ڷ��� ����) {
		this.���� = ����;
	} 
	*/
	
	public String getMemberNum() {
		return this.memberNum;
	}
	
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
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
	
	public String group() {
		return this.group;
	}
}

