package com.test105;

public class Sub {
	
	public void method1() {
		
		//���� �߻� ���ɼ� �ִ� �ڵ� �ۼ�
		//try~catch ������ ���ܿ� ���� ��ü �ذ�
		try {
			String s = null;
			System.out.println(s.length()); //NullPointerException
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("Error999: ��Ÿ ����.");
		}
		
		System.out.println("����׼� ����.");
		
	}
	
	//���� �׼� �޼ҵ�� throws ���� ��� ����
	//->throws ���� �ڿ� ������ ���� ���� �Ǵ� ���� ���� ����
	public void method2() throws ClassNotFoundException {
		
		//���� �߻� ���ɼ� �ִ� �ڵ� �ۼ�
		//->Checked Exception ������ �غ�
		//throws ������ ���ܿ� ���� ����(���ѱ��)
		Class temp = Class.forName("java.lang.String");

	}

}
