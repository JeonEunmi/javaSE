package com.test122;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
	// Set �÷���
	// -> value�� ����, ���� ������ �������� �ʰ�, �ߺ��� �ڷ� ����
	// ���� Ŭ���� HashSet
	// �ε��� ���� �׼� �Ұ�
	
	Set<Member> set = new HashSet<Member>();
	
	set.add(new Member("ȫ�浿","1234"));
	set.add(new Member("���ڹ�", "5432"));
	
	// �ߺ� �ڷ� ���� ����
	// -> ���ο��� equals() �޼ҵ� ȣ�� �� �񱳰� ����ȴ�.
	// -> Member Ŭ�������� equals() �޼ҵ带 �������̵����� 
	//    ������ �����ּ� �񱳸� �ϰ� �ȴ�.
	set.add(new Member("ȫ�浿", "1234"));
	
	System.out.println(set.size());
	System.out.println(set.toString());
	
	}

}