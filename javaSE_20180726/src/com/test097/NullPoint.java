package com.test097;

public class NullPoint {

	public static void main(String[] args) {
		
		// ����(Exception)
		// -> �߸��� �ڷ� �Ǵ� ���ۿ� ���� �߻��ϴ� ����
		// -> ������ ó��(���� ó��)�� ���ؼ� ������ ���Ḧ ���� �� �ִ�.
		// checked Exception / unchecked Exception (Runtime Exception)
		
		
		String s1 = new String ("TEST");
		System.out.println(s1.length());
		
		String s2 = null;
		// ���� ó�� �ڵ�
		// -> ���ܰ� �߻��ϴ��� ������ ���Ḧ ���� �� �ִ�
		try {
			// ���� �߻� ���ɼ��� �ִ� �ڵ� �ۼ�
			/*
			String Ŭ������ length() �޼ҵ� �ñ״�ó
			public int length()
			*/
			System.out.println(s2.length());   // NullPointerException -> unchecked Exception	
		} catch(Exception e){
			// ���� �߻� �� ��ġ ���� �ۼ�
			// -> ���� �޼��� ���
			e.printStackTrace();
		}
		
		// ���� �Ұ� -> �߰��� �߻��� ���ܷ� ���� ���� �Ұ�
		// ������ ����ó���� ���ٸ� ���� �Ұ�
		// -> �߰����� �߻��� ���ܷ� ���� ������ ����
		System.out.println("���α׷� ����");
	}
}
