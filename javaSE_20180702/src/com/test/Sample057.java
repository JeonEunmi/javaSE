package com.test;

// �� ���α׷��� �ٸ� ���� �ִ� ��Ű���� Ŭ������ ����� ������ �� �� ����Ѵ�.
// ( * : ��Ī�� �� �� �� ����ϴ� ���ϵ�ī��)
import java.util.*;

public class Sample057 {

	public static void main(String[] args) {
		// �ܺ�(Ű����) �Է�
		// ->java.util ��Ű���� Scanner Ŭ����
		
		// Scanner Ŭ������ ��ü(instance) ����
		Scanner sc = new Scanner(System.in);
		
		// ����(����) �Է�
		int a = sc.nextInt();
		// ����Ű�� ���ڷ� �����Ƿ� ���͹��ڸ� ���� ���� �߰��� �������ش�.
		sc.nextLine();
		// �Է¹��� �ڷ� ���
		System.out.println(a);
		
		// ���ڿ� �Է�
		String b = sc.nextLine();
		// �Է¹��� �ڷ� ���
		System.out.println(b);
		
		// Scanner Ŭ������ ��ü(instance) ��� ����
		sc.close();
	}

}
