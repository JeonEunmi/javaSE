package com.test065;

public class SupersonicAirPlane extends AirPlane {

	// �Ϲݺ��� or �����Ӻ��� �� �� ����
	// -> ���� ��� ���� -> setter ȣ��
	// -> ���(static final) ���� NORMAL, SUPERSONIC ����

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	private int flyMode = SupersonicAirPlane.NORMAL;

	public int getFlyMode() {
		return this.flyMode;
	}

	public void setFlyMode(int flyMode) {
		this.flyMode = flyMode;
	}

	// land(), takeOff() �޼ҵ�� �θ��� ���� �״�� ���

	// fly() �޼ҵ�� �����Ӻ��� ��� �߰��� ���ؼ� �������̵�
	@Override
	public void fly() {
		
		if (this.flyMode == SupersonicAirPlane.SUPERSONIC) {
			//�����Ӻ���			
			System.out.println("�����Ӻ�����..");
		} else { 
			//�Ϲݺ����� ���ؼ� �θ� Ŭ������ fly() �޼ҵ� ȣ��
			super.fly();		
		}
		
	}
	

}
