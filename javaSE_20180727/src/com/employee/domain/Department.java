package com.employee.domain;

// �μ� ���� �ڷ��� Ŭ����
public class Department {

	// �μ���ȣ, �μ���
	// -> field, constructor, getter, setter, toSting();
	
	// �ʵ�
	private String departmentID, departmentName;
	
	// �⺻ ������
	public Department() {
		
	}
	
	// �Ű������� �ִ� ������
	public Department(String departmentID, String departmentName) {
		this.departmentID = departmentID;
		this.departmentName = departmentName;
	}

	// getter, setter
	public String getDepartmentID() {
		return this.departmentID;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	// toString()
	@Override
	public String toString() {
		return this.getDepartmentID() + "-" + this.getDepartmentName();
		// return String.format("%s - %s" , this.getDepartmentID(), this.getDepartmentName());
	}
	
}
