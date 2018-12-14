package com.test132;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		// 표준 입출력 장치(키보드, 콘솔)를 이용한 I/O 클래스
		// ->System.in , System.out
		
		InputStream is = System.in;
		
		try {
			int a = is.read();
			System.out.println(a); // ASCII 코드 출력
			System.out.println((char)a); // 문자
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}

