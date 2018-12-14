package com.test073;

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
		this.name = name;
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

	// Object equals () �޼ҵ忡 ���� �������̵�
	// -> �����ּ� �� ����� ȸ�����̵� �� ������� ����
	// -> ���� �޼ҵ� �ñ״�ó ������ ��
	// -> �� ����� Member ��ü�� Object �ڷ����� ���� obj�� ���� -> ������
	@Override
	public boolean equals(Object obj) {
		
		//Member ��ü�� Object �ڷ��� ������ ����Ǹ�
		//->���� ������ ��� ����
		//->������ Member ��ü�� ����ȯ �ʿ�
		//->(�ڽ��ڷ���Ŭ����)�θ��ڷ�������
		boolean result = false;
		Member m = (Member)obj;
		if (this.getMid().equals(m.getMid())) {
			result = true;
		} 
		return result;
		
	}

}
