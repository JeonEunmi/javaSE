package com.grade02;

// �ڷ��� Ŭ����
public class Grade {

	// �ʵ� ����
	// ->�Է�, ��¿� �����ϴ� ��� �׸� �м�
	// ->��ȣ, �̸�, ����1, ����2, ����3, ����, ���, ����
	private String gid;
	private String name;
	private int subject1;
	private int subject2;
	private int subject3;
	private int totalSum;
	private double average;
	private int rank;
	
	// �⺻������, �Ű������� �ִ� ������
	public Grade() {
			
	}
	
	public Grade(String gid, String name, int subject1, int subject2, int subject3) {
		this.gid = gid;
		this.name = name;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		
		// ����, ��� ���� ���� -> �ܺο��� ���� �޴� �� �ƴ�
		
	}
	// getter, setter
	public String getGid() {
		return this.gid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSubject1() {
		return this.subject1;
	}

	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}

	public int getSubject2() {
		return this.subject2;
	}

	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}

	public int getSubject3() {
		return this.subject3;
	}

	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getTotalSum() {
		// ���� ���� ����
		this.totalSum = this.getSubject1() + this.getSubject2() + this.getSubject3();
		
		return this.totalSum;
	}

	public double getAverage() {
		// ��� ���� ����
		// ����))
		// this.total�� �ƴ϶� this.getTotal()�� ����Ǿ�� �Ѵ�.
		// this.total�� �ۼ��� ��� -> this.getTotal()�� ���� ����ȴٴ� ������ �����Ƿ� ���� �߻�
		// this.getTotal()�� �ۼ��Ͽ� �������־�� �Ѵ�.
		this.average = this.getTotalSum() / 3.0;
		
		return this.average;
	}
	
	// toString() �޼ҵ�
	// ����))
	// this. ���ƴ϶� this.get () ���� �ۼ�
	// ������ �ۼ��Ǳ� ���� toString()�� ����Ǹ� ���� �߻� -> ����������� ���� ������
	
	//double �ڷ��� ��½� �Ҽ� ���� �ڸ��� ���� -> %.�ڸ���f   (%��ü�ڸ���(�����ʳ��� �����ϰԸ��⶧).�ڸ���f)
	public String toString() {
		String result = "";
		result = String.format("%-6s  | %-6s| %3d | %3d | %3d | %3d | %3.1f | %3d",
						this.getGid(), this.getName(), this.getSubject1(), this.getSubject2(), this.getSubject3()
						, this.getTotalSum(), this.getAverage(), this.getRank());
		return result;
	}
}
