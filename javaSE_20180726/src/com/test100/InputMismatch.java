package com.test100;

import java.util.Scanner;

public class InputMismatch {
	
	public static void main(String[] args) {
		
		//����(Exception)
		//->�߸��� �ڷ� �Ǵ� ���ۿ� ���� �߻��ϴ� ����
		//->������ ó��(���� ó��)�� ���ؼ� ������ ���Ḧ ���� �� �ִ�.
		//->Checked exceptions, Unchecked exceptions(Runtime Exceptions)

		Scanner sc = new Scanner(System.in);
		
		System.out.print("����> ");
		int a = sc.nextInt();  //InputMismatchException -> Unchecked exceptions(Runtime Exceptions)
		sc.nextLine();
		
		System.out.println(a);
		
		sc.close();
		
	}

}
