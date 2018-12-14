package com.test046;

public class Member {

	//�ʵ� ����
	//ȸ���� state �м� -> ȸ����ȣ('M001' ���� : ���ڿ�), �̸�, ����, ��ȣ, ... ->field ����
	// �Ҽ� ->"�ֿ뱳������" ���� -> ����� �ʱ�ȭ -> static field�� ����
	// ������(�޼ҵ�)�� �̿��� �ʵ��� �ʱ�ȭ ����
	
	//�ڵ� �ʱ�ȭ (1����)
	private String name;  //null
	private String memberNumber;  //null
	private String kakaoID;  //null
	private String call;  //null
	private int age;
	
	// static field
	// -> ��� ��ü(instance)�� ���� �����ϰ� �ȴ�.
	private static String dept = "�ֿ뱳������";
	
	//�⺻ ������ �߰�
	public Member() {
		
	}
	//������ �ʱ�ȭ (3����)
	public Member(String name, String memberNumber, String kakaoID, String call, int age) {
		this.name = name;
		this.memberNumber = memberNumber;
		this.kakaoID = kakaoID;
		this.call = call;
		this.age = age;
		
	}

	
	//getter -> �б� ����
	//setter -> ���� ����
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemberNumber() {
		return this.memberNumber;
	}

	public String getKakaoID() {
		return this.kakaoID;
	}

	public void setKakaoID(String kakaoID) {
		this.kakaoID = kakaoID;
	}

	public String getCall() {
		return this.call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getDept() {
		return Member.dept;
	}
	
	
	//ȸ�� ���� ��¿� ���� �޼ҵ�
	//toString() �޼ҵ�� �ڵ� ȣ��Ǵ� �޼ҵ��̴�.
	public String toString() {
		String result = "";
		// getDept() �޼ҵ�� static �����̹Ƿ� Member.getDept();
		result = String.format("%s, %s, %s, %s, %s, %s%n"
								, this.getName(), this.getMemberNumber(), this.getAge()
								, this.getKakaoID(), this.getCall(), Member.getDept());
		return result;
	}
	
	
	
}
