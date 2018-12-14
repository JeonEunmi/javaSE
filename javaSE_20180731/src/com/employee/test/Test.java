package com.employee.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Pattern;

import com.employee.domain.Employee;
import com.employee.domain.Region;
import com.employee.persistance.EmployeeDAO;

public class Test {

	public static void main(String[] args) {
		
/*		// ����ǥ������ �̿��� ��ȭ��ȣ ���� �˻�
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String phone1 = "010-1234-1234";
		String phone2 = "010-1234-12345";
		System.out.println(Pattern.matches(regExp, phone1));  // true
		System.out.println(Pattern.matches(regExp, phone2));  // false
		
		System.out.println("");
		String regExp2 = "\\w+@\\w+.\\w(\\w.\\w+)?";
		String email1 = "test@test.com";
		String email2 = "test@test.co.kr";
		System.out.println(Pattern.matches(regExp2, email1));  //true
		System.out.println(Pattern.matches(regExp2, email2));  //true
		*/
		// �ùٸ� ��¥���� �˻��ϴ� ����
		System.out.println("---------------");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		sf.setLenient(false);
		try {
			Date d = sf.parse("2018-11-31");
			// �ùٸ� ��¥�� ��� ���� ���
			System.out.println(d);
		} catch (Exception e1) {
			// Ʋ�� ��¥�� ��� ���� �߻�
			e1.printStackTrace();
			System.out.println("�����߻�");
		}
		
		
		// ����� � �׼ǿ� ���� �׽�Ʈ �ڵ�
		
		// 1. ����� � Ŭ������ ���� ��ü ����
		EmployeeDAO dao = new EmployeeDAO();

		// ���� ���� �Է� �׼� �׽�Ʈ
		String regionID = "REG05";
		String regionName = "����";
		
		dao.regionAdd(new Region(regionID, regionName));
		
		// 2. ����� � Ŭ������ Ư�� �޼ҵ� ȣ�� �� ��ȯ�� �м�
		// ���� ���� ��� �׼� �׽�Ʈ
		Region[] tmp = dao.regionList();
		for (Region r : tmp) {
			System.out.println(r);
		}
		
		// ���� ���� �˻� �׼� �׽�Ʈ
		System.out.println("===================");
		String value = "REG06";
		Region region = dao.regionSearch("regionID", value);
		if(!Objects.isNull(region)) {
			System.out.println(region.getRegionName());
		} else {
			System.out.println("�˻���� �����ϴ�.");
		}
//		System.out.println(Objects.toString(region)); // null or region.toString()
		
		
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
					, e.getemployeeID(), e.getEmployeeName()
					, e.getSsn(), e.getJoinDate(), e.getCallNum()
					, dao.regionSearch("regionId",e.getRegionID()).getRegionName()
					, dao.departmentSearch("departmentId",e.getDepartmentID()).getDepartmentName()
					, dao.positionSearch("positionId",e.getPositionID()).getPositionID()
					, e.getBasePay(), e.getExtraPay(), e.getPay());
		}
	}
}
