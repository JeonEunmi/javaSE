package com.test002;

import com.test001.Sample;

//���� Ŭ����
public class Main {
	public static void main(String[] args) {
		
		// �ٸ� ��Ű�� ���� �ִ� Ŭ������ ��� ����
		// -> ��Ű����.Ŭ������ ���·� �ۼ�
		// -> import ���� ��� (Ctrl + Shift + O)
		
		//public Ű���� �ִ� Ŭ������ ��ü
		//com.test001.Sample a = new com.test001.Sample();
		Sample a = new Sample();
		a.msg();
		
		//public Ű���� ���� Ŭ������ ��ü (�����߻�)
		//com.test001.Test b = new com.test001.Test();
		//Test b = new Test();
		//b.msg();
		
		//MathŬ������ �ٸ� ��Ű���� ���Ѵ�. (java.lang)�� ���Ѵ�.
		//->import ���� ��� X
		//->java.lang ��Ű���� �����ϰ� ���� �����ϴ�.
		//�ڹٿ��� �����ϴ� ������ �⺻��Ű���̱� �����̴�.
		double m = Math.random();
		System.out.println(m);
		
	}
}
