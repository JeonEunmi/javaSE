package com.employee.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

import com.employee.domain.Employee;
import com.employee.domain.Region;
import com.employee.persistance.EmployeeDAO;

public class Test {

	public static void main(String[] args) {
		
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
					, e.getemployeeID(), e.getEmployName()
					, e.getSsn(), e.getJoinDate(), e.getCallNum()
					, dao.regionSearch("regionId",e.getRegionID()).getRegionName()
					, dao.departmentSearch("departmentId",e.getDepartmentID()).getDepartmentName()
					, dao.positionSearch("positionId",e.getPositionID()).getPositionID()
					, e.getBasePay(), e.getExtraPay(), e.getPay());
		}
	}
}
