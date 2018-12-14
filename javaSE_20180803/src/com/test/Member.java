package com.test;

public class Member {

	private String name, phone;

	// �⺻������, �Ű����� �ִ� ������
	// getter, setter
	// toString() equals(), hashCode() -> Overriding
	public Member() {

	}

	public Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

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

	@Override
	public String toString() {
		return  "[" + name + "," + phone + "]";
	}

	@Override
	public int hashCode() {
		// ������ �̸��� ���� ��� ������ �ؽ��ڵ� ��ȯ
		return this.getName().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// �̸�, ��ȭ��ȣ ��ġ ���� �˻� ���� �߰�
		Member other = (Member)obj;
		boolean result1 = this.getName().equals(other.getName());
		boolean result2 = this.getPhone().equals(other.getPhone());
		return result1 && result2;
	}


	
	
}
