package com.employee.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

import com.employee.domain.Employee;
import com.employee.domain.Region;
import com.employee.persistance.EmployeeDAO;

public class Test {

	public static void main(String[] args) {
		
		// 저장소 운영 액션에 대한 테스트 코드
		
		// 1. 저장소 운영 클래스에 대한 객체 생성
		EmployeeDAO dao = new EmployeeDAO();

		// 지역 정보 입력 액션 테스트
		String regionID = "REG05";
		String regionName = "제주";
		
		dao.regionAdd(new Region(regionID, regionName));
		
		// 2. 저장소 운영 클래스의 특정 메소드 호출 및 반환값 분석
		// 지역 정보 출력 액션 테스트
		Region[] tmp = dao.regionList();
		for (Region r : tmp) {
			System.out.println(r);
		}
		
		// 지역 정보 검색 액션 테스트
		System.out.println("===================");
		String value = "REG06";
		Region region = dao.regionSearch("regionID", value);
		if(!Objects.isNull(region)) {
			System.out.println(region.getRegionName());
		} else {
			System.out.println("검색결과 없습니다.");
		}
//		System.out.println(Objects.toString(region)); // null or region.toString()
		
		
		// 직원 정보 정렬 출력 액션 테스트
		// null 값이 없는 사본 배열 반환 받는다.
		Employee[] employeeList = dao.employeeList();
		// -> 사번 기준
		// null 값이 없는 사본 배열이므로 크기를 확인하면 전체 인원 확인이 가능하다.
		System.out.println("전체 인원 : " + employeeList.length + "명");
		System.out.println("사번 / 이름 / 주민번호 / 입사일 / 전화번호 / 지역명 / 부서명 / 직위명 / 기본급 / 수당 / 급여");
		
		// null값이 없는 배열을 가지고 사번 기준 정렬 액션 추가
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
