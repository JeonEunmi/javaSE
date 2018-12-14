package com.test029;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// ���ڵ� �߿��� ���� ���� ��, ū �� ã�Ƽ� ���
		// -> �迭(�Ǵ� �÷���) ����� �̿�
		
		int[] arr = {5, 3, 4, 7, 9, 2, 6, 1, 8, 10};
		
		Test t = new Test();
		
		System.out.println("min : " + t.minFunction(arr));  //1
		System.out.println("max : " + t.maxFunction(arr));  //10
	
		
		//Passing Parameters by Value
		//-> �Ű������� ���޵Ǵ� �ڷ����� �⺻���� ��� �� ���翡 ���� ������ �ȴ�.
		//-> �޼ҵ� ������ �߻��ϴ� ����� �����ޱ� ���ؼ� return ���� �ʼ�
		//-> ���� ���, ���� 10, 20�� ���� ��, �ջ� ����� ��ȯ�޴´�.
		
		int a = 10;
		int b = 20;
		System.out.println("by Value : " + t.sum(a, b)); // 30
		
		int[] c = {10, 20, 0};
		t.test(c);
		System.out.println("by Reference : " + c[2]);  //30
		
		//��ǥ���� by Reference ��Ȳ�� Arrays.sort() �޼ҵ� �̴�.
		int[] d = {5, 3, 4, 7, 9, 2, 6, 1, 8, 10};
		System.out.println(Arrays.toString(d));
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
		
		System.out.println(d[0]); //min
		System.out.println(d[9]); //max
		}
		

}
