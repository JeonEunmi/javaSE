package com.schedule07;

import java.time.LocalDate;
import java.util.*;

// ����� + ���� �޴��� �׼� Ŭ���� ����
public class SubMain {

	private ScheduleList s = new ScheduleList();

	// public method
	// 1. ���� �Է� �޴� �޼ҵ�
	public void scheduleAdd(Scanner sc) {
		// �ܼ� �׼� �ʿ�
		System.out.println("");
		System.out.print("��¥(YYYY-MM-DD)? ");
		String scheduleDate = sc.nextLine();
		System.out.print("����(200�� �̳�)? ");
		String scheduleContent = sc.nextLine();

		String sid = s.autoGid();

		Schedule tmp = new Schedule(sid, scheduleDate, scheduleContent);
		this.s.scheduleAdd(tmp);
		
		System.out.println("������ �ԷµǾ����ϴ�.");

	}

	// public method
	// 2. ���� ��� �� �˻� �޴� �޼ҵ�
	public void scheduleSearch(Scanner sc) {

		while (true) {

			System.out.println();
			System.out.println("======================================================");
			System.out.println("1. ���� ����  |  2. Ư�� �� ����  |  3. Ư�� �� ���� ");
			System.out.println("4. Ư�� �ܾ� ���� ����  |   5. ��ü ����   |  6. ����");
			System.out.println("======================================================");
			System.out.print("����> ");

			int selectNo = 0;

			selectNo = sc.nextInt();
			sc.nextLine();

			if (selectNo == 6)
				break;

			switch (selectNo) {

			case 1:
				this.todaySchedule();
				break;
			case 2:
				this.daySchedule(sc);
				break;
			case 3:
				this.monthSchedule(sc);
				break;
			case 4:
				this.wordSearch(sc);
				break;
			case 5:
				this.allSchedule();
				break;
			}
		}

	}

	// ���� �޴� ����
	// -> 1. ���� ���� 2. Ư�� �� ���� 3. Ư�� �� ���� 4. Ư�� �ܾ� ���� ���� 5. ��ü ���� 6. ����

	// private method
	// 1. ���� ���� �޴� �޼ҵ�
	private void todaySchedule() {

		String value = LocalDate.now().toString();

		this.print(this.s.scheduleSearch("today", value));
	}

	// private method
	// 2. Ư�� �� ���� �޼ҵ�
	private void daySchedule(Scanner sc) {

		System.out.print("Ư���� (YYYY-MM-DD)? ");
		String value = sc.nextLine();

		// �˻� ���� �޼ҵ� ȣ��
		// null �� ���� �纻 �迭 ��ȯ
		// ->��� ���� �޼ҵ� ȣ��
		this.print(this.s.scheduleSearch("day", value));

	}


	// private method
	// 3. Ư�� �� ���� �޼ҵ�
	private void monthSchedule(Scanner sc) {
		System.out.print("Ư���� (YYYY-MM)? ");
		String value = sc.nextLine();

		// �˻� ���� �޼ҵ� ȣ��
		// null �� ���� �纻 �迭 ��ȯ
		// ->��� ���� �޼ҵ� ȣ��
		this.print(this.s.scheduleSearch("month", value));
	}

	// private method
	// 4. Ư�� �ܾ� ���� �޼ҵ�
	private void wordSearch(Scanner sc) {
		System.out.print("ã�����ϴ� �˻� �ܾ �Է��ϼ���. >  ");
		String value = sc.nextLine();

		this.print(this.s.scheduleSearch("content", value));
	}

	// private method
	// 5. ��ü ���� �޼ҵ�
	private void allSchedule() {
		// ��½� ���� ������ ��¥������ ���ĵ� ���·� ��µǵ��� �Ѵ�.
		/*
		 * this.idx�� null���� ������� ��� ��Ȯ���� ���� �� �־ count�� ������ �ٽ� �����ִ� ���� ����. int count =
		 * 0; for (Schedule s : schedule){ if( s != null) ++count; }
		 */


		// ��� ���� �޼ҵ� ȣ�� -> print()
		this.print(this.s.allSchedule());
	}

