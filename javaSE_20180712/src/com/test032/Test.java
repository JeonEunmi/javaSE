package com.test032;

public class Test {
	
	//가변 매개변수와 배열 객체 전달 차이점
	
	//1. 정수 값 여러개 전달시 합 연산 및 결과 반환. 가변 매개변수
	// 메소드를 만든 후에 배열을 생성하였기 때문에 return문 필요 
	// 값을 주다보니까 배열이 생성된것임
	public int calc1(int... args) {
		int result = 0;
		for (int a = 0; a<args.length; ++a) {
			result += args[a];
		}
		return result;
	}
	
	//2. 정수 값 여러개 전달시 합 연산 및 결과 반환. 배열 객체
	// 메소드를 만드는 시점부터 배열에 넣어서 연산 1번과 차이점이 있음 참조주소를 줌
	public void calc2(int[] args) {
		int len = args.length - 1;
		int result = 0;
		for (int a = 0; a<len; ++a) {
			result += args[a];
		}
		args[len]  = result;
	}
	
	//3. 정수 값 여러개 전달시 합 연산 및 결과 반환. 배열 객체
	//권장사항
	public int calc3(int[] args) {
		int result = 0;
		for (int a = 0; a<args.length; ++a) {
			result += args[a];
		}
		return result;
	}
	
}
