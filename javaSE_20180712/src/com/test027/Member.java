package com.test027;

//����� ���� �ڷ��� Ŭ����(������) ����
public class Member {
	
	//�ڷ� ������ ���ϴ� ��� �� �� �ִ�
	//-> ����, �ڷ���, ���� ������ ����
	//-> private �ʵ�(field)�� ����. ������, getter, setter �߰�
	private String name;
	private String phone;
	private int age;
	
	//����) getter, setter �ۼ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
