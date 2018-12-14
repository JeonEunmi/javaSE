package com.schedule07;

import java.util.*;

import com.test.Member;

// ����� �
public class ScheduleList {

	// �ʵ� ���� -> List �÷��� ����� �
	private List<Schedule> scheduleArray = new ArrayList<Schedule>();

	// ������ -> �ʵ� �ʱ�ȭ
	public ScheduleList() {

		this.scheduleArray.add(new Schedule("S001", "2018-01-01", "����"));
		this.scheduleArray.add(new Schedule("S002", "2018-12-25", "ũ��������"));
		this.scheduleArray.add(new Schedule("S003", "2018-06-06", "������"));
		this.scheduleArray.add(new Schedule("S004", "2018-08-15", "������"));
		this.scheduleArray.add(new Schedule("S005", "2018-03-01", "������"));
		this.scheduleArray.add(new Schedule("S006", "2018-10-03", "��õ��"));
		this.scheduleArray.add(new Schedule("S007", "2018-10-09", "�ѱ۳�"));

	}

	// ��ȣ �ڵ� ���� �޼ҵ�
	public String autoGid() {

		String result = "";
		result = String.format("S%03d", (this.scheduleArray.size() + 1));
		return result;

	}

	// ������ �Է�
	public void scheduleAdd(Schedule schedule) {

		this.scheduleArray.add(schedule);

	}

	// ��� �޼ҵ�
	public List<Schedule> allSchedule() {

		return this.scheduleArray;

	}

	// private method
	// -> �˻� ���� �޼ҵ�
	// -> �˻� ������ �Ű� ������ String key, String value�� ����
	public List<Schedule> scheduleSearch(String key, String value) {

		// key -> �˻� ����, ���� ���, "Ư����"
		// value -> �˻� �ܾ�. ���� ��� "2018-07-19"
		// �˻� ����� null �� ����

		// �˻� ��� ����� �ӽ� �迭 �غ�
		List<Schedule> scheduleList = new ArrayList<Schedule>();

		// �迭 ����ҿ� �ִ� ���� ������ �˻��ϱ� ���� �ݺ���
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

	// �κ� ���� ������ ���� �޼ҵ� �߰�
	public int scheduleRemove(String key, String value) {

		int count = 0;

		for (int a = 0; a < this.scheduleArray.size(); ++a) {
			Schedule s = this.scheduleArray.get(a);

			// Ư�� ��ȣ ���� ���� ����
			if (key.equals("sid") && s.getSid().equals(value)) {
				this.scheduleArray.remove(s);
				--a;
				++count;
			}

			// Ư�� �� ���� ���� ����
			if (key.equals("day") && s.getScheduleDate().equals(value)) {
				this.scheduleArray.remove(s);
				--a;
				++count;
			}

			// Ư�� �� ���� ���� ����
			if (key.equals("month") && s.getScheduleDate().contains(value)) {
				this.scheduleArray.remove(s);
				--a;
				++count;
			}

			// Ư�� �ܾ� ���� ���� ����
			if (key.equals("content") && s.getScheduleContent().contains(value)) {
				this.scheduleArray.remove(s);
				--a;
				++count;
			}

		}

		return count;
	}

	// ��ü ���� ������ ���� �޼ҵ� �߰�
	public int scheduleRemoveAll() {
		// ����ҿ� ����� ��� ���� ����
		int result = this.scheduleArray.size();

		this.scheduleArray.clear();

		return result;
	}

}