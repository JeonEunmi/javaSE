package com.test100;

import java.util.Scanner;

public class InputMismatch {
	
	public static void main(String[] args) {
		
		//예외(Exception)
		//->잘못된 자료 또는 조작에 의해 발생하는 오류
		//->적절한 처리(예외 처리)를 통해서 비정상 종료를 막을 수 있다.
		//->Checked exceptions, Unchecked exceptions(Runtime Exceptions)

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자> ");
		int a = sc.nextInt();  //InputMismatchException -> Unchecked exceptions(Runtime Exceptions)
		sc.nextLine();
		
		System.out.println(a);
		
		sc.close();
		
	}

}
