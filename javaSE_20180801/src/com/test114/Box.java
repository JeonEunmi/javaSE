package com.test114;

public class Box {
	
	// ���׸� �޼ҵ�
	// �Ű������� ��ȯ�ڷ����� Ÿ���Ķ���Ͱ� ǥ���� �޼ҵ�
	public static <T> boolean compare(T t1, T t2) {
		boolean result = false;
		
		result = t1.equals(t2);
		
		return result;
	}

}
