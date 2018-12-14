package com.employee.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.employee.domain.Department;
import com.employee.domain.Employee;
import com.employee.domain.Position;
import com.employee.domain.Region;
import com.employee.persistance.EmployeeDAO;

// ���� �޴��� �׼� Ŭ����
public class SubMain {

	// EmployeeDAO Ŭ������ ��ü ���� �� �ʵ� ����
	private EmployeeDAO dao = new EmployeeDAO();
	
	// ���� �޴� � �޼ҵ�
	
	// ���� ���� v1.0 > ���� ����
	// 1. ���� �Է�  2. ���� ��ü ���  3. ���� �˻�
	public void mainMenu1(Scanner sc) {
		System.out.println();
		
		while(true) {
			
			try {
				System.out.println("=================");
				System.out.println(" ������ ���� v1.0 > ���� ����");
				System.out.println("=================");
				
				System.out.println("1. ���� �Է� | 2. ���� ��ü ��� | 3. ���� �˻�");
				System.out.print("����(1~3, 0 exit)?  ");
				
				int selectNum = 0;
				selectNum = sc.nextInt();
				sc.nextLine();
				
				if(selectNum == 0) {
					break;
				}
				
				switch(selectNum) {
				
				case 1:
					this.mainMenu1_sub1(sc);
					break;
				case 2:
					this.mainMenu1_sub2(sc);
					break;
				case 3:
					this.mainMenu1_sub3(sc);
					break;
				}
				
			} catch(Exception e){
				sc.nextLine();
				System.out.println("�͢� �߸��� ���� �Դϴ�.");
			}
			System.out.println();
		}
		
	}
	
	// ���� ���� v1.0 > ���� ���� > �����Է�
	private void mainMenu1_sub1(Scanner sc) {
		
		

			
		
	}
	
