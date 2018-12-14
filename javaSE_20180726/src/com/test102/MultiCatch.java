package com.test102;

import java.util.*;

public class MultiCatch {
	
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
				
				//�������� ���� ��Ȳ�� �� ���� ó���ϴ� ���
				//InputMismatchException -> Unchecked exceptions(Runtime Exceptions)
				//NoSuchElementException - if input is exhausted
				//IllegalStateException - if this scanner is closed
				a = sc.nextInt();  
				if (a == 0) break;
				System.out.println(a);
				
			}catch(NoSuchElementException | IllegalStateException e) {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			sc.nextLine();
		}
		
		sc.close();
		System.out.println("���α׷� ����.");
		
	}

}
