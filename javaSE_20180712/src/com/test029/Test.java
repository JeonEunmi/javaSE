package com.test029;

public class Test {
	
	// ���޹��� ���ڵ� �߿��� ���� ���� ���ڸ� ã�� ��, ��ȯ
	//-> �迭(�Ǵ� �÷���) ����� �̿�
	public int minFunction(int[] a) { //�������� ���ڸ� ���޹޴� ���� ����
		
		int result = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(result > a[i]) {
				result = a[i];
			}
		}
		
		return result;
	}

	// ���޹��� ���ڵ� �߿��� ���� ū ���ڸ� ã�� ��, ��ȯ
	//-> �迭(�Ǵ� �÷���) ����� �̿�
	public int maxFunction(int[] a) { //�������� ���ڸ� ���޹޴� ���� ����
		
		int result = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(result < a[i]) {
				result = a[i];
			}
		}
		
		return result;
	}
	
	//Passing Parameters by Value
	//->������ �� a������ ��(����)�� �޴��� a������ ����ȴ�.
	public int sum(int a, int b) {
		int result = 0;
		
		//���޹��� ��(�纻)�� ��ȭ�� ���ܵ� �������� ������ ���� �ʴ´�.
		result = a + b;
		
		//����� ��ȯ�� ���� return ���� �ʿ�
		return result;
	}
	
	//Passing Parameters by Reference
	//->������ �� a������ ���������� �޴��� a������ ����ȴ�. �� ������ ���� ���� �����ȴ�.
	public void test(int[] a) {
			
		a[2] = a[0] + a[1];
				
		//����� ��ȯ�� ���� return ������ �ʿ� ����
	}
}
