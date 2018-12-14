package com.test;

public class Sample102 {

	public static void main(String[] args) {

		// 참조 자료형(String) -> 기본 자료형(int, double) 형변환
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
		
		
		// 고유번호 동적 생성
		// 예를 들어, "S001" 값을 가지고 "S002" 번호 생성
		
		// 잘못된 방법
		// "S001" + 1 = > "S002"
		// Inter.parseInt("S001") + 1 => "S002"
		
		//올바른 방법
		// "S001" -> "001" 부분추출 -> Inter.parseInt("001") -> 1 -> 1 + 1 -> 2 -> "S002"
	}

}
