package com.employee.service;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

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
	// ===================================================================================
	// ���� ���� v1.0 > ���� ����
	// 1. ���� �Է� 2. ���� ��ü ��� 3. ���� �˻�
	public void mainMenu1(Scanner sc) {
		System.out.println();

		while (true) {

			try {
				System.out.println("=================");
				System.out.println(" ������ ���� v1.0 > ���� ����");
				System.out.println("=================");

				System.out.println("1. ���� �Է� | 2. ���� ��ü ��� | 3. ���� �˻�");
				System.out.print("����(1~3, 0 exit)?  ");

				int selectNum = 0;
				selectNum = sc.nextInt();
				sc.nextLine();

				if (selectNum == 0) {
					break;
				}

				switch (selectNum) {

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

			} catch (Exception e) {
				sc.nextLine();
				System.out.println("�͢� �߸��� ���� �Դϴ�.");
			}
			System.out.println();
		}

	}

	// ===================================================================================

	// ���� ���� v1.0 > ���� ���� > �����Է�
	private void mainMenu1_sub1(Scanner sc) {
		
		System.out.println();
		System.out.print("���̸�?  ");
		String name = sc.nextLine();
		
		String ssn = "";
		String regExp1 = "\\d{6}-\\d{7}";
		
		while(true) {
			System.out.println();
			System.out.print("���ֹι�ȣ(YYMMDD-NNNNNNN)?  ");
			ssn = sc.nextLine();
			
			if(Pattern.matches(regExp1, ssn) == false) {
				System.out.println();
				System.out.println("================================");
				System.out.println("            *���*");
				System.out.println("�ֹι�ȣ ������ �߸� �Ǿ����ϴ�.");
				System.out.println("================================");
			} else {
				break;
			}
			
		}
		
		// �ùٸ� ��¥���� �˻��ϴ� ���� �߰� 
		String joinDate = "";		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		sf.setLenient(false);
		
		while(true) {
			try {
				System.out.println();
				System.out.print("���Ի���(YYYY-MM-DD)?  ");
				joinDate = sc.nextLine();
				
				Date d = sf.parse(joinDate);
				// �ùٸ� ��¥�� ��� ���� ���
				
				break;
				
			} catch (Exception e1) {
				// Ʋ�� ��¥�� ��� ���� �߻�
				System.out.println();
				System.out.println("================================");
				System.out.println("            *���*");
				System.out.println("  ��¥ ������ �߸� �Ǿ����ϴ�.");
				System.out.println("================================");
			}
			
		}
		
		
		
		String callNum = "";
		String regExp3 = "(02|010)-\\d{3,4}-\\d{4}";
		
		while(true) {
			System.out.println();
			System.out.print("����ȭ��ȣ(000-XXXX-XXXX)?  ");
			callNum = sc.nextLine();
			
			if(Pattern.matches(regExp3, callNum) == false) {
				System.out.println();
				System.out.println("================================");
				System.out.println("            *���*");
				System.out.println("��ȭ��ȣ ������ �߸� �Ǿ����ϴ�.");
				System.out.println("================================");
			} else {
				break;
			}
			
		}

		this.mainMenu2_sub1_sub2();
		String regionId = "";
		
		while(true) {
			System.out.println();
			System.out.print("��������ȣ?  ");
			regionId = sc.nextLine();
			Region tmp = this.dao.regionSearch("region", regionId);
			if(Objects.isNull(tmp)) {
				System.out.println();
				System.out.println("================================");
				System.out.println("            *���*");
				System.out.println("������ȣ ������ �߸� �Ǿ����ϴ�.");
				System.out.println("================================");
			} else {
				break;
			}
		}
		
		this.mainMenu2_sub2_sub2();
		
		String departmentId = "";
		
		while(true) {
			System.out.println();
			System.out.print("���μ���ȣ?  ");
			departmentId = sc.nextLine();
			Department tmp = this.dao.departmentSearch("department", departmentId);
			if(Objects.isNull(tmp)) {
				System.out.println();
				System.out.println("================================");
				System.out.println("            *���*");
				System.out.println("�μ���ȣ ������ �߸� �Ǿ����ϴ�.");
				System.out.println("================================");
			} else {
				break;
			}
		}

		this.mainMenu2_sub3_sub2();
		
		String positionId = "";
		
		Position positionTmp = null;
		
		while(true) {
			
			System.out.println();
			System.out.print("��������ȣ?  ");
			positionId = sc.nextLine();
			
			positionTmp = this.dao.positionSearch("position", positionId);
			
			if(Objects.isNull(positionTmp)) {
				System.out.println();
				System.out.println("================================");
				System.out.println("            *���*");
				System.out.println("������ȣ ������ �߸� �Ǿ����ϴ�.");
				System.out.println("================================");
			} else { 
				break;
			}
		}
		
		int basicPay = 0;
		
		while(true) {
			System.out.println();
			System.out.print("�⺻�� ?  ");
			basicPay = sc.nextInt();
			sc.nextLine();
			
			int minPay = positionTmp.getMinimumPay();
			
			if(basicPay < minPay) {
				System.out.println("================================");
				System.out.println("             *���*");
				System.out.println("���� " + positionTmp.getPositionName() +"�� �ּ� �⺻���� " + minPay + "�Դϴ�.");
				System.out.println("�ٽ� �Է����ּ���!");
				System.out.println("================================");
			} else {
				break;
			}
		}
		
			
		System.out.print("���� ?  ");
		int extraPay = sc.nextInt();
		sc.nextLine();
		
		this.dao.employeeAdd(new Employee(this.dao.autoEmployeeID(), name, ssn, joinDate, callNum
				, regionId, departmentId, positionId, basicPay, extraPay));
		
		System.out.println("�ű� ���� ���� �Է� �Ϸ�!");
		
	
	}

	// ===================================================================================

	// ���� ���� v1.0 > ���� ���� > ���� ��ü ���
	// 1.��� ���� 2.�̸� ���� 3.���� ���� 4.�μ� ���� 5.���� ����
	private void mainMenu1_sub2(Scanner sc) {
		System.out.println();

		while (true) {

			try {
				System.out.println("=================");
				System.out.println(" ������ ���� v1.0 > ���� ���� > ���� ��ü ���");
				System.out.println("=================");

				System.out.println("1.��� ���� | 2.�̸� ���� | 3.���� ���� | 4.�μ� ���� | 5.���� ����");
				System.out.print("����(1~5, 0 exit)?  ");

				int selectNum = 0;
				selectNum = sc.nextInt();
				sc.nextLine();

				if (selectNum == 0) {
					break;
				}

				switch (selectNum) {

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

			} catch (Exception e) {
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
		this.printEmployeeList(employeeList, "employeeId");

	}

	// ���� ���� v1.0 > ���� ���� > ���� ��ü ��� > �̸� ����
	private void mainMenu1_sub2_sub2() {
		// ���� ���� ���� ��� �׼� �׽�Ʈ
		// null ���� ���� �纻 �迭 ��ȯ �޴´�.
		Employee[] employeeList = dao.employeeList();
		// -> �̸� ����
		this.printEmployeeList(employeeList, "employeeName");
	}

	// ���� ���� v1.0 > ���� ���� > ���� ��ü ��� > ���� ����
	private void mainMenu1_sub2_sub3() {
		// -> ���� ����
		Employee[] employeeList = dao.employeeList();
		this.printEmployeeList(employeeList, "region");
	}

	// ���� ���� v1.0 > ���� ���� > ���� ��ü ��� > �μ� ����
	private void mainMenu1_sub2_sub4() {
		// -> �μ� ����
		Employee[] employeeList = dao.employeeList();
		this.printEmployeeList(employeeList, "department");
	}

	// ���� ���� v1.0 > ���� ���� > ���� ��ü ��� > ���� ����
	private void mainMenu1_sub2_sub5() {
		// -> ���� ����
		Employee[] employeeList = dao.employeeList();
		this.printEmployeeList(employeeList, "position");
	}

	// ===================================================================================
	// ���� ���� v1.0 > ���� ���� > ���� �˻�
	// 1.��� ���� 2.�̸� ���� 3.���� ���� 4.�μ� ���� 5.���� ����
	private void mainMenu1_sub3(Scanner sc) {
		System.out.println();

		while (true) {

			try {
				System.out.println("=================");
				System.out.println(" ������ ���� v1.0 > ���� ���� > ���� �˻�");
				System.out.println("=================");

				System.out.println("1.��� ���� | 2.�̸� ���� | 3.���� ���� | 4.�μ� ���� | 5.���� ����");
				System.out.print("����(1~5, 0 exit)?  ");

				int selectNum = 0;
				selectNum = sc.nextInt();
				sc.nextLine();

				if (selectNum == 0) {
					break;
				}

				switch (selectNum) {

				case 1:
					this.mainMenu1_sub3_sub1(sc);
					break;
				case 2:
					this.mainMenu1_sub3_sub2(sc);
					break;
				case 3:
					this.mainMenu1_sub3_sub3(sc);
					break;
				case 4:
					this.mainMenu1_sub3_sub4(sc);
					break;
				case 5:
					this.mainMenu1_sub3_sub5(sc);
					break;
				}

			} catch (Exception e) {
				sc.nextLine();
				System.out.println("�͢� �߸��� ���� �Դϴ�.");
			}
			System.out.println();
		}

	}

	// ���� ���� v1.0 > ���� ���� > ���� �˻� > ��� ����
	private void mainMenu1_sub3_sub1(Scanner sc) {

		// ��� ����
		System.out.print("�˻��Ϸ��� ���?  ");

		String employeeId = "";
		employeeId = sc.nextLine();

		// ����� �ش��ϴ� ������ ���� �˻� ���� -> null �� ���� �纻 �迭
		Employee[] employeeList = this.dao.employeeSearch("employeeId", employeeId);

		// ��� ��� -> ��� �޼ҵ� ȣ��(��� ���� ���� ����)
		this.printEmployeeList(employeeList, "employeeId");

	}

	// ���� ���� v1.0 > ���� ���� > ���� �˻� > �̸� ����
	private void mainMenu1_sub3_sub2(Scanner sc) {

		// �̸� ����
		System.out.print("�˻��Ϸ��� �̸�?  ");

		String employeeName = "";
		employeeName = sc.nextLine();

		// �̸��� �ش��ϴ� ������ ���� �˻� ���� -> null �� ���� �纻 �迭
		Employee[] employeeList = this.dao.employeeSearch("employeeName", employeeName);

		// ��� ��� -> ��� �޼ҵ� ȣ��(��� ���� ���� ����)
		this.printEmployeeList(employeeList, "employeeId");
	}

	// ���� ���� v1.0 > ���� ���� > ���� �˻� > ���� ����
	private void mainMenu1_sub3_sub3(Scanner sc) {
		// ���� ����
		System.out.print("�˻��Ϸ��� ����?  ");

		String region = "";
		region = sc.nextLine();

		// ������ �ش��ϴ� ������ ���� �˻� ���� -> null �� ���� �纻 �迭
		Employee[] employeeList = this.dao.employeeSearch("region", region);

		// ��� ��� -> ��� �޼ҵ� ȣ��(��� ���� ���� ����)
		this.printEmployeeList(employeeList, "employeeId");
	}

	// ���� ���� v1.0 > ���� ���� > ���� �˻� > �μ� ����
	private void mainMenu1_sub3_sub4(Scanner sc) {
		// �̸� ����
		System.out.print("�˻��Ϸ��� �μ�?  ");

		String department = "";
		department = sc.nextLine();

		// �̸��� �ش��ϴ� ������ ���� �˻� ���� -> null �� ���� �纻 �迭
		Employee[] employeeList = this.dao.employeeSearch("department", department);

		// ��� ��� -> ��� �޼ҵ� ȣ��(��� ���� ���� ����)
		this.printEmployeeList(employeeList, "employeeId");
	}

	// ���� ���� v1.0 > ���� ���� > ���� �˻� > ���� ����
	private void mainMenu1_sub3_sub5(Scanner sc) {
		// �̸� ����
		System.out.print("�˻��Ϸ��� ����?  ");

		String position = "";
		position = sc.nextLine();

		// �̸��� �ش��ϴ� ������ ���� �˻� ���� -> null �� ���� �纻 �迭
		Employee[] employeeList = this.dao.employeeSearch("position", position);

		// ��� ��� -> ��� �޼ҵ� ȣ��(��� ���� ���� ����)
		this.printEmployeeList(employeeList, "employeeId");
	}

	// ===================================================================================
	// ���� ���� v1.0 > ���� ���� ����
	// 1. ���� ���� 2. �μ� ���� 3. ���� ����
	public void mainMenu2(Scanner sc) {
		System.out.println();

		while (true) {

			try {
				System.out.println("=================");
				System.out.println(" ������ ���� v1.0 > ���� ���� ����");
				System.out.println("=================");

				System.out.println("1. ���� ���� | 2. �μ� ���� | 3. ���� ����");
				System.out.print("����(1~3, 0 exit)?  ");

				int selectNum = 0;
				selectNum = sc.nextInt();
				sc.nextLine();

				if (selectNum == 0) {
					break;
				}

				switch (selectNum) {

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

			} catch (Exception e) {
				sc.nextLine();
				System.out.println("�͢� �߸��� ���� �Դϴ�.");
			}
			System.out.println();
		}
	}

	// ���� ���� v1.0 > ���� ���� ���� > ���� ����
	// 1. ���� �Է� 2. ���� ���
	private void mainMenu2_sub1(Scanner sc) {
		System.out.println();

		while (true) {

			try {
				System.out.println("=================");
				System.out.println(" ������ ���� v1.0 > ���� ���� ���� > ���� ����");
				System.out.println("=================");

				System.out.println("1. ���� �Է� | 2. ���� ���");
				System.out.print("����(1~2, 0 exit)?  ");

				int selectNum = 0;
				selectNum = sc.nextInt();
				sc.nextLine();

				if (selectNum == 0) {
					break;
				}

				switch (selectNum) {

				case 1:
					this.mainMenu2_sub1_sub1(sc);
					break;
				case 2:
					this.mainMenu2_sub1_sub2();
					break;
				}

			} catch (Exception e) {
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

	// ===================================================================================
	// ���� ���� v1.0 > ���� ���� ���� > �μ� ����
	// 1. �μ� �Է� 2. �μ� ���
	private void mainMenu2_sub2(Scanner sc) {
		System.out.println();

		while (true) {

			try {
				System.out.println("=================");
				System.out.println(" ������ ���� v1.0 > ���� ���� ���� > �μ� ����");
				System.out.println("=================");

				System.out.println("1. �μ� �Է� | 2. �μ� ���");
				System.out.print("����(1~2, 0 exit)?  ");

				int selectNum = 0;
				selectNum = sc.nextInt();
				sc.nextLine();

				if (selectNum == 0) {
					break;
				}

				switch (selectNum) {

				case 1:
					this.mainMenu2_sub2_sub1(sc);
					break;
				case 2:
					this.mainMenu2_sub2_sub2();
					break;
				}

			} catch (Exception e) {
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

	// ===================================================================================
	// ���� ���� v1.0 > ���� ���� ���� > ���� ����
	// 1. ���� �Է� 2. ���� ���
	private void mainMenu2_sub3(Scanner sc) {
		System.out.println();

		while (true) {

			try {
				System.out.println("=================");
				System.out.println(" ������ ���� v1.0 > ���� ���� ���� > ���� ����");
				System.out.println("=================");

				System.out.println("1. ���� �Է� | 2. ���� ���");
				System.out.print("����(1~2, 0 exit)?  ");

				int selectNum = 0;
				selectNum = sc.nextInt();
				sc.nextLine();

				if (selectNum == 0) {
					break;
				}

				switch (selectNum) {

				case 1:
					this.mainMenu2_sub3_sub1(sc);
					break;
				case 2:
					this.mainMenu2_sub3_sub2();
					break;
				}

			} catch (Exception e) {
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
		int minimumPay = sc.nextInt();
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

	// ===================================================================================

	// ���� ���� ��� ���� �޼ҵ� ���� �߰� -> ���ؿ� ���� ���� ��� -> String key
	private void printEmployeeList(Employee[] employeeList, String key) {

		System.out.println();
		System.out.println("********************");
		// null ���� ���� �纻 �迭�̹Ƿ� ũ�⸦ Ȯ���ϸ� ��ü �ο� Ȯ���� �����ϴ�.
		System.out.println("��ü �ο� : " + employeeList.length + "��");
		System.out.println("��� / �̸� / �ֹι�ȣ / �Ի��� / ��ȭ��ȣ / ������ / �μ��� / ������ / �⺻�� / ���� / �޿�");

		if (employeeList.length > 0) {

			// null���� ���� �迭�� ������ ��� ���� ���� �׼� �߰�
			Arrays.sort(employeeList, new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {
					int temp = 0;

					if (key.equals("employeeId")) {
						temp = o1.getemployeeID().compareTo(o2.getemployeeID());
					} else if (key.equals("employeeName")) {
						temp = o1.getEmployeeName().compareTo(o2.getEmployeeName());
					} else if (key.equals("region")) {
						temp = dao.regionSearch("regionId", o1.getRegionID()).getRegionName()
								.compareTo(dao.regionSearch("regionId", o2.getRegionID()).getRegionName());
					} else if (key.equals("department")) {
						temp = dao.departmentSearch("departmentId", o1.getDepartmentID()).getDepartmentName().compareTo(
								dao.departmentSearch("departmentId", o2.getDepartmentID()).getDepartmentName());
					} else if (key.equals("position")) {
						temp = dao.positionSearch("positionId", o1.getPositionID()).getPositionName()
								.compareTo(dao.positionSearch("positionId", o2.getPositionID()).getPositionName());
					}
					return temp;
				}

			});
		} else {
			System.out.println("��� ����� �����ϴ�.");
		}

		for (Employee e : employeeList) {
			System.out.printf("%s / %s / %s / %s / %s / %s / %s / %s / %,d / %,d / %,d%n", e.getemployeeID(),
					e.getEmployeeName(), e.getSsn(), e.getJoinDate(), e.getCallNum(),
					dao.regionSearch("regionId", e.getRegionID()).getRegionName(),
					dao.departmentSearch("departmentId", e.getDepartmentID()).getDepartmentName(),
					dao.positionSearch("positionId", e.getPositionID()).getPositionName(), e.getBasePay(),
					e.getExtraPay(), e.getPay());
		}

	}
}
