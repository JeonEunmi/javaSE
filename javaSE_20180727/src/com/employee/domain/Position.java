package com.employee.domain;

// �������� �ڷ��� Ŭ����
public class Position {

	// ������ȣ, ������, �ּұ⺻��
	private String positionID, positionName;
	private int minimumPay;
	
	public Position() {
		
	}

	public Position(String positionID, String positionName, int minimumPay) {
		this.positionID = positionID;
		this.positionName = positionName;
		this.minimumPay = minimumPay;
	}

	public String getPositionID() {
		return this.positionID;
	}

	public void setPositionID(String positionID) {
		this.positionID = positionID;
	}

	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public int getMinimumPay() {
		return this.minimumPay;
	}

	public void setMinimumPay(int minimumPay) {
		this.minimumPay = minimumPay;
	}

	@Override
	public String toString() {
		return String.format("%s - %s - %s", this.getPositionID(), this.getPositionName(), this.getMinimumPay());
	}
	
	
	
	
}
