package com.test088;

public class Main {

	public static void main(String[] args) {

		// �߻� Ŭ������ ��ü ���� �õ�
		// -> �߻� Ŭ������ ��ü ���� �Ұ��� �����߻�
		// Super s1 = new Super(); // Cannot instantiate the type Super
		
		Sub sub = new Sub();
		
		sub.method1();
		sub.method2();

		
		// ��ǥ���� �߻� Ŭ������ Number Ŭ������ �ִ�
		/*
		public abstract class Number
			extends Object
			implements Serializable
			
		�߻� �޼ҵ� -> ���� Ŭ�������� ���� ��� �����ؼ� ���
		abstract int	intValue()
		abstract double doubleValue()
		
		�Ϲ� �޼ҵ� -> ���� Ŭ�������� ������ ����� ���� ���
		short	shortValue()
		byte	byteValue()
		*/
		
//		Number n1 = new Number();
		
		Integer n2 = new Integer(10); //int ->Integer ->Boxing
		System.out.println(n2.intValue());	//Integer -> int -> UnBoxing
		System.out.println(n2.shortValue()); //Integer -> short
		
		Number n3 = new Integer(20);
		System.out.println(n3.intValue());	//Number
		System.out.println(n3.shortValue()); //Number
	}

}
