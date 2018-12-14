package com.employee.persistance;

import java.util.Arrays;
import java.util.Objects;

import com.employee.domain.Department;
import com.employee.domain.Employee;
import com.employee.domain.Position;
import com.employee.domain.Region;

// (�迭) �ڷ� ����� � Ŭ����
public class EmployeeDAO {

	// ����� �غ� -> �ڷ��� Ŭ�������� ���� �غ�
	private Employee[] employees = new Employee[10];
	private Department[] departments = new Department[5];
	private Region[] regions = new Region[5];
	private Position[] positions = new Position[5];

	// �迭 �ε��� ����
	private int regionIdx;
	private int departmentIdx;
	private int positionIdx;
	private int employeeIdx;

	// ������ -> �ʱ�ȭ
	public EmployeeDAO() {

		// ����, �μ�, ���� ������ ���� �ʱⰪ �غ�

		// ���� ���� �ʱⰪ
		/*
		 * REG01-���� REG02-��� REG03-�泲 REG04-��� REG05-����
		 */
		this.regions[this.regionIdx] = new Region("REG01", "����");
		++this.regionIdx;
		this.regions[this.regionIdx] = new Region("REG02", "���");
		++this.regionIdx;
		this.regions[this.regionIdx] = new Region("REG03", "����");
		++this.regionIdx;

		// �μ� ���� �ʱⰪ
		/*
		 * DEPT001-���ߺ� DEPT002-��ȹ�� DEPT003-������
		 */
		this.departments[this.departmentIdx] = new Department("DEPT001", "���ߺ�");
		++this.departmentIdx;
		this.departments[this.departmentIdx] = new Department("DEPT002", "��ȹ��");
		++this.departmentIdx;
		this.departments[this.departmentIdx] = new Department("DEPT003", "�ѹ���");
		++this.departmentIdx;
		
		// ���� ���� �ʱⰪ
		/*
		JOB01-����-2000000
		JOB02-�븮-1500000
		JOB03-���-1000000
		*/
		this.positions[this.positionIdx] = new Position("JOB01", "����", 2000000);
		++this.positionIdx;
		this.positions[this.positionIdx] = new Position("JOB02", "�븮", 1500000);
		++this.positionIdx;
		this.positions[this.positionIdx] = new Position("JOB03", "���", 1000000);
		++this.positionIdx;
		
		// ���� ���� �ʱⰪ �غ�
		this.employees[this.employeeIdx] = new Employee("EMP002","ȫ�浿","771212-1022432"
				, "1998-10-11","011-2356-4528", "REG03", "DEPT002","JOB01", 2610000, 200000);
		++this.employeeIdx;
		this.employees[this.employeeIdx] = new Employee("EMP001","�̼���","801007-1544236"
				, "2000-11-29","010-4758-6532", "REG02", "DEPT003","JOB03", 1320000, 200000);
		++this.employeeIdx;
		// -> ������(�μ���, ������)�� �ƴ϶� ������ȣ(�μ���ȣ, ������ȣ)�� �Է��Ѵ�.
		// -> �޿� �׸��� �Է����� �ʴ´�.
	}
	
// ===================================================================================
	
	// ������ȣ �ڵ� ���� �޼ҵ� �߰�
	public String autoRegionID() {
		String regionNum = String.format("REG%02d", this.regionIdx+1);
		return regionNum;
	}


	// ���� ���� �Է�
	public void regionAdd(Region r) {
		// �ܺο��� ���޵� ���� ������ ����ҿ� ����
		// �ε��� ����
		this.regions[this.regionIdx] = r;
		++this.regionIdx;
	}

	// ���� ���� ���
	public Region[] regionList() {
		// ����ҿ� ����� �������� ��ü�� �纻 �迭 ���� ��ȯ
		// null ���� ����
		int count = 0;

		Region[] rTmp = new Region[this.regionIdx];
		for (Region r : this.regions) {
			if (Objects.isNull(r) != true) {
				rTmp[count] = r;
				++count;
			}
		}
		return Arrays.copyOfRange(rTmp, 0, count);
	}

	// ���� ���� �˻� -> ���� ��ȣ ���� -> String key, String value
	public Region regionSearch(String key, String value) {

		// ����ҿ� ����� ���� ���� �߿���
		// Ư�� ������ �����ϴ� �������� ��ȯ
		// null ���� ����
		Region region = null;
		
		for(Region r : this.regions) {
			if(!Objects.isNull(r)) {
				if(r.getRegionID().equals(value)) {
					region = r;
				}
			}
		}
		return region; // �˻��� ���� ���� ��ü or null
	}
	
// =================================================================================

