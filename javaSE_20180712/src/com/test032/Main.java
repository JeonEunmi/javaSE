package com.test032;

public class Main {

	public static void main(String[] args) {

		Test t = new Test();
		
		//1. ���� �� ������ ���޽� �� ���� �� ��� ��ȯ. ���� �Ű�����
		int result1 = t.calc1(1, 2, 3, 4, 5);
		System.out.println(result1);

		//2. ���� �� ������ ���޽� �� ���� �� ��� ��ȯ. �迭 ��ü
		int[] temp = {1, 2 ,3 ,4 , 5, 0};
		t.calc2(temp);
		int result2 = temp[temp.length - 1];
		System.out.println(result2);
				
	}

}
