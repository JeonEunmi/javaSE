package com.test117;

// ���׸� Ŭ������ �θ� Ŭ������ ���
// �ڽ� Ŭ������ ������ ���׸� ǥ�� ���� �ʼ�
// �Ǵ� Ÿ���Ķ���� Ȯ�� ����
public class SmallBox<T, M> extends Box<T>{

	// �߰��� Ÿ���Ķ���� ����
	private M m;

	public SmallBox() {

	}
	
	public SmallBox(M m) {
		super();
		this.m = m;
	}


	public M getM() {
		return this.m;
	}

	public void setM(M m) {
		this.m = m;
	}
	
	
}
