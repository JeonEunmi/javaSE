package com.test;

import java.util.Arrays;

public class Sample104 {

	public static void main(String[] args) {
		
		// �迭�� ���� ����(shallow copy), ���� ����(deep copy)
		// -> �ڷ����� ������(String)�� �迭
		
		// ���� ���� -> �迭 �����ϴ� ��� �����ּҸ� �����ϴ� ���
		// ���� ���� -> �迭 �����ϴ� ��� �ڷᰡ ����Ǵ� ��� (�޸� �� �����Ͱ� �ΰ��� �ȴ�)
		
		// �ڷ����� �⺻���� ��� �迭 �����ϸ� ���� ����
		int[] a = {10, 20, 30};	
		int[] b = Arrays.copyOf(a, a.length + 5);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b)); 
		
		// �ڷ����� �������� ��� �迭 �����ϸ� ���� ����
		String[] c = {"park", "hong", "lee"};
		String[] d = Arrays.copyOf(c, c.length + 5);
		
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
	}

}
 