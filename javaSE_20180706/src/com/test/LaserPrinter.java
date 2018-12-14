package com.test;

//�����Ϳ� ���� Ŭ���� ����
public class LaserPrinter {
	
	// state = toner, paper, ... -> field
	// ���, ���̰� ����(setter)�Ǹ� �ܺο��� ���޵� �޼����� ���̿� ���
	// ��ġ���� ���� = ���°� 
	private int toner = 50;
	private int paper = 5;
	
	//behavior -> writing(), ... -> method
	public void writing(String msg) {
		// ���°� Ȯ��
		// -> ��� ����, ���� ����
		if(toner < msg.length()) {			// toner �� �˻�
			System.out.println("��� ����!");
		} else if(paper == 0) {		// paper �� �˻�
			System.out.println("���� ����!");
		} else {
			// �׼��ڵ�
			System.out.println(msg);
		}
		
		// ���°� ��ȭ
		// -> ���ڼ���ŭ ��� ����, �޼��� 1���� ���� 1�� �Ҹ�
		toner -= msg.length();
		--paper;
	}
	//	setter : �ܺηκ��� ���޹޴� ��� �� �ϳ� (p.265 ����)		
}
