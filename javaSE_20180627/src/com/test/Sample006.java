package com.test;

public class Sample006 {

	public static void main(String[] args) {
			// float �ڷ���
			// �Ǽ� ����� �ڷ���
			// ���̻� F ǥ�� �ʿ�
			// �Ϲ������� �Ǽ� ��޽� double �ڷ����� �⺻���� ����Ѵ�.
			// �Ǽ� �ڷ� ����� ����Ȯ�� ����� ���� �� �ִ�. -> �޸� ���� ���
			// �Ǽ��� �Ϲ����� ���´� 0.123 ���� �����̴�.  -> �޸𸮿����� ������, �����η� �����ؼ� ����
			// ���� ǥ�� 5E7 �� 5*10^7�� ��Ÿ����.

			//float a = 3.141592;
			float b = 3.141592f;		
			float c = 0.123456789012f;
			
			//Eǥ��
			float d = 2E-3F;  // 2*10^-3 , 0.002 �����߻�
			
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}

	}
