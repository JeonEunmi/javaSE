package com.test099;

public class NumberFormat {
	
	public static void main(String[] args) {
		
		//예외(Exception)
		//->잘못된 자료 또는 조작에 의해 발생하는 오류
		//->적절한 처리(예외 처리)를 통해서 비정상 종료를 막을 수 있다.
		//->Checked exceptions, Unchecked exceptions(Runtime Exceptions)

		/*
		Integer 클래스의 parseInt() 메소드 시그니처
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
