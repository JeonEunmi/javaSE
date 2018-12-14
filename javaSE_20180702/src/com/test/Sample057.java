package com.test;

// 내 프로그램에 다른 곳에 있는 패키지의 클래스를 끌어다 쓰려고 할 때 사용한다.
// ( * : 명칭을 잘 모를 때 사용하는 와일드카드)
import java.util.*;

public class Sample057 {

	public static void main(String[] args) {
		// 외부(키보드) 입력
		// ->java.util 패키지의 Scanner 클래스
		
		// Scanner 클래스의 객체(instance) 생성
		Scanner sc = new Scanner(System.in);
		
		// 숫자(정수) 입력
		int a = sc.nextInt();
		// 엔터키를 문자로 받으므로 엔터문자를 버릴 것을 추가로 생성해준다.
		sc.nextLine();
		// 입력받은 자료 출력
		System.out.println(a);
		
		// 문자열 입력
		String b = sc.nextLine();
		// 입력받은 자료 출력
		System.out.println(b);
		
		// Scanner 클래스의 객체(instance) 사용 종료
		sc.close();
	}

}
