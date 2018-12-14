package com.test116;

public class Util {
	
	// ���ϵ� ī�� -> �ڷ��� ���� ����
	public static String getString1(Box<?> t) {
		return t.toString();
	}

	// ���ϵ� ī�� -> <? extends Number> �� Number �ڷ��� �̰ų�, ���� �ڷ��� ���
	public static String getString2(Box<? extends Number> t) {
		return t.toString();
	}

	// <? super Integer> �� Integer �ڷ����̰ų�, ���� �ڷ��� ���
	public static String getString3(Box<? super Integer> t) {
		return t.toString();
	}

}
