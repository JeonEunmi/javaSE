package com.test;

public class Sample103 {

	public static void main(String[] args) {
		// ��ü�� �����ϴ� �迭
		// -> �ڷ����� ������(String)�� �迭
		
		String[] a = {"park", "choi", "hong"};
		
		// �����ּ� ��
		System.out.println(a[0] == a[1]);   //false
		
		// �ڷ�(���ڿ�) ��
		System.out.println(a[0].equals(a[1]));  //false
		
		
		String[] b = new String[3];
		
		b[0] = "park";
		b[1] = "park";
		b[2] = new String("park");
		
		System.out.println(b[0] == b[1]);  //true
		System.out.println(b[0] == b[2]);  //false
		System.out.println(b[0].equals(b[1]));   //true
		System.out.println(b[0].equals(b[2]));   //true
	}

}
 