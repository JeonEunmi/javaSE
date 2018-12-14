package com.test101;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
	
	public static void main(String[] args) {
		
		//예외(Exception)
		//->잘못된 자료 또는 조작에 의해 발생하는 오류
		//->적절한 처리(예외 처리)를 통해서 비정상 종료를 막을 수 있다.
		//->Checked exceptions, Unchecked exceptions(Runtime Exceptions)

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자>");
			int a = 0;
			try {
				a = sc.nextInt();  //InputMismatchException -> Unchecked exceptions(Runtime Exceptions)
				if (a == 0) break;
				System.out.println(a);
			}catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다.");
			}
			sc.nextLine();
		}
		
		sc.close();
		System.out.println("프로그램 종료.");
		
	}

}
