package com.test112;

// ���׸� ���� Ŭ���� ����
// Ŭ���� ����� Ŭ������ �ڿ� <Ÿ���Ķ����> �߰�
// Ÿ�� �Ķ���ʹ� ���ĺ� �빮�� �� ����(���� ��� E, T, K, V)�� ǥ��
public class Box<T> {
	
	// ���ο��� �ڷ������� �ʿ�� �ϴ� �κп� T�θ� ǥ���Ѵ�.
	// -> ��ü ������ ����ڰ� ������ �ڷ���(���� ��� String)���� ���ϰ� �ȴ�.
	private T t;

	public Box() {
	}

	public Box(T t) {
		this.t = t;
	}

	public T getT() {
		return this.t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	

}
