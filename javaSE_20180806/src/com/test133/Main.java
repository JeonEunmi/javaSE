package com.test133;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// ǥ�� ����� ��ġ(Ű����, �ܼ�)�� �̿��� I/O Ŭ����
		// ->System.in , System.out
		// -> Scanner Ŭ����

		Scanner sc = new Scanner(System.in);

		// ���ڷ� �Է������� ���������� ����ȯ ����
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println(a);

		// �� ���ھ� �Է������� �ܾ� ������ ���ڿ� ��ȯ
		// �ܾ�� �ܾ �������� ����
		String b = sc.next();
		String c = sc.next();
		sc.nextLine();
		System.out.printf("%s, %s%n", b, c);

		// �� ���ھ� �Է������� ���� ������ ���ڿ� ��ȯ
		String d = sc.nextLine();
		System.out.println(d);

	}

}
