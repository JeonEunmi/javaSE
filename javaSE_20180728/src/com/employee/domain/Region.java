package com.employee.domain;

// ���� ���� �ڷ��� Ŭ����
public class Region {

	// ������ȣ, ������
	private String regionID, regionName;
	
	public Region() {
		
	}

	public Region(String regionID, String regionName) {
		this.regionID = regionID;
		this.regionName = regionName;
	}

	public String getRegionID() {
		return this.regionID;
	}

	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@Override
	public String toString() {
		return String.format("%s - %s", this.getRegionID(), this.getRegionName());
	}
	
	
}
