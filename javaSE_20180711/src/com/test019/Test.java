package com.test019;

public class Test {

	//문제)
	//진법 변환 메소드 구현
	//->2진수(String)를 10진수(String)로 변환
	/*
	1. 2진수 자리수별로 2의 n승 값을 곱한다. 2의 0승부터 2의 n승까지 곱한다.
	2. 곱한 연산 결과값을 모두 더한다.
	3. 더하기 연산의 결과값이 10진수가 된다.
	예를 들어,
	2진수 -> "1011" -> (1 * 2의3승) + (0 * 2의2승) + (1 * 2의1승) + (1 * 2의0승) => 8 + 0 + 2 + 1 => 11
	*/
	//"1011".substring(0, 1) -> Integer.parseInt("1") -> 1
	
	public String toDec(String bin) {
		String result = "";
		
		//1.전달 받은 문자열의 길이 확인
		//2.글자수만큼 반복문 진행
		//3.2진수 문자열에서 자리수별로 분리
		//4.분리된 자리수의 문자열을 형변환
		//5.2의n승 곱하기 연산
		//6.더하기 연산 -> 누적
		//7.반복이 끝나면 결과를 문자열로 형변환
		int sum = 0;
		for (int a=0; a<bin.length(); ++a) {
			sum += Integer.parseInt(bin.substring(a, (a+1))) * this.pow(2, bin.length()-a-1);	
		}
		result = String.valueOf(sum);
		
		return result;
	}
	
	// 특정수의 n승 계산하는 메소드
	// > private
	private int pow(int a, int b) { //(특정수, n)
		int result = 0;
		
		//a의 b승 계산하는 과정 추가
		int c = 1;
		
		for(int j = 0; j < b ; ++j) { 

			c *= 2;
		}
		
		result = c;
		
		return result;
	}
	
	
}
