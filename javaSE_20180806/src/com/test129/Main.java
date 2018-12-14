package com.test129;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			
			// 프로그램 실행 현위치에 input.txt 파일을 물리적으로 사전 준비
			in = new FileInputStream("input.txt");
			// output.txt 파일은 실행의 결과물로서 생성된다.
			out = new FileOutputStream("output.txt");
			
			int count = 0;

			int c;
			byte[] bytes = new byte[100];
			// read() 메소드를 이용해서 byte 단위로 읽기 실행
			while ((c = in.read(bytes)) != -1) {
				// wirte() 메소드를 이용해서 byte 단위로 쓰기 실행
				out.write(bytes);
				++count;
			}
			System.out.println(count);
			System.out.println("input.txt -> output.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
