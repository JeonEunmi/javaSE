package com.test099;

public class NumberFormat {
	
	public static void main(String[] args) {
		
		//����(Exception)
		//->�߸��� �ڷ� �Ǵ� ���ۿ� ���� �߻��ϴ� ����
		//->������ ó��(���� ó��)�� ���ؼ� ������ ���Ḧ ���� �� �ִ�.
		//->Checked exceptions, Unchecked exceptions(Runtime Exceptions)

		/*
		Integer Ŭ������ parseInt() �޼ҵ� �ñ״�ó
		public static int parseInt(String s)
                    throws NumberFormatException
		*/
		/*
		java.lang.Object
			java.lang.Throwable
				java.lang.Exception
					java.lang.RuntimeException
						java.lang.IllegalArgumentException
							java.lang.NumberFormatException
		*/
		//->Unchecked Exception(Runtime Exception)
		
		System.out.println(Integer.parseInt("10"));
		System.out.println(Integer.parseInt("TEST"));
		
	}

}
