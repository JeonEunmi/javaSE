package com.test;

public class Sample078 {

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
  			 ����: XXX
  			 ���: XXX.X
  			 */
		// ������ ����(0~100)�� �̿��ؼ� ��´�.
		
		String[] names = {"park", "kim", "lee", "choi", "hong"};
		int[] scores = new int[5];
		
		for(int i =0; i<scores.length; ++i) {
			scores[i] = (int)(Math.random()*101);
		}
		
		// ����, ��� ��� �׼� 
		int sum = 0;
		double avr = 0.0;
		
		for(int i=0; i<names.length; ++i) {
			sum += scores[i];
		}
		
		avr = (double) sum / scores.length;
		
		// System.out.println(Arrays.toString(names))
		// ��� ���
		for(int i = 0; i < names.length; ++i) {
		System.out.println(names[i] + "�� ������ ?? " + scores[i]);
		}
		
		System.out.println("--------------------");		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avr);
		
	}

}
