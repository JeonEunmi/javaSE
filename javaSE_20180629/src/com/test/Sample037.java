package com.test;

public class Sample037 {

	public static void main(String[] args) {
		// if, switch ���
		// ����1, ����2, ����3�� ������ ���ؼ�
		// ����� 60�� �̻��̸鼭 ���� ������ 40�� �̻��� ��� -> �հ�
		// ����� 60�� �̻�������, ���� �߿� 40�� �̸��� �ִ� ��� -> ����
		// ����� 60�� �̸��� ��� -> ���հ�

		int sub1 = (int) (Math.random() * 101);
		int sub2 = (int) (Math.random() * 101);
		int sub3 = (int) (Math.random() * 101);

		double avg = (sub1 + sub2 + sub3) / 3.0;

		System.out.println("sub1 ���� : " + sub1);
		System.out.println("sub2 ���� : " + sub2);
		System.out.println("sub3 ���� : " + sub3);

		if (avg >= 60) {
			if (sub1 >= 40 && sub2 >= 40 && sub3 >= 40) {
				System.out.println("�հ�");
			} else {
				System.out.println("����");
			}
		} else {
			System.out.println("���հ�");
		}

	}

}
