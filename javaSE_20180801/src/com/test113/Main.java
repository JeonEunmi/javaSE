package com.test113;

public class Main {

	public static void main(String[] args) {
		
		// Box<T> Ŭ������ ���� ��ü ����
		// -> Ÿ���Ķ���Ϳ� ���� ����� �ڷ��� ���� �ʿ�
		
		// String, Integer�� ������ ���
		Box<String, Integer> box1 = new Box<String, Integer>("M01", 100);
		System.out.println(box1.getKey());  //"M01"
		System.out.println(box1.getValue());  // 100

		
	}

}
