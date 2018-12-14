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
		
/*		// 정규표현식을 이용한 전화번호 형식 검사
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
		// 올바른 날짜인지 검사하는 과정
		System.out.println("---------------");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		sf.setLenient(false);
		try {
			Date d = sf.parse("2018-11-31");
			// 올바른 날짜인 경우 정상 출력
			System.out.println(d);
		} catch (Exception e1) {
			// 틀린 날짜인 경우 예외 발생
			e1.printStackTrace();
			System.out.println("오류발생");
		}
		
		
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
					, e.getemployeeID(), e.getEmployeeName()
					, e.getSsn(), e.getJoinDate(), e.getCallNum()
					, dao.regionSearch("regionId",e.getRegionID()).getRegionName()
					, dao.departmentSearch("departmentId",e.getDepartmentID()).getDepartmentName()
					, dao.positionSearch("positionId",e.getPositionID()).getPositionID()
					, e.getBasePay(), e.getExtraPay(), e.getPay());
		}
	}
}
