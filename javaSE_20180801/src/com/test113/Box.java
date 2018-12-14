package com.test113;

// ���׸� ���� Ŭ���� ����
// Ŭ���� ����� Ŭ������ �ڿ� <Ÿ���Ķ����, Ÿ���Ķ����, ...> �߰�
// Ÿ�� �Ķ���ʹ� ���ĺ� �빮�� �� ����(���� ��� E, T, K, V)�� ǥ��
public class Box<K, V> {
	
	// ���ο��� �ڷ������� �ʿ�� �ϴ� �κп� K, V�θ� ǥ���Ѵ�.
	// -> ��ü ������ ����ڰ� ������ �ڷ���(���� ��� String)���� ���ϰ� �ȴ�.

	private K key;
	private V value;
	
	public Box() {
	}

	public Box(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return this.key;
	}

	public V getValue() {
		return this.value;
	}
	
	
	
	

}
