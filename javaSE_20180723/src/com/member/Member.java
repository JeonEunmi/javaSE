package com.member;

// ȸ�� ������ �����ϴ� Ŭ����
public class Member {

	// ȸ����ȣ(mid), �̸�(name), ��ȭ��ȣ(phone)
	private String mid, name, phone;

	// �⺻ ������
	public Member() {

	}

	// �Ű������� �ִ� ������
	public Member(String mid, String name, String phone) {
		this.mid = mid;
		this.name= name;
		this.phone = phone;
	}

	// getter, setter
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMid() {
		return this.mid;
	}

	@Override
	public String toString() {
		return "Member [mid=" + this.getMid() + ", name=" + this.getName() + ", phone=" + this.getPhone() + "]";
	}
	


	
}
