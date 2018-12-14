package com.test124;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// �ζ� ��ȣ (1~45) ���� �� ���
		// -> 1~45 ������ ���ڸ� �ߺ����� �ʰ� 6�� ����
		// -> set �÷��� ���
	
		// �� �÷��� ����
		Set<Integer> set = new HashSet<Integer>();
		
		Random random = new Random();
		
		while(true) {
			// 1~45 ������ ���� ���� �߻�
			int temp = random.nextInt(45) + 1;
			
			// Ư�� ���ڰ� �̹� �����ϴ� �������� �˻�
			// -> Set ����ҿ� �����ϸ� �ڵ� �м�
			set.add(temp);
			
			if(set.size() == 6) {
				break;
			}
		}
		
		// Set �÷��� ������Ʈ ��ü ���
		System.out.println(set.toString());
		
		// ���� �߰� -> List �÷������� ��ȯ �� ���� ����
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println(list.toString());
	}

}
