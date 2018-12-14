package com.test01;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Schedule[] a = new Schedule[10];
		
		a[0] = new Schedule("S001", "2018-01-01", "����");
		a[1] = new Schedule("S002", "2018-12-25", "ũ��������");
		a[2] = new Schedule("S003", "2018-08-15", "������");
		a[3] = new Schedule("S004", "2018-06-06", "������");
		
		// ���� ��
		System.out.println("---------------");
		for( Schedule s : a) {
			System.out.println(s.toString());
		}
		
		// ���� �׼� �߰�
		// -> null ���� ���� �迭�� ��츸 ���� ����
		Arrays.sort(a);

		// ���� ��
		System.out.println("---------------");
		for( Schedule s : a) {
			if(s != null)
			System.out.println(s.toString());
		}
	}

}
