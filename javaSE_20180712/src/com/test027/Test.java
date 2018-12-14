package com.test027;

public class Test {
	
	//문제) 여러명의 회원정보를 전달받고, 출력하는 메소드 선언
	
	public void m(Member ...args) {
		for(int i=0; i < args.length; i++) {
			System.out.println(args[i].getName());
			System.out.println(args[i].getPhone());
			System.out.println(args[i].getAge());
			if(i == args.length-1) {
				System.out.println();
			}else {
			System.out.println("---------------");
			}
		}

	}

}