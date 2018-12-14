package com.test029;

public class Test {
	
	// 전달받은 숫자들 중에서 가장 작은 숫자를 찾은 후, 반환
	//-> 배열(또는 컬렉션) 저장소 이용
	public int minFunction(int[] a) { //여러개의 숫자를 전달받는 변수 선언
		
		int result = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(result > a[i]) {
				result = a[i];
			}
		}
		
		return result;
	}

	// 전달받은 숫자들 중에서 가장 큰 숫자를 찾은 후, 반환
	//-> 배열(또는 컬렉션) 저장소 이용
	public int maxFunction(int[] a) { //여러개의 숫자를 전달받는 변수 선언
		
		int result = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(result < a[i]) {
				result = a[i];
			}
		}
		
		return result;
	}
	
	//Passing Parameters by Value
	//->보내는 쪽 a변수의 값(원본)이 받는쪽 a변수에 복사된다.
	public int sum(int a, int b) {
		int result = 0;
		
		//전달받은 값(사본)에 변화가 생겨도 원본에는 영향을 주지 않는다.
		result = a + b;
		
		//결과값 반환을 위한 return 구문 필요
		return result;
	}
	
	//Passing Parameters by Reference
	//->보내는 쪽 a변수의 참조변수가 받는쪽 a변수에 복사된다. 힙 영역의 실제 값은 공유된다.
	public void test(int[] a) {
			
		a[2] = a[0] + a[1];
				
		//결과값 반환을 위한 return 구문이 필요 없다
	}
}
