package com.test;

import java.util.Arrays;

public class Sample095 {

	public static void main(String[] args) {
		
		// �迭 ����� Ȯ��
		// �迭�� ������ �� ������ ũ�⸦ ������ �� ����.
		// -> ���ο� �迭(Ȯ��� ũ��)�� �غ��ϰ�, ���� �迭�� �ڷḦ ����
		// -> ���� �迭�� �޸𸮿��� ���� (�����ּ� �ٲ�ġ��)
		
		int[] a = {10, 20, 30, 40, 50};
		// ������� �ʴ� �������� �����ϰ� ũ�� Ȯ��
		int[] b = Arrays.copyOf(a, a.length * 2);  
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		// �����ּҸ� ���ο� �ּҷ� ���� 
		// ���� �����ּҴ� �����Ⱑ �Ǿ� �������÷��Ϳ� ���� ������
		a = Arrays.copyOf(a, a.length + 5);  
		System.out.println(Arrays.toString(a));
		
		a = Arrays.copyOf(a, a.length + 5);  
		System.out.println(Arrays.toString(a));

	}

}
