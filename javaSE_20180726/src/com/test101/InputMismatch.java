package com.test101;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
	
	public static void main(String[] args) {
		
		//����(Exception)
		//->�߸��� �ڷ� �Ǵ� ���ۿ� ���� �߻��ϴ� ����
		//->������ ó��(���� ó��)�� ���ؼ� ������ ���Ḧ ���� �� �ִ�.
		//->Checked exceptions, Unchecked exceptions(Runtime Exceptions)

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("����>");
			int a = 0;
			try {
				a = sc.nextInt();  //InputMismatchException -> Unchecked exceptions(Runtime Exceptions)
				if (a == 0) break;
				System.out.println(a);
			}catch(InputMismatchException e) {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			sc.nextLine();
		}
		
		sc.close();
		System.out.println("���α׷� ����.");
		
	}

}
