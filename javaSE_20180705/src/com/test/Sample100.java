package com.test;

public class Sample100 {

	public static void main(String[] args) {
		
		// main() �޼ҵ��� �Ű�����
		// -> ���� ���� (������ ���������� Ȱ�డ��)
		// -> JVM�� ���α׷� ����� �Ű��������� �迭��ü�� ����
		
		String[] a = new String[5];
		// main �޼ҵ��� "= new String[];" ������ �̺κ��� JVM�� �˾Ƽ� ����
		
		System.out.println(a); // �޸𸮻��� �����ּҰ� �������ٸ� ���������� �����
		System.out.println(a[0]); // �ڵ� �ʱ�ȭ  null
		System.out.println(a.length); //5
		System.out.println(args);  // �����ּ�
		System.out.println(args.length); // 0
		System.out.println(args[0]); // ArrayIndexOutOfBoundsException
	}

}
