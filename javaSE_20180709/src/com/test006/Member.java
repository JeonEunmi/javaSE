package com.test006;

public class Member {

	//����)belong
	//�ʵ� ����
	//ȸ���� state �м� -> ȸ����ȣ('M001' ���� : ���ڿ�), �̸�, ����, ��ȣ, ... ->field ����
	// Ŭ������ ���� ��ü(instance) ���� -> �������� ��ü ����
	// ��ü�� ���°� ��� -> ������ ��ü�� �ٸ� ���°�
	// �Ҽ� ->"�ֿ뱳������" ���� -> ����� �ʱ�ȭ
	// ������(�޼ҵ�)�� �̿��� �ʵ��� �ʱ�ȭ ����
	
	String name;
	String memberNumber;
	String kakaoID;
	String call;
	String group = "�ֿ뱳������";
	int age;
	
	public Member(String name, String memberNumber, String kakaoID, String call, int age) {
		this.name = name;
		this.memberNumber = memberNumber;
		this.kakaoID = kakaoID;
		this.call = call;
		this.age = age;
		
	}
	
	
}
