package com.test122;

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
		return  "[" + this.getName() + ", " + this.getPhone() + "]" ;
				
	}


	
	
	
}
