package com.test;

public class Sample102 {

	public static void main(String[] args) {

		// ���� �ڷ���(String) -> �⺻ �ڷ���(int, double) ����ȯ
		// Integer.parseInt(), Double.parseDouble()

		int[] a = { 30, 40, 20, 50, 10 };

		int sum = 0;

		for (int b = 0; b < a.length; ++b) {
			sum += a[b]; // int + int = int
		}

		System.out.println(sum);

		String[] c = { "30", "40", "20", "50", "10" };
		
		int total = 0;
		
		for (int b = 0; b < a.length; ++b) {
			total += Integer.parseInt(c[b]); // int + String -> int + int
		}
		System.out.println(total);
	 	
		
		// ������ȣ ���� ����
		// ���� ���, "S001" ���� ������ "S002" ��ȣ ����
		
		// �߸��� ���
		// "S001" + 1 = > "S002"
		// Inter.parseInt("S001") + 1 => "S002"
		
		//�ùٸ� ���
		// "S001" -> "001" �κ����� -> Inter.parseInt("001") -> 1 -> 1 + 1 -> 2 -> "S002"
	}

}
