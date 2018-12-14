package com.test138;

import java.io.*;
import java.util.*;

public class Main2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//Schedule 클래스의 객체(instance)들(컬렉션)을 직렬화 시킨다.
		//->Serializable 인터페이스 구현 필요
		//모든 컬렉션 클래스는 직렬화 지원
		
		List<Schedule> schedule = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			//주스트림
			fis = new FileInputStream("scheduleList.dat");

			//보조스트림
			ois = new ObjectInputStream(fis);
			
			//파일(바이너리 형식)->객체(instance)
			//역직렬화
			schedule = (List<Schedule>)ois.readObject();
			
			System.out.println("scheduleList.dat -> List<Schedule> schedule");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException | ClassNotFoundException  e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		 
		
		for (Schedule s : schedule) {
			System.out.println(s);
		}
		
	}

}
