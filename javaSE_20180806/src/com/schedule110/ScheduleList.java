package com.schedule110;

import java.io.*;
import java.util.*;

// 저장소 운영
public class ScheduleList {

	// 필드 선언 -> List 컬렉션 저장소 운영
	private List<Schedule> scheduleArray = new ArrayList<Schedule>();

	// 생성자 -> 필드 초기화
	public ScheduleList() {

		this.scheduleArray.add(new Schedule("S001", "2018-01-01", "신정"));
		this.scheduleArray.add(new Schedule("S002", "2018-12-25", "크리스마스"));
		this.scheduleArray.add(new Schedule("S003", "2018-06-06", "현충일"));
		this.scheduleArray.add(new Schedule("S004", "2018-08-15", "광복절"));
		this.scheduleArray.add(new Schedule("S005", "2018-03-01", "삼일절"));
		this.scheduleArray.add(new Schedule("S006", "2018-10-03", "개천절"));
		this.scheduleArray.add(new Schedule("S007", "2018-10-09", "한글날"));

	}

	// 번호 자동 증가 메소드
	public String autoGid() {

		String result = "";
		result = String.format("S%03d", (this.scheduleArray.size() + 1));
		return result;

	}

	// 스케쥴 입력
	public void scheduleAdd(Schedule schedule) {

		this.scheduleArray.add(schedule);

	}

	// 출력 메소드
	public List<Schedule> allSchedule() {

		return this.scheduleArray;

	}

	// private method
	// -> 검색 전용 메소드
	// -> 검색 진행은 매개 변수가 String key, String value로 고정
	public List<Schedule> scheduleSearch(String key, String value) {

		// key -> 검색 기준, 예를 들어, "특정일"
		// value -> 검색 단어. 예를 들어 "2018-07-19"
		// 검색 결과에 null 은 없음

		// 검색 결과 저장용 임시 배열 준비
		List<Schedule> scheduleList = new ArrayList<Schedule>();

		// 배열 저장소에 있는 일정 정보를 검색하기 위한 반복문
		for (Schedule s : this.scheduleArray) {

			String temp = null;
			if (key.equals("today") || key.equals("day") || key.equals("month")) {
				temp = s.getScheduleDate();
			}

			if (key.equals("content")) {
				temp = s.getScheduleContent();
			}

			if (key.equals("sid")) {
				temp = s.getSid();
			}

			if (temp.contains(value)) {
				scheduleList.add(s);
			}
		}

		return scheduleList;
	}

	// 부분 삭제 진행을 위한 메소드 추가
	public int scheduleRemove(String key, String value) {

		int count = 0;

		for (int a = 0; a < this.scheduleArray.size(); ++a) {
			Schedule s = this.scheduleArray.get(a);

			// 특정 번호 기준 삭제 진행
			if (key.equals("sid") && s.getSid().equals(value)) {
				this.scheduleArray.remove(s);
				--a;
				++count;
			}

			// 특정 일 기준 삭제 진행
			if (key.equals("day") && s.getScheduleDate().equals(value)) {
				this.scheduleArray.remove(s);
				--a;
				++count;
			}

			// 특정 월 기준 삭제 진행
			if (key.equals("month") && s.getScheduleDate().contains(value)) {
				this.scheduleArray.remove(s);
				--a;
				++count;
			}

			// 특정 단어 기준 삭제 진행
			if (key.equals("content") && s.getScheduleContent().contains(value)) {
				this.scheduleArray.remove(s);
				--a;
				++count;
			}

		}

		return count;
	}

	// 전체 삭제 진행을 위한 메소드 추가
	public int scheduleRemoveAll() {
		// 저장소에 저장된 모든 일정 삭제
		int result = this.scheduleArray.size();

		this.scheduleArray.clear();

		return result;
	}

	// 직렬화 메소드 추가
	public void Serializable() {
		// List 컬렉션의 상태값 전체를
		// scheduleList.dat 파일로 저장
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("scheduleList.dat");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(scheduleArray);

			System.out.println("List<Schedule> scheduleList -> scheduleList.dat");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	// 역직렬화 메소드 추가
	@SuppressWarnings("unchecked")
	public void reSerializable() {
		
		// 파일로 저장된 scheduleList.dat 파일을 읽어들여서
		// List 컬렉션 저장소에 할당
		// 주의) 최초 실행시 scheduleList.dat 파일이 존재하지 않는다.
		//    -> 파일 존재 유무 검사 과정 추가 
		
		File file = new File("scheduleList.dat");
		
		@SuppressWarnings("unused")
		List<Schedule> schtmp = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		if(file.exists() == true) {
			
			try {
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(fis);
				
				schtmp = (List<Schedule>)ois.readObject();
				System.out.println("scheduleList.dat -> List<Schedule> scheduleList");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				if(fis != null) {
					try {
						fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					} 
				}
				if(ois != null) {
					try {
						ois.close();
					} catch (IOException e) {
						e.printStackTrace();
					} 
				}
			}
			
			this.scheduleArray = schtmp;
			
		} else if(file.exists() != true){
			System.out.println("일정관리를 최초 시작합니다.");
		}
		
		
		
	}

}
