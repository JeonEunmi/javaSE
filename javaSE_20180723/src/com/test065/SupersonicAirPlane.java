package com.test065;

public class SupersonicAirPlane extends AirPlane {

	// 일반비행 or 초음속비행 둘 다 가능
	// -> 비행 모드 선택 -> setter 호출
	// -> 상수(static final) 제공 NORMAL, SUPERSONIC 제공

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	private int flyMode = SupersonicAirPlane.NORMAL;

	public int getFlyMode() {
		return this.flyMode;
	}

	public void setFlyMode(int flyMode) {
		this.flyMode = flyMode;
	}

	// land(), takeOff() 메소드는 부모의 것을 그대로 사용

	// fly() 메소드는 초음속비행 기능 추가를 위해서 오버라이딩
	@Override
	public void fly() {
		
		if (this.flyMode == SupersonicAirPlane.SUPERSONIC) {
			//초음속비행			
			System.out.println("초음속비행중..");
		} else { 
			//일반비행을 위해서 부모 클래스의 fly() 메소드 호출
			super.fly();		
		}
		
	}
	

}
