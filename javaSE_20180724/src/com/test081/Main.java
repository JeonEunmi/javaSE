package com.test081;

public class Main {

	public static void main(String[] args) {

		// ���� ��ü
		Super s1 = new Super(10);
		System.out.println(s1.getA()[0]);  // 10
		
		
		// �纻 ��ü -> ���� �޸𸮿��� �� ���� Super ��ü. �� ���� �迭 ��ü.
		try {
			Super s3 = (Super) s1.getCopy();
			System.out.println(s3.getA()[0]); // 10
			s3.updateA(30);
			System.out.println(s1.getA()[0]);  // 30
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
