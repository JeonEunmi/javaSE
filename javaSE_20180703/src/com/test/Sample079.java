package com.test;

import java.util.Arrays;

public class Sample079 {

	public static void main(String[] args) {
		
		// �迭 ����Ҹ� �̿��� ���� ó��
		// �ټ��� ����ڿ� ���� �������� �����ϰ� ��, ��� ���� ����Ͽ� �����
		// ����� �� ��� ���� 1���� ���� - ����1�� ���� ����
		/*   park -> ??
  			 choi -> ??
  			 hong -> ??
  			 kim -> ??
  			 lee -> ??
  			 ----------
  			 �հ��� :
  			 XXX
  			 XXX
  			 XXX
  			 ���հ���
  			 XXX
  			 XXX
  			 */
		// ������ ����(0~100)�� �̿��ؼ� ��´�.
		
		String[] names = {"park", "kim", "lee", "choi", "hong"};
		int[] scores = new int[5];

		for(int i =0; i<scores.length; ++i) {
			scores[i] = (int)(Math.random()*101);
		}

		for(int i = 0; i < names.length; ++i) {
		System.out.println(names[i] + "�� ������ ?? " + scores[i]);
		}
		
		System.out.println("--------------------");		
		System.out.println("�հ��� (60�� �̻�) : " );
		for(int i=0; i<names.length; ++i) {
			if(scores[i]>=60)
			System.out.println(names[i]);
		}
		System.out.println("���հ��� (60�� �̸�) : ");
		for(int i=0; i<names.length; ++i) {
			if(scores[i]<60)
			System.out.println(names[i]);
					
	}

}
}
