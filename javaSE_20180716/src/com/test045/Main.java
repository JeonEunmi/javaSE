package com.test045;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// �̱��� ���� Ȯ��
		// ->��ü ��û�� ������ �õ��غ���, ���� ��ü���� Ȯ��

		// Test Ŭ������ ��ü(instance) ��û ����
		// new Test() X
		// Test.getInstance() O
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();

		// private ������ ������ ��ü ���� �Ұ�
		// Test t3 = new Test();

		// ���� �ּ� ���
		System.out.println(t1.toString());
		System.out.println(t2.toString());

		// ���� �ּ� ��
		System.out.println(t1 == t2);

		// Calendar Ŭ������ ���� ��ü ���� �Ұ�
		// Calendar cal = new Calendar();
		// Calendar Ŭ������ getInstance() �޼ҵ�� ��ü ����
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));

	}

}
