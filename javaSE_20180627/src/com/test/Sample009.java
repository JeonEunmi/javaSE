package com.test;

public class Sample009 {

	public static void main(String[] args) {
		// 실수 자료형 취급시 주의
		
		int apple = 1;
		double piecesUnit = 0.1;
		int number = 7;
		
		double result = apple - (number * piecesUnit);  // 1-(7*0.1) = 1-0.7 = 0.3
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 뺴면,");
		System.out.println(result+ " 조각이 남는다.");
		System.out.println();
		System.out.println("------------  정수연산으로 변경 후 다시 계산");
		
		
		int apple1 = 1;
		int totalPiece = apple1 * 10;
		int number1 = 7;
		int tmp = totalPiece - number1;
		
		double result1 = tmp/10.0;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 뺴면,");
		System.out.println(result1+ " 조각이 남는다.");

	}

}

