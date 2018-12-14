package com.test065;

public class Main {

	public static void main(String[] args) {
		
		// SupersonicAirPlane 클래스의 객체 생성
		SupersonicAirPlane supersonic = new SupersonicAirPlane();
		
		supersonic.takeOff();
		
		// flyMode 상태에 따라서 다른 비행상태가 된다.
		// -> 초기값은 NOMAL
		supersonic.fly();
		
		// flyMode 상태값 변경 -> setter 호출
		supersonic.setFlyMode(SupersonicAirPlane.SUPERSONIC);
		
		supersonic.fly();
		
		supersonic.setFlyMode(SupersonicAirPlane.NORMAL);

		supersonic.fly();

		supersonic.land();
		
	}

}
