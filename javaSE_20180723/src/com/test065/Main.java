package com.test065;

public class Main {

	public static void main(String[] args) {
		
		// SupersonicAirPlane Ŭ������ ��ü ����
		SupersonicAirPlane supersonic = new SupersonicAirPlane();
		
		supersonic.takeOff();
		
		// flyMode ���¿� ���� �ٸ� ������°� �ȴ�.
		// -> �ʱⰪ�� NOMAL
		supersonic.fly();
		
		// flyMode ���°� ���� -> setter ȣ��
		supersonic.setFlyMode(SupersonicAirPlane.SUPERSONIC);
		
		supersonic.fly();
		
		supersonic.setFlyMode(SupersonicAirPlane.NORMAL);

		supersonic.fly();

		supersonic.land();
		
	}

}
