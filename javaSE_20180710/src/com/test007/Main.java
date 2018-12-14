package com.test007;

public class Main {

	public static void main(String[] args) {
		
		//메소드(Method)

				//println() 메소드는 반환자료형이 void 이므로 반환값이 없다.
				//println() 메소드는 매개변수에 값 전달이 필요하다.
				//println() 메소드는 static 특성이 아니므로 System.out.println() 형태로 호출
				//println() 메소드에서 매개변수는 다양하게 지정 가능 -> Method Overloading
				System.out.println("TEST");
				
				//random() 메소드는 반환자료형이 double이므로 반환값이 있다.
				//random() 메소드는 매개변수에 값 전달이 필요없다.
				//random() 메소드는 static 특성을 가지므로 Math.random() 형태로 호출.
				System.out.println(Math.random());
	}

}
