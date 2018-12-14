package com.test137;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//Schedule 클래스의 객체(instance)들(컬렉션)을 직렬화 시킨다.
		//->Serializable 인터페이스 구현 필요
		//모든 컬렉션 클래스는 직렬화 지원
		
		List<Schedule> scheduleList = new ArrayList<Schedule>();

		scheduleList.add(new Schedule("S001", "2018-01-01", "신정"));
		scheduleList.add(new Schedule("S002", "2018-02-16", "설날"));
		scheduleList.add(new Schedule("S003", "2018-03-01", "삼일절"));
		scheduleList.add(new Schedule("S004", "2018-05-05", "어린이날"));
		scheduleList.add(new Schedule("S005", "2018-05-22", "부처님오신날"));
		scheduleList.add(new Schedule("S006", "2018-06-06", "현충일"));
		scheduleList.add(new Schedule("S007", "2018-08-15", "광복절"));
		scheduleList.add(new Schedule("S008", "2018-09-24", "추석"));
		scheduleList.add(new Schedule("S009", "2018-10-03", "개천절"));
		scheduleList.add(new Schedule("S010", "2018-12-25", "성탄절"));
		scheduleList.add(new Schedule("S011", "2018-10-09", "한글날"));
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			//주스트림
			fos = new FileOutputStream("scheduleList.dat");

			//보조스트림
			oos = new ObjectOutputStream(fos);
			
			//직렬화가 가능한 클래스의 인스턴스 준비
			//객체(instance)->파일(바이너리 형식)
			//직렬화
			oos.writeObject(scheduleList); //NotSerializableException
			
			System.out.println("List<Schedule> scheduleList -> scheduleList.dat");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		 
		
	}

}
