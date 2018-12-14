package com.employee.domain;

// ���� ���� ���� �ڷ��� Ŭ����
public class Employee {

	// - �Է� �׸��� �̸�, �ֹι�ȣ, �Ի���, ��ȭ��ȣ, ������ȣ, �μ���ȣ, ������ȣ, �⺻��, ���� �̴�.
	// - ��� �׸��� ���, �̸�, �ֹι�ȣ, �Ի���, ��ȭ��ȣ, ������, �μ���, ������, �⺻��, ����, �޿��� �����ȴ�.
	
	// ���, �̸�, �ֹι�ȣ, �Ի���, ��ȭ��ȣ, ������ȣ, �μ���ȣ, ������ȣ, �⺻��, ����, �޿�
	
	private String employeeID, employeeName, ssn, joinDate, callNum, regionID, departmentID, positionID;
	private int basePay, extraPay, pay;
	public Employee() {
		
	}
	
	//getter ���� -> employeeID, pay
	
	public Employee(String employeeID, String employeeName, String ssn, String joinDate, String callNum, String regionID,
			String departmentID, String positionID, int basePay, int extraPay) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.ssn = ssn;
		this.joinDate = joinDate;
		this.callNum = callNum;
		this.regionID = regionID;
		this.departmentID = departmentID;
		this.positionID = positionID;
		this.basePay = basePay;
		this.extraPay = extraPay;
	}
	public String getEmployeeName() {
		return this.employeeName;
	}
	public void setEmployName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getSsn() {
		return this.ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getJoinDate() {
		return this.joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getCallNum() {
		return this.callNum;
	}
	public void setCallNum(String callNum) {
		this.callNum = callNum;
	}
	public String getRegionID() {
		return this.regionID;
	}
	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}
	public String getDepartmentID() {
		return this.departmentID;
	}
	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}
	public String getPositionID() {
		return this.positionID;
	}
	public void setPositionID(String positionID) {
		this.positionID = positionID;
	}
	public int getBasePay() {
		return this.basePay;
	}
	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}
	public int getExtraPay() {
		return this.extraPay;
	}
	public void setExtraPay(int extraPay) {
		this.extraPay = extraPay;
	}
	public String getemployeeID() {
		return this.employeeID;
	}
	public int getPay() {
		return this.getBasePay() + this.getExtraPay();
	}	
	
	
}
