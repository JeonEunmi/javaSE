package com.test005;

//�ڵ��� Ŭ����
public class Car {

	//�ʵ� ����
	//-> �ڵ����� state �м� -> �𵨸�, ȸ��, ����, ...
	String model = "�׷���";
	String company = "�����ڵ���";
	
	//�پ��� ���� ���� �ʿ�
	//-> ��ü ������ �����ǵ��� �Ѵ�.
	String color;	//null
	
	//������(�޼ҵ�)�� ���� �ʵ� �ʱ�ȭ
	//�ܺο��� ���� ���� �Ű������� ���� �ʵ��� ���°��� ������.
	public Car(String color) {
		this.color = color;   //�ʵ� = �Ű�����;
	}
}
