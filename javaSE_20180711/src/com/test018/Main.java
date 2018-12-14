package com.test018;

import com.test017.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// 다른 패키지, 다른 클래스에서 (instance) 메소드 호출
		// -> import 구문 필요
		// ->객체(instance) 생성 필요
		
		Test t = new Test();
		
		//t.method();   // 같은 패키지 안에서만 보인다.
		//t.method2();  // 같은 클래스 안에서만 보인다.
		//t.method3(); 
		//t.method4();  // 같은 패키지 + 상속 관계
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자(n)> ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.println(a);
		
		sc.close();
	}
}
