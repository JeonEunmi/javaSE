package com.test096;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotFound {

	public static void main(String[] args) {

		// 예외 발생 가능한 코드 작성
		
		// 예외 처리 코드 추가
		// (물리적) 파일 입출력 코드
		File file = new File("C:\\전은미_20180625~20190117\\01.javaSE\\전은미_20180706.txt");
		
		try {
			FileReader fr = new FileReader(file);
			System.out.println("정상 실행");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("비정상 종료");
		}
	}

}
