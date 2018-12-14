package com.test112;

public class Main {

	public static void main(String[] args) {

		// Box<T> Ŭ������ ���� ��ü ����
		// -> Ÿ���Ķ���Ϳ� ���� ����� �ڷ��� ���� �ʿ�

		// String���� ������ ���
		Box<String> box1 = new Box<String>("TEST");
		System.out.println(box1.getT()); // "TEST"

		// Integer�� ������ ���
		Box<Integer> box2 = new Box<Integer>(10);
		System.out.println(box2.getT()); // 10

		// int�� ������ ��� -> �⺻�ڷ����� �Ұ� -> wrapper class�� ��ü
		// Box<int> box3 = new Box<int>(10);
		// System.out.println(box3.getT()); //10

	}

}