	// �μ���ȣ �ڵ� ���� �޼ҵ� �߰�
	public String autoDepartmentID() {
		String departmentNum = String.format("DEPT%03d", this.departmentIdx+1);
		return departmentNum;
	}
	
	// �μ� ���� �Է�
	public void departmentAdd(Department d) {
		this.departments[this.departmentIdx] = d;
		++this.departmentIdx;
	}

	// �μ� ���� ���
	public Department[] departmentList() {
		int count = 0;

		Department[] dTmp = new Department[this.departmentIdx];
		for (Department d : this.departments) {
			if (Objects.isNull(d) != true) {
				dTmp[count] = d;
				++count;
			}
		}
		return Arrays.copyOfRange(dTmp, 0, count);
	}

	// �μ� ���� �˻� -> �μ� ��ȣ ���� -> String key, String value
	public Department departmentSearch(String key, String value) {
		Department department = null;
		
		for(Department d : this.departments) {
			if(!Objects.isNull(d)) {
				if(d.getDepartmentID().equals(value)) {
					department = d;
				}
			}
		}
		return department; // �˻��� ���� ���� ��ü or null
	}
	
	
// ===============================================================================
	
	// ������ȣ �ڵ� ���� �޼ҵ� �߰�
	public String autoPositionID() {
		String positionNum = String.format("JOB%02d", this.positionIdx+1);
		return positionNum;
	}
	// ���� ���� �Է�
	public void positionAdd(Position p) {
		this.positions[this.positionIdx] = p;
		++this.positionIdx;
	}

	// ���� ���� ���
	public Position[] positionList() {
		int count = 0;

		Position[] pTmp = new Position[this.positionIdx];
		for (Position p : this.positions) {
			if (Objects.isNull(p) != true) {
				pTmp[count] = p;
				++count;
			}
		}
		return Arrays.copyOfRange(pTmp, 0, count);
	}

	// ���� ���� �˻� -> ���� ��ȣ ���� -> String key, String value
	public Position positionSearch(String key, String value) {
		Position position = null;
		
		for(Position p : this.positions) {
			if(!Objects.isNull(p)) {
				if(p.getPositionID().equals(value)) {
					position = p;
				}
			}
		}
		return position; // �˻��� ���� ���� ��ü or null
		
		
	}
	
// ===============================================================================
		
	// ������� �ڵ� ���� �޼ҵ� �߰�
	public String autoEmployeeID() {
		String employeeNum = String.format("EMP%03d", this.employeeIdx+1);
		return employeeNum;
	}
	
	// ���� ���� �Է�
	public void employeeAdd(Employee e) {
		this.employees[this.employeeIdx] = e;
		++this.employeeIdx;
	}

	// ���� ���� ��ü ��� -> ���ؿ� ���� ���� �׼� �߰� -> String key
	// -> null �� ���� �纻 �迭 ��ȯ
	public Employee[] employeeList() {

		Employee[] employees = new Employee[this.employeeIdx];
		int a = 0;
		
		for(Employee e : this.employees) {
			if(!Objects.isNull(e)) {
				employees[a] = e;
				++a;
			}
		}
		return Arrays.copyOfRange(employees, 0, a);
	}

	// ���� ���� �˻� -> ���ؿ� ���� ���� �׼� �߰� -> String key, String value
	public Employee[] employeeSearch(String key, String value) {
		
		Employee[] employees = new Employee[this.employeeIdx];
		int a = 0;
		
		for(Employee p : this.employees) {
			if(!Objects.isNull(p)) {
				String temp = "";
				if(key.equals("employeeId")) {
					temp = p.getemployeeID();
				}
				if(key.equals("employeeName")) {
					temp = p.getEmployeeName();
				}
				if(key.equals("department")) {
					temp = this.departmentSearch("departmentId", p.getDepartmentID()).getDepartmentName();
				}
				if(key.equals("region")) {
					temp = this.regionSearch("regionId", p.getRegionID()).getRegionName();
				}
				if(key.equals("position")) {
					temp = this.positionSearch("positionId", p.getPositionID()).getPositionName();
				}
				if(temp.equals(value)) {
					employees[a] = p;
					++a;
				}
			}
		}
		return Arrays.copyOfRange(employees, 0, a); // �˻��� ���� ���� ��ü or null
	}
}

