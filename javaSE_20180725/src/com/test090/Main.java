package com.test090;

public class Main {

	public static void main(String[] args) {
		// �͸� ���� ��ü �̿�
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("���縦 �մϴ�");
			}
			
		};
				
				
		action.work();
	}

}
