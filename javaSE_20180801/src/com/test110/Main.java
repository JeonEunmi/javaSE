package com.test110;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// ���׸�(Generic)
		// -> ������ Ÿ���� ����ϵ��� ���������ν� Ÿ�� ������ ����
		// -> ����ÿ��� ���������� �����ϰ�, ���ÿ��� ���������� ���
		
		// ���׸� ��� ��
		
		// �� ����Ʈ �غ�
		List list = new ArrayList();
		
		// �پ��� �ڷ����� �ڷḦ ����
		list.add(10); //���� �ڷ���
		list.add("TEST"); // ���ڿ� �ڷ���
		
		// get() �޼ҵ带 �̿��ؼ� �ڷ� ���� ����
		// -> Object �ڷ������� ��ȯ
		System.out.println(list.get(0));  //10
		System.out.println(list.get(1));  //"TEST"
		
		// ���� ����ȯ �ʿ� -> ����ȯ ���� �ڷ��� �м� �ʿ�
		Integer i = (Integer)list.get(0); //10
		String s = (String)list.get(1); //"TEST"
		
		System.out.println("----------------------");
		// ����� �ڷ����� �м����� �ʰ� ����ȯ �õ�
		Integer i2 = (Integer)list.get(1);   //ClassCastException
		// -> �Է½ÿ� �ڷ��� �м��� �ϴ� ���� ����(�����Ͻ� ���� Ÿ�� üũ)
		// -> ���׸� ǥ�� ���
	}

}
