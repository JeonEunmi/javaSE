package com.test;

public class Sample035 {

	public static void main(String[] args) {
		// switch 구문
		// -> 비교 연산 중에 같음을 비교하는 연산만 가능하다.
		/*
		 switch(expression) {
   			case value :
      			// Statements
      		break; // optional
   
   			case value :
      			// Statements
      		break; // optional
   
   		// You can have any number of case statements.
   		default : // Optional  생략가능
      		// Statements
		}
		 */

		// 주사위 숫자 범위의 난수발생
		int a = (int)(Math.random()*6)+1;

		switch(a) {
		case 1 :
			System.out.println("1번이 나왔습니다.");
			break;
		case 2 :
			System.out.println("2번이 나왔습니다.");
			break;
		case 3 :
			System.out.println("3번이 나왔습니다.");
			break;
		case 4 :
			System.out.println("4번이 나왔습니다.");
			break;
		case 5 :
			System.out.println("5번이 나왔습니다.");
			break;
		default :
			System.out.println("6번이 나왔습니다.");

		}
	}

}
