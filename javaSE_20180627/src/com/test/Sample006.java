package com.test;

public class Sample006 {

	public static void main(String[] args) {
			// float 자료형
			// 실수 저장용 자료형
			// 접미사 F 표시 필요
			// 일반적으로 실수 취급시 double 자료형을 기본으로 사용한다.
			// 실수 자료 연산시 부정확한 결과가 나올 수 있다. -> 메모리 저장 방식
			// 실수의 일반적인 형태는 0.123 같은 숫자이다.  -> 메모리에서는 지수부, 가수부로 구분해서 저장
			// 지수 표현 5E7 은 5*10^7을 나타낸다.

			//float a = 3.141592;
			float b = 3.141592f;		
			float c = 0.123456789012f;
			
			//E표현
			float d = 2E-3F;  // 2*10^-3 , 0.002 오차발생
			
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}

	}
