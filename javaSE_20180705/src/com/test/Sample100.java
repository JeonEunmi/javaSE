package com.test;

public class Sample100 {

	public static void main(String[] args) {
		
		// main() 메소드의 매개변수
		// -> 로컬 변수 (한정된 범위내에서 활약가능)
		// -> JVM이 프로그램 실행시 매개변수에게 배열객체를 전달
		
		String[] a = new String[5];
		// main 메소드의 "= new String[];" 생략된 이부분은 JVM이 알아서 해줌
		
		System.out.println(a); // 메모리상의 참조주소가 보여진다면 정상적으로 적재됨
		System.out.println(a[0]); // 자동 초기화  null
		System.out.println(a.length); //5
		System.out.println(args);  // 참조주소
		System.out.println(args.length); // 0
		System.out.println(args[0]); // ArrayIndexOutOfBoundsException
	}

}
