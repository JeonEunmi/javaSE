package com.test115;

public class Box {
	
	// ���׸� �޼ҵ�
	// �Ű������� ��ȯ�ڷ����� Ÿ���Ķ���Ͱ� ǥ���� �޼ҵ�
	// ���ѵ� Ÿ���Ķ����(extends Ű����) ����
	// ���� ��� <T extends Number>�� ��� Number �ڷ����� ���� �ڷ���(Integer, Double, ...) �� ���
	public static <T extends Number> boolean compare(T t1, T t2) {
		boolean result = false;
		
		result = t1.equals(t2);
		
		return result;
	}

}
