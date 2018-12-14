package com.test;

import java.util.Arrays;

public class Sample073 {

	public static void main(String[] args) {
		// �迭 (array) �ڷ���
		// ������ �ڷ���(�⺻��, ������ ��� ����)�� ���� �ڷ� �������� �޸𸮿� �����ϴ� ���
		// �迭�� ������ ũ�� ���� �ʼ�
		// �迭 ������ �ڵ� �ʱ�ȭ ���� -> �ڵ����� ���� �����Ų��.
		// �迭 ������ ũ�� ���� �Ұ�
		// new �����ڸ� �̿��ؼ� �迭 ����
		// �迭�� ũ�� Ȯ���� length �ʵ�(field) ���
		// �迭 Ž���� �ε��� ���

		// �⺻����
		// dataType[] arrayRefVar = new dataType[arraySize];
		// dataType[] arrayRefVar = {value0, value1, ..., valuek};

		int[] a = new int[5];

		System.out.println(a); // �迭 a�� �����ּ�, �ؽ��ڵ�
		System.out.println(a[0]); // �迭 a�� 0��° �ڸ��� ����ִ� ���

		a[0] = 10;
		System.out.println(a[0]);

		// �ε��� ���� �ݺ��� �̿� (�Է¿�)
		for (int i = 0; i < a.length; ++i) {
			a[i] = i;
		}

		// �ε��� ���� �ݺ��� �̿� (��¿�)
		for (int i = 0; i < a.length; ++i) {
			System.out.println(a[i]);
		}
		// �迭 ��� ��ü ���
		// ->Arrays Ŭ������ toString() �޼���
		System.out.println(Arrays.toString(a));

		// �߸��� �ε��� ���ٽ� ����(����) �߻� --> ArrayIndexOutOfBoundsException �߻�!
		for (int b = 0; b <= a.length; ++b) {
			System.out.println(a[b]);
		}
	}

}
