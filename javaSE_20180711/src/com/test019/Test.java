package com.test019;

public class Test {

	//����)
	//���� ��ȯ �޼ҵ� ����
	//->2����(String)�� 10����(String)�� ��ȯ
	/*
	1. 2���� �ڸ������� 2�� n�� ���� ���Ѵ�. 2�� 0�º��� 2�� n�±��� ���Ѵ�.
	2. ���� ���� ������� ��� ���Ѵ�.
	3. ���ϱ� ������ ������� 10������ �ȴ�.
	���� ���,
	2���� -> "1011" -> (1 * 2��3��) + (0 * 2��2��) + (1 * 2��1��) + (1 * 2��0��) => 8 + 0 + 2 + 1 => 11
	*/
	//"1011".substring(0, 1) -> Integer.parseInt("1") -> 1
	
	public String toDec(String bin) {
		String result = "";
		
		//1.���� ���� ���ڿ��� ���� Ȯ��
		//2.���ڼ���ŭ �ݺ��� ����
		//3.2���� ���ڿ����� �ڸ������� �и�
		//4.�и��� �ڸ����� ���ڿ��� ����ȯ
		//5.2��n�� ���ϱ� ����
		//6.���ϱ� ���� -> ����
		//7.�ݺ��� ������ ����� ���ڿ��� ����ȯ
		int sum = 0;
		for (int a=0; a<bin.length(); ++a) {
			sum += Integer.parseInt(bin.substring(a, (a+1))) * this.pow(2, bin.length()-a-1);	
		}
		result = String.valueOf(sum);
		
		return result;
	}
	
	// Ư������ n�� ����ϴ� �޼ҵ�
	// > private
	private int pow(int a, int b) { //(Ư����, n)
		int result = 0;
		
		//a�� b�� ����ϴ� ���� �߰�
		int c = 1;
		
		for(int j = 0; j < b ; ++j) { 

			c *= 2;
		}
		
		result = c;
		
		return result;
	}
	
	
}
