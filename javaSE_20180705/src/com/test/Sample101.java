package com.test;

public class Sample101 {

	public static void main(String[] args) {
		
		// main() �޼ҵ��� �Ű�����
		// -> ���� ���� (������ ���������� Ȱ�డ��)
		// -> JVM�� ���α׷� ����� �Ű��������� �迭��ü�� ����
		// -> ���α׷� ����� �ܺ� �ڷ�(TEST SAMPLE HELLO... ���� ���� �شٰ� ����) ����
		// -> ��Ŭ���� ����� Run as /Run Configurations �޴� ���� (p.161 ����)
		
		
		String[] a = new String[5];
		// main �޼ҵ��� "= new String[];" ������ �̺κ��� JVM�� �˾Ƽ� ����
		
		System.out.println(a); // �޸𸮻��� �����ּҰ� �������ٸ� ���������� �����
		System.out.println(a[0]); // �ڵ� �ʱ�ȭ  null
		System.out.println(a.length); //5
		
		System.out.println(args);  // �����ּ�
		System.out.println(args.length); // 5
		System.out.println(args[0]); // TEST
	}

}
