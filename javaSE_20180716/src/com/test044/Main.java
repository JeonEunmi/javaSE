package com.test044;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		// Test Ŭ������ ����� a, b�� �� ���
		// int[] a
		// static int[] b
		
		System.out.println(Arrays.toString(new Test().getA()));
		System.out.println(Arrays.toString(Test.getB()));
		System.out.println(Arrays.toString(Test.getC()));

	}

}
