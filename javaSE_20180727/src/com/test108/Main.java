package com.test108;

public class Main {

	public static void main(String[] args) {
		
		//StringBuffer Ŭ����
		//->���ڿ� ���� ����� �޸𸮿��� ������ ��ü�� �߻��ϴ� ���� ������ �� �ִ�.
		//->���ڿ� ���ս� + ������ ��� StringBuffer ��ü�� append() �޼ҵ� ��� ����
		
		// ���ڿ� ���� ���� -> ���� ���
		/*
		long start1 = Runtime.getRuntime().freeMemory();
		String temp1 = "";
		for (int a=0; a<1000; ++a) {
			temp1 += "TEST/";
		}
		long end1 = Runtime.getRuntime().freeMemory();
		System.out.println(temp1);
		System.out.println(start1 - end1);
		System.out.println("----------------");
		*/
		
		// ���ڿ� ���� ���� -> StringBuffer Ŭ���� �̿�
		
		long start1 = Runtime.getRuntime().freeMemory();
		StringBuffer temp1 = new StringBuffer();
		for (int a=0; a<1000; ++a) {
			temp1.append("TEST/");
		}
		long end1 = Runtime.getRuntime().freeMemory();
		System.out.println(temp1.toString());
		System.out.println(start1 - end1);
		System.out.println("----------------");
		
	}

}