	// ���� ���� v1.0 > ���� ���� > ���� ��ü ���
	// 1.��� ����  2.�̸� ����  3.���� ����  4.�μ� ����  5.���� ����
	private void mainMenu1_sub2(Scanner sc) {
		System.out.println();
		
		while(true) {
			
			try {
				System.out.println("=================");
				System.out.println(" ������ ���� v1.0 > ���� ���� > ���� ��ü ���");
				System.out.println("=================");
				
				System.out.println("1.��� ���� | 2.�̸� ���� | 3.���� ���� | 4.�μ� ���� | 5.���� ����");
				System.out.print("����(1~5, 0 exit)?  ");
				
				int selectNum = 0;
				selectNum = sc.nextInt();
				sc.nextLine();
				
				if(selectNum == 0) {
					break;
				}
				
				switch(selectNum) {
				
				case 1:
					this.mainMenu1_sub2_sub1();
					break;
				case 2:
					this.mainMenu1_sub2_sub2();
					break;
				case 3:
					this.mainMenu1_sub2_sub3();
					break;
				case 4:
					this.mainMenu1_sub2_sub4();
					break;
				case 5:
					this.mainMenu1_sub2_sub5();
					break;
				}
				
			} catch(Exception e){
				sc.nextLine();
				System.out.println("�͢� �߸��� ���� �Դϴ�.");
			}
			System.out.println();
		}
		
	}
	// ���� ���� v1.0 > ���� ���� > ���� ��ü ��� > ��� ����
	private void mainMenu1_sub2_sub1() {

		// ���� ���� ���� ��� �׼� �׽�Ʈ
		// null ���� ���� �纻 �迭 ��ȯ �޴´�.
		Employee[] employeeList = dao.employeeList();
		// -> ��� ����
		// null ���� ���� �纻 �迭�̹Ƿ� ũ�⸦ Ȯ���ϸ� ��ü �ο� Ȯ���� �����ϴ�.
		System.out.println("��ü �ο� : " + employeeList.length + "��");
		System.out.println("��� / �̸� / �ֹι�ȣ / �Ի��� / ��ȭ��ȣ / ������ / �μ��� / ������ / �⺻�� / ���� / �޿�");
		
		// null���� ���� �迭�� ������ ��� ���� ���� �׼� �߰�
		Arrays.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getemployeeID().compareTo(o2.getemployeeID());
			}
			
		});
		
		for (Employee e : employeeList) {
			System.out.printf("%s / %s / %s / %s/ %s/ %s/ %s/ %s/ %,d/ %,d/ %,d %n"
					, e.getemployeeID(), e.getEmployName()
					, e.getSsn(), e.getJoinDate(), e.getCallNum()
					, dao.regionSearch("regionId",e.getRegionID()).getRegionName()
					, dao.departmentSearch("departmentId",e.getDepartmentID()).getDepartmentName()
					, dao.positionSearch("positionId",e.getPositionID()).getPositionID()
					, e.getBasePay(), e.getExtraPay(), e.getPay());
		}
	}
	
	// ���� ���� v1.0 > ���� ���� > ���� ��ü ��� > �̸� ����
	private void mainMenu1_sub2_sub2() {
		
	}
	
	// ���� ���� v1.0 > ���� ���� > ���� ��ü ��� > ���� ����
	private void mainMenu1_sub2_sub3() {
		
	}
	
	// ���� ���� v1.0 > ���� ���� > ���� ��ü ��� > �μ� ����
	private void mainMenu1_sub2_sub4() {
		
	}
	// ���� ���� v1.0 > ���� ���� > ���� ��ü ��� > ���� ����
	private void mainMenu1_sub2_sub5() {
		
	}

	// ���� ���� v1.0 > ���� ���� > ���� �˻�
	// 1.��� ����  2.�̸� ����  3.���� ����  4.�μ� ����  5.���� ����	
	private void mainMenu1_sub3(Scanner sc) {
		
	}
	
	// ���� ���� v1.0 > ���� ���� > ���� �˻� > ��� ����
	private void mainMenu1_sub3_sub1() {
		
	}
	
	// ���� ���� v1.0 > ���� ���� > ���� �˻� > �̸� ����
	private void mainMenu1_sub3_sub2() {
		
	}
	
	// ���� ���� v1.0 > ���� ���� > ���� �˻� > ���� ����
	private void mainMenu1_sub3_sub3() {
		
	}
	
	// ���� ���� v1.0 > ���� ���� > ���� �˻� > �μ� ����
	private void mainMenu1_sub3_sub4() {
		
	}
	
	// ���� ���� v1.0 > ���� ���� > ���� �˻� > ���� ����
	private void mainMenu1_sub3_sub5() {
		
	}
	
	// ���� ���� v1.0 > ���� ���� ����
	// 1. ���� ����  2. �μ� ����  3. ���� ����
	public void mainMenu2(Scanner sc) {
		System.out.println();
		
		while(true) {
			
			try {
				System.out.println("=================");
				System.out.println(" ������ ���� v1.0 > ���� ���� ����");
				System.out.println("=================");
				
				System.out.println("1. ���� ���� | 2. �μ� ���� | 3. ���� ����");
				System.out.print("����(1~3, 0 exit)?  ");
				
				int selectNum = 0;
				selectNum = sc.nextInt();
				sc.nextLine();
				
				if(selectNum == 0) {
					break;
				}
				
				switch(selectNum) {
				
				case 1:
					this.mainMenu2_sub1(sc);
					break;
				case 2:
					this.mainMenu2_sub2(sc);
					break;
				case 3:
					this.mainMenu2_sub3(sc);
					break;
				}
				
			} catch(Exception e){
				sc.nextLine();
				System.out.println("�͢� �߸��� ���� �Դϴ�.");
			}
			System.out.println();
		}
	}
	
	// ���� ���� v1.0 > ���� ���� ���� > ���� ����
	// 1. ���� �Է�  2. ���� ���
	private void mainMenu2_sub1(Scanner sc) {
		System.out.println();
		
		while(true) {
			
			try {
				System.out.println("=================");
				System.out.println(" ������ ���� v1.0 > ���� ���� ���� > ���� ����");
				System.out.println("=================");
				
				System.out.println("1. ���� �Է� | 2. ���� ���");
				System.out.print("����(1~2, 0 exit)?  ");
				
				int selectNum = 0;
				selectNum = sc.nextInt();
				sc.nextLine();
				
				if(selectNum == 0) {
					break;
				}
				
				switch(selectNum) {
				
				case 1:
					this.mainMenu2_sub1_sub1(sc);
					break;
				case 2:
					this.mainMenu2_sub1_sub2();
					break;
				}
				
			} catch(Exception e){
				sc.nextLine();
				System.out.println("�͢� �߸��� ���� �Դϴ�.");
			}
			System.out.println();
		}
	}
	
	// ���� ���� v1.0 > ���� ���� ���� > ���� ���� > ���� �Է�
	private void mainMenu2_sub1_sub1(Scanner sc) {
		
		// ���� ������ȣ / ������ ���
		this.mainMenu2_sub1_sub2();
		// �ܼ� �Է��� ���� �ܺ� �Է�
		// -> �ű� ������
		System.out.print("�ű� ���� �̸�?  ");
		String regionName = sc.nextLine();
		
		// �ű� ������ ����ҿ� ����ϴ� �޼ҵ� ȣ��
		this.dao.regionAdd(new Region(this.dao.autoRegionID(), regionName));
		
		System.out.println("�ű� ���� ���� �Է� �Ϸ�!");
		System.out.println();

	}

	// ���� ���� v1.0 > ���� ���� ���� > ���� ���� > ���� ���
	private void mainMenu2_sub1_sub2() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("������ȣ �����̸�");
		Region[] tmp = dao.regionList();
		for (Region r : tmp) {
			System.out.println(r);
		}
		System.out.println("--------------------");
		System.out.println();
		
	}
	
	// ���� ���� v1.0 > ���� ���� ���� > �μ� ����
	// 1. �μ� �Է�  2. �μ� ���
	private void mainMenu2_sub2(Scanner sc) {
		System.out.println();
		
		while(true) {
			
			try {
				System.out.println("=================");
				System.out.println(" ������ ���� v1.0 > ���� ���� ���� > �μ� ����");
				System.out.println("=================");
				
				System.out.println("1. �μ� �Է� | 2. �μ� ���");
				System.out.print("����(1~2, 0 exit)?  ");
				
				int selectNum = 0;
				selectNum = sc.nextInt();
				sc.nextLine();
				
				if(selectNum == 0) {
					break;
				}
				
				switch(selectNum) {
				
				case 1:
					this.mainMenu2_sub2_sub1(sc);
					break;
				case 2:
					this.mainMenu2_sub2_sub2();
					break;
				}
				
			} catch(Exception e){
				sc.nextLine();
				System.out.println("�͢� �߸��� ���� �Դϴ�.");
			}
			System.out.println();
		}
	}
	
	// ���� ���� v1.0 > ���� ���� ���� > �μ� ���� > �μ� �Է�
	private void mainMenu2_sub2_sub1(Scanner sc) {
		
		// ���� �μ���ȣ / �μ��� ���
		this.mainMenu2_sub2_sub2();
		// �ܼ� �Է��� ���� �ܺ� �Է�
		// -> �ű� �μ���
		System.out.print("�ű� �μ� �̸�?  ");
		String departmentName = sc.nextLine();
		
		// �ű� �μ��� ����ҿ� ����ϴ� �޼ҵ� ȣ��
		this.dao.departmentAdd(new Department(this.dao.autoDepartmentID(), departmentName));
		
		System.out.println("�ű� �μ� ���� �Է� �Ϸ�!");
		System.out.println();
		
	}

	// ���� ���� v1.0 > ���� ���� ���� > �μ� ���� > �μ� ���
	private void mainMenu2_sub2_sub2() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("�μ���ȣ �μ���");
		Department[] tmp = dao.departmentList();
		for (Department d : tmp) {
			System.out.println(d);
		}
		System.out.println("--------------------");
		System.out.println();
	}
	
	// ���� ���� v1.0 > ���� ���� ���� > ���� ����
	// 1. ���� �Է�  2. ���� ���
	private void mainMenu2_sub3(Scanner sc) {
		System.out.println();
		
		while(true) {
			
			try {
				System.out.println("=================");
				System.out.println(" ������ ���� v1.0 > ���� ���� ���� > ���� ����");
				System.out.println("=================");
				
				System.out.println("1. ���� �Է� | 2. ���� ���");
				System.out.print("����(1~2, 0 exit)?  ");
				
				int selectNum = 0;
				selectNum = sc.nextInt();
				sc.nextLine();
				
				if(selectNum == 0) {
					break;
				}
				
				switch(selectNum) {
				
				case 1:
					this.mainMenu2_sub3_sub1(sc);
					break;
				case 2:
					this.mainMenu2_sub3_sub2();
					break;
				}
				
			} catch(Exception e){
				sc.nextLine();
				System.out.println("�͢� �߸��� ���� �Դϴ�.");
			}
			System.out.println();
		}
	}
	
	// ���� ���� v1.0 > ���� ���� ���� > ���� ���� > ���� �Է�
	private void mainMenu2_sub3_sub1(Scanner sc) {
		// ���� ������ȣ / ������ / �ּ� �⺻�� ���
		this.mainMenu2_sub3_sub2();
		// �ܼ� �Է��� ���� �ܺ� �Է�
		// -> �ű� ������
		System.out.print("�ű� ������ ?  ");
		String positionName = sc.nextLine();
		
		System.out.print("�ּ� �⺻�� ?  ");
		int minimumPay  = sc.nextInt();
		sc.nextLine();
		
		
		// �ű� ������ ����ҿ� ����ϴ� �޼ҵ� ȣ��
		this.dao.positionAdd(new Position(this.dao.autoPositionID(), positionName, minimumPay));
		
		System.out.println("�ű� ���� ���� �Է� �Ϸ�!");
		System.out.println();
	}

	// ���� ���� v1.0 > ���� ���� ���� > ���� ���� > ���� ���
	private void mainMenu2_sub3_sub2() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("������ȣ ������ �ּұ⺻��");
		Position[] tmp = dao.positionList();
		for (Position p : tmp) {
			System.out.println(p);
		}
		System.out.println("--------------------");
		System.out.println();
	}
	
	// ���� ���� ��� ���� �޼ҵ� ���� �߰� -> ���ؿ� ���� ���� ��� -> String key
	public void Print() {
		

	}
}
