package com.test;

public class Sample045 {

	public static void main(String[] args) {
		// 반복문 -> while, do -while 구문
		// 지정한 횟수만큼 반복 실행하는 구문

		// 조건을 먼저 확인한 후에 실행한다.
		/*
		 * while(Boolean_expression) { // Statements }
		 */

		// 실행한 후에 조건을 확인한다.
		// 조건문이 거짓이라 하더라도 최소 한번은 실행한다는 점이 while문과 다르다.
		// for구문이 사용할 수 없는 예제는 do-while구문을 이용한다.
		/*
		 * do { // Statements }while(Boolean_expression);
		 */

		// 1부터 10까지의 수를 출력한다.
		for (int i = 1; i <= 10; ++i) {
			System.out.println(i);
		}

		// 1부터 10까지의 수를 출력
		// 외부 입력 값에 따라서 액션 진행 여부 결정할 경우
		// -> do-while 구문만 사용 가능
		int a = 1;
		do {
			System.out.println(a);
			++a;
		} while (a <= 10);

		// while구문으로 수정!
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			++i;
		}
		// 무한 실행
		while (true) {
			System.out.println("Hello, world!");
		}

		// 무한실행 탈출!
		/*
		 * if (조건){ break; }
		 */
	}

}
