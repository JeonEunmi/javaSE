package com.test121;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// Set �÷���
		// -> value �� ����, ���� ������ �������� �ʰ�,
		//    �� ���� ������ ���� ���� ������ �ٸ���.
		// -> �ߺ��� �ڷ� ���� �Ұ�, �ϳ��� null�� ���� ���� �ϴ�.
		// -> ���� Ŭ���� HashSet
		// -> �ε��� ���� �׼� �Ұ�
		
		Set<String> set = new HashSet<String>();
		
		set.add("TEST");
		set.add("HELLO");
		set.add("JAVA");
		set.add("JDBC");
		set.add("ORACLE");		
		set.add("TEST");  // X
		
		// -> ���ο��� equals() �޼ҵ� ȣ�� �� �񱳰� ����ȴ�.
		// -> String Ŭ������ equals() �޼ҵ尡 ���ڿ� �� �񱳸� �ϵ��� �������̵� �Ǿ��ִ�.
		System.out.println(set.toString());
		
		set.remove("HELLO");
		System.out.println(set.toString());
		
		// �ݺ����� �̿��� Set �÷��� ������Ʈ Ž�� 
		System.out.println("----------------");
		for(String s : set) {
			System.out.println(s);
		}
		
		// �ݺ���(Iterator)�� �̿��� Set �÷��� ������Ʈ �˻�
		System.out.println("----------------");
		// �ݺ��� ���
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			System.out.println(temp);
		}
		
	}

}
