package com.schedule01;

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
		int result = this.s.scheduleAdd(tmp);
		
		System.out.println("������ �ԷµǾ����ϴ�.");
		
		if(result == 1) {
			System.out.println();
			System.out.println("*****************  ��    ��  *****************");
			System.out.println("�迭 ����� �ʰ�. �ڵ����� 10�� ������ŵ�ϴ�.");
			System.out.println("**********************************************");
			System.out.println();
		}
		
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

	// private method
	// -> ���� + ��� �׼� �޼ҵ�
	// -> null ���� ���� �迭�� �ܺο��� ���� �޴´�.
	private void print(Schedule[] allSchedule) {

		System.out.println("======================================================");
		System.out.println("��ȣ		��¥	    ����");
		System.out.println("======================================================");

		// ���� �׼� �߰�
		// Arrays.sort(allSchedule);

		// ���� �׼� -> null �� ���� �迭�� ��츸 ����
		Schedule[] schedule = this.s.allSchedule();

		Arrays.sort(schedule, new Comparator<Schedule>() {

			@Override
			public int compare(Schedule o1, Schedule o2) {
				return o1.getScheduleDate().compareTo(o2.getScheduleDate());
			}

		});

		// ��� �׼�
		int count = schedule.length;
		for (Schedule s : schedule) {
			System.out.println(s.toString());
		}
		System.out.println("------------------------------------------------------");
		System.out.println("�� " + count + "��");

	}

}
