package com.test;

public class FMRadio {
	
	//state
	private String color = "black";
	private boolean power = false;
	private int volume = 5;
	private boolean play = false;

	//behavior
	public void Power() {
		power = !power;
	if(power == true) {
		System.out.println("라디오 전원이 켜졌습니다.");
	} else {
		System.out.println("라디오 전원을 껐습니다.");
	}
	}
	
	public void VolumeUp() {
		++volume;
		System.out.println("현재 볼륨은 : " + volume + "입니다.");
		}
	public void VolumeDown() {
		--volume;
	System.out.println("현재 볼륨은 : " + volume + "입니다.");
	}
	public void Play() {
		play = !play;
		if(play == true) {
			System.out.println("라디오를 재생합니다.");
		} else {
			System.out.println("라디오를 일시정지 합니다.");
		}}

	
	
	
}
