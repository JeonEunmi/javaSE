package com.test;

import java.util.Arrays;

public class Sample094 {

	public static void main(String[] args) {

		// �ܾ� ������ �̿��� ���� ���ڿ� �غ�
		// -> �̸� �غ�� �ܾ� ������ Ư�� �ܾ �����ؼ� �迭�� ����
		// -> �迭�� ����� �ߺ����� �ʵ��� �Ѵ�.

		// �ܾ� ���� �迭 �غ�
		String[] dict = { "turtle", "know", "student", "shoes", "attack", "heart", "response", "beat", "relieve", "art",
				"remote", "package", "infect", "cellular", "die", "delay", "suffer", "data", "structure", "key" };

		// ���� �ڷ��� �迭
		String[] e = new String[5];
		
		
		for (int i = 0; i < e.length; i++) {
			e[i] = "";
		}

		for (int i = 0; i < e.length;) {
			// ���� ����(0 ~ dict.length-1)�� ���� �߻�
			int temp = (int) (Math.random() * dict.length);

			// ������ �̿��ؼ� �ܾ� ���� �迭���� Ư�� �ܾ� ����
			String word = dict[temp];

			// Ư�� �ܾ �̹� �����ϴ� �ܾ����� �˻��ϴ� ���� �߰�
			// �ܾ� ���� �迭�� ��Ҹ� ����
			
			// Ư�� �ܾ �̹� �����ϴ� �ܾ����� �˻�
			boolean check = true;
			for (int j=0; j<i; ++j) {
				if (word.equals(e[j])) {
					check = false;
				}
			}
			if (check) {
				e[i] = word;
				++i;
			}
			
			// �߰�Ȯ�� �ϴ� ���
			/*
			System.out.println(word);
			System.out.println(Arrays.toString(e));
			*/
		}
		System.out.println(Arrays.toString(e));

	}

}
