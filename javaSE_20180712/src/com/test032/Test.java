package com.test032;

public class Test {
	
	//���� �Ű������� �迭 ��ü ���� ������
	
	//1. ���� �� ������ ���޽� �� ���� �� ��� ��ȯ. ���� �Ű�����
	// �޼ҵ带 ���� �Ŀ� �迭�� �����Ͽ��� ������ return�� �ʿ� 
	// ���� �ִٺ��ϱ� �迭�� �����Ȱ���
	public int calc1(int... args) {
		int result = 0;
		for (int a = 0; a<args.length; ++a) {
			result += args[a];
		}
		return result;
	}
	
	//2. ���� �� ������ ���޽� �� ���� �� ��� ��ȯ. �迭 ��ü
	// �޼ҵ带 ����� �������� �迭�� �־ ���� 1���� �������� ���� �����ּҸ� ��
	public void calc2(int[] args) {
		int len = args.length - 1;
		int result = 0;
		for (int a = 0; a<len; ++a) {
			result += args[a];
		}
		args[len]  = result;
	}
	
	//3. ���� �� ������ ���޽� �� ���� �� ��� ��ȯ. �迭 ��ü
	//�������
	public int calc3(int[] args) {
		int result = 0;
		for (int a = 0; a<args.length; ++a) {
			result += args[a];
		}
		return result;
	}
	
}
