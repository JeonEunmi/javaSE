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
		System.out.println("���� ������ �������ϴ�.");
	} else {
		System.out.println("���� ������ �����ϴ�.");
	}
	}
	
	public void VolumeUp() {
		++volume;
		System.out.println("���� ������ : " + volume + "�Դϴ�.");
		}
	public void VolumeDown() {
		--volume;
	System.out.println("���� ������ : " + volume + "�Դϴ�.");
	}
	public void Play() {
		play = !play;
		if(play == true) {
			System.out.println("������ ����մϴ�.");
		} else {
			System.out.println("������ �Ͻ����� �մϴ�.");
		}}

	
	
	
}
