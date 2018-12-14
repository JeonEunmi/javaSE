package com.test;

// �Ǽ����� ������(State, behavior)�� ���� ����Ʈ���� ��ü�� ǥ���ϴ� ����
// -> Dog Class
public class Dog {
	
	// ��ü(instance)�� ���°��� �����ϴ� ����
	// state -> color, name ... -> field	
	private String color;
	private String name;
	private int age;
	
	// ��ü (instance)�� �׼� ���  - ��ü�� ��︮�� ������ ������ �� 
	// behavior -> barking, hungry, sleeping...   -> method
	public void barking() {
		// �׼��ڵ�
		System.out.println("bow-wow! bow-wow!");
		};
	
	public void hungry() {};
	
	public void sleeping() {};
	
	
}
