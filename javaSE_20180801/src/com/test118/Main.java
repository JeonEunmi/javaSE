package com.test118;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// �÷��� (Collections)
		// -> �ٷ��� �ڷḦ �޸𸮿� ������ �� �ִ� �����
		// -> �迭�� ����(ũ�� ����, �ε��� ����, null��)�� �ؼ��� �� �ִ� ��� ����
		// -> List, Set, Map �������̽� ���� Ŭ������ �����Ѵ�.
		// -> java.util ��Ű�� �Ҽ�
		
		// List �������̽� (Collection �������̽��� ���� �������̽�)
		// -> value�� ����, �ε��� ����, ���� ������ �����ǰ�, �ߺ��� �ڷ� ���� ����, ���� ����
		// -> ���� Ŭ���� ArrayList
		
		// Set �������̽� (Collection �������̽��� ���� �������̽�)
		// -> value�� ����, ���� ������ �������� �ʰ�, �ߺ��� �ڷ� ���� �Ұ�, ���� �Ұ�
		// -> ���� Ŭ���� HashSet
		
		// Map �������̽�
		// -> key, value �� ������ ����, key �ε����� �ߺ� �Ұ�, value�� �ߺ� ����
		// -> ���� Ŭ���� HashMap
		
		// �� �÷��� ����� �غ�
		List<String> list = new ArrayList<String>();
		
		// �ڷ� �߰�
		list.add("TEST");
		list.add("HELLO");
		list.add(2, "DATA");
		// �ڷ� ���
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list);
		
		
		// �ڷ� �˻�
		System.out.println(list.contains("TEST"));
		System.out.println(list.contains("ABCD"));
		
		// �ڷ� ����
		list.remove("HELLO");
		System.out.println(list);
		
		// �ٷ��� �ڷḦ �ѹ��� �Է�
		// -> Arrays.asList()
		
		List<String> temp = Arrays.asList("JAVA", "MIN", "HONG", "PARK");
		
		for(String s : temp) {
			System.out.println(s);
		}
		
		System.out.println(temp.toString());
		

	}

}
