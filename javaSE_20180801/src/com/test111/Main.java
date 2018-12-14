package com.test111;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// ���׸�(Generic)
		// -> ������ Ÿ���� ����ϵ��� ���������ν� Ÿ�� ������ ����
		// -> ����ÿ��� ���������� �����ϰ�, ���ÿ��� ���������� ���

		// ���׸� ��� ��
		/*
		public class ArrayList<E>
			extends AbstractList<E>
			implements List<E>, RandomAccess, Cloneable, Serializable
		*/

		// �� ����Ʈ �÷����غ�
		List<String> list = new ArrayList<String>();

		// ���ѵ� �ڷ����� �ڷḸ�� ����
		// -> �����Ͻ� ���� Ÿ�� üũ
		// list.add(10); //���� �ڷ��� ���� �Ұ�
		list.add("TEST"); // ���ڿ� �ڷ���

		// get() �޼ҵ带 �̿��ؼ� �ڷ� ���� ����
		// -> Object �ڷ������� ��ȯ
		System.out.println(list.get(0)); // "TEST"

		// ���� ����ȯ ���ʿ�
		String s = list.get(0); // "TEST"

		System.out.println("----------------------");
		// ����� �ڷ����� �м����� �ʰ� ����ȯ �õ�
		// Integer i2 = (Integer) list.get(0); // Checked Exception
		// -> �������� ������ �������� Ÿ�� �˻� ����
	}

}
