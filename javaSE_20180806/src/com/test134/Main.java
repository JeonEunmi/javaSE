package com.test134;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		// 파일 단위 액션(생성, 삭제 등) 클래스
		// ->File

		File file = new File("input.txt");

		// 파일의 존재 유무 확인
		System.out.println(file.exists());

		// 파일 목록 읽어오기
		File file2 = new File("C:\\workspace\\01.javaSE\\javaSE_20180806");
		String[] list = file2.list();
		for (String s : list) {
			System.out.println(s);
		}
		
		// 물리적 파일 삭제
		File file3 = new File("output.txt");
		file3.delete();
	}

} 
