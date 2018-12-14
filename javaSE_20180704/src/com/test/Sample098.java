package com.test;

import java.util.Arrays;

public class Sample098 {

	public static void main(String[] args) {
		// �迭 �׸� ��

		int[] a = { 20, 50, 10, 40, 30 };
		int[] b = { 10, 20, 30, 40, 50 };

		System.out.println(a.equals(b)); // false

		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(a.equals(b)); // false
		// ���� ������, �����ּҰ� �ٸ��⶧���� false���� ���´�.
		// �׸� �� �񱳰� �ƴ϶�, �����ּ� �� -> String �� �ٸ��� ����

		int[] c = b;
		// �����ּҰ� ��ġ�ϹǷ� true
		System.out.println(b.equals(c)); // true

		String d = new String("HELLO");
		String e = new String("HELLO");
		System.out.println(d == e);   // �ּ� �� false
		System.out.println(d.equals(e));   //�� �� -> true
		
		
	}

}
