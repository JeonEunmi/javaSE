package com.test;

public class Sample012 {

	public static void main(String[] args) {
		
		// ���� ����ȯ
		// -> ū �ڷ����� ���� ���� �ڷ����� ������ ����
		// -> �ս� ���ɼ� ����
		
		// ĳ��Ʈ ������
		// ->�⺻ �ڷ��������� ĳ��Ʈ ������ ��� ����
		// ���� �ڷ��� ���� = (���� �ڷ���) ū �ڷ��� ��;
		
		// int c = 10L; //int�� ���� = long�� �ڷ�   //���� ����ȯ �ʿ�
		int c = (int) 10L;
		
		int d1 = 10;
		int d2 = (int) (d1 / 3.0); //����, �Ǽ� ���� ����
		//d2 ���� ����ȯ �������� �սǹ߻�!!! �Ҽ��� �Ʒ��� ��� ������ ����ȭ
		
		System.out.println(c);
		System.out.println(d2);

	}

}
 