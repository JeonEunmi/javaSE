package com.test009;

//������ ���⸦ ����Ʈ���� ��ü�� ǥ��
public class Calculator {

	//���� �ൿ�� Ư�� �м�
	//->���� on/off, ���ϱ� ����, ���� ����
	//->method
	
	//���� ���� �м�
	//->���� on/off ���°� ���� ���� �ʿ�
	//->field
	private boolean power;

	//0 ���� 1 ����
	
	//���� on/off �޼ҵ�
	public void power() {
		this.power = !this.power;
		
	}
	
	//���ϱ� ���� �޼ҵ� -> ���� on ���� Ȯ�� �ʿ�
	public String plus(int a, int b) {
		String result = "";
		if(this.power) {
			//��� ������ ����� int�� �޽���(String)���� ��ȯ
			//->String.valueOf()
			result = String.valueOf(a + b);
		}
		return result;
	}
	
	//���� ���� �޼ҵ� -> ���� on ���� Ȯ�� �ʿ�
	
	public String substract(int c, int d) {
		String result1 = "";
		if(this.power) {
			result1 = String.valueOf(c - d);
		}
		return result1;
	}
}