	public void scheduleRemove(Scanner sc) {
		
		while (true) {
			
			System.out.println();
			System.out.println("========================================================");
			System.out.println("1. Ư�� ��ȣ ����  |  2. Ư�� �� ����  |  3. Ư�� �� ���� ");
			System.out.println("4. Ư�� �ܾ� ���� ����  |   5. ��ü ����   |  6. ����");
			System.out.println("========================================================");
			System.out.print("����> ");
			
			int selectNo = 0;
			
			selectNo = sc.nextInt();
			sc.nextLine();
			
			if (selectNo == 6)
				break;
			
			switch (selectNo) {
			
			case 1:
				this.scheduleRemoveSid(sc);
				break;
			case 2:
				this.scheduleRemoveDate(sc);
				break;
			case 3:
				this.scheduleRemoveMonth(sc);
				break;
			case 4:
				this.scheduleRemoveWord(sc);
				break;
			case 5:
				this.scheduleRemoveAll(sc);
				break;
			}
		}
	}
	
	private void scheduleRemoveSid(Scanner sc) {
		// 1. Ư�� ���� Ȯ��
		// 2. Ư�� ������ �����ϴ� ������ �˻��ϰ� ���
		// 3. ���� ���� Ȯ��
		// 4. Ư�� ������ �����ϴ� ������ ���� ���� ���� -> remove() �޼ҵ�
		System.out.print("������ ��ȣ�� �Է��ϼ���. > ");
		String removeSid = sc.nextLine();
		
		
		this.print(this.s.scheduleSearch("sid", removeSid));
		
		// ���� ���� Ȯ�� + ���� ���� �޼ҵ�
		this.scheduleRomovePrint(sc, "sid", removeSid);
		
		
	}
	private void scheduleRemoveDate(Scanner sc) {
		
		System.out.print("������ ��¥(YYYY-MM-DD)�� �Է��ϼ���. > ");
		String removeDate = sc.nextLine();
		
		
		this.print(this.s.scheduleSearch("day", removeDate));
		
		
		this.scheduleRomovePrint(sc, "day", removeDate);
		
	}
	private void scheduleRemoveMonth(Scanner sc) {
		
		System.out.print("������ ��(YYYY-MM)�� �Է��ϼ���. > ");
		String removeMonth = sc.nextLine();
		
		
		this.print(this.s.scheduleSearch("month", removeMonth));
		
		this.scheduleRomovePrint(sc, "month", removeMonth);
		
	}
	private void scheduleRemoveWord(Scanner sc) {
		System.out.print("������ �ܾ �Է��ϼ���. > ");
		String removeWord = sc.nextLine();
		
		
		this.print(this.s.scheduleSearch("content", removeWord));
		
		this.scheduleRomovePrint(sc, "content", removeWord);
		
	}
	private void scheduleRemoveAll(Scanner sc) {
		// 1. ��ü ���� ���
		// 2. ���� ���� Ȯ��
		// 3. ��ü ���� ���� ���� -> clear() �޼ҵ�
		
		System.out.println();
		System.out.println("��ü ������ �����մϴ�.");
		System.out.println("���� �����ϰڽ��ϱ�? (Y/N)");
		String num = sc.nextLine();
		
		if(num.equalsIgnoreCase("Y")) {
			this.s.scheduleRemoveAll();
			System.out.println("���� �۾��� �Ϸ� �Ǿ����ϴ�.");
		} else {
			System.out.println("���� �۾��� ��� �Ǿ����ϴ�.");
		}
		
	}
	// private method
	// -> ���� + ��� �׼� �޼ҵ�
	// -> null ���� ���� �迭�� �ܺο��� ���� �޴´�.
	private void print(List<Schedule> allSchedule) {

		System.out.println("======================================================");
		System.out.println("��ȣ		��¥	    ����");
		System.out.println("======================================================");

		// ���� �׼� �߰�
		// Arrays.sort(allSchedule);

		// ���� �׼�
		Collections.sort(allSchedule, new Comparator<Schedule>() {

			@Override
			public int compare(Schedule o1, Schedule o2) {
				return o1.getScheduleDate().compareTo(o2.getScheduleDate());
			}

		});

		// ��� �׼�
		int count = allSchedule.size();
		for (Schedule s : allSchedule) {
			System.out.println(s.toString());
		}
		System.out.println("------------------------------------------------------");
		System.out.println("�� " + count + "��");

	}
	
	private void scheduleRomovePrint(Scanner sc, String key, String value) {
		
		System.out.println();
		System.out.println("**������ �����մϴ�.");
		System.out.println("���� �����ϰڽ��ϱ�? (Y/N)");
		
		String num = sc.nextLine();
		
		if(num.equalsIgnoreCase("Y")) {
			int count = this.s.scheduleRemove(key, value);
			System.out.println(count + "���� ���� ������ �Ϸ� �Ǿ����ϴ�.");
		} else {
			System.out.println("���� ������ ��� �Ǿ����ϴ�.");
		}
	}
	

}
