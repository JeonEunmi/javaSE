package com.test;

public class Sample034 {

	public static void main(String[] args) {

		// ����(1), ����(2), ��(3) ����
		// ����(1), ����(2) -> ����(2) �¸�
		// ����(2), ��(3) -> ��(3) �¸�
		// ����(1), ��(3) -> ����(1) �¸�

		// ���º�, ��, ��

		// 1~3 ������ ���� ���� ȹ�� (2��)
		int user1 = (int) (Math.random() * 3) + 1;
		int user2 = (int) (Math.random() * 3) + 1;

		// �м� -> ���º�, ��, ��
		System.out.println("�����1 : " + user1);
		System.out.println("�����2 : " + user2);
		
		String result = "";
		
		if (user1 == user2) {
		result = "���º�";
		} else {
			
			if ((user1 % 3) == ((user2 +1) % 3)){
			result = "�����1 ��!";
			} else {
		result = "�����2 ��!";
			}
		}

		/*		
		if (user1 == user2) {
		result = "���º�";
		} else {
			if((user1 == 1 && user2 == 2) || (user1 == 2 && user2 ==3) || (user1 == 3 && user2 ==1)){
		result = "�����2 ��!";
			} else {
		result = "�����1 ��!";
			}
		}
		
	*/
		// ��� ���
		System.out.println("��� : " + result);
	}

}
