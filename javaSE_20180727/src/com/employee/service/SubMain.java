package com.employee.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.employee.domain.Department;
import com.employee.domain.Employee;
import com.employee.domain.Position;
import com.employee.domain.Region;
import com.employee.persistance.EmployeeDAO;

// 메인 메뉴별 액션 클래스
public class SubMain {

	// EmployeeDAO 클래스의 객체 생성 및 필드 구성
	private EmployeeDAO dao = new EmployeeDAO();
	
	// 서브 메뉴 운영 메소드
	
	// 직원 관리 v1.0 > 직원 관리
	// 1. 직원 입력  2. 직원 전체 출력  3. 직원 검색
	public void mainMenu1(Scanner sc) {
		System.out.println();
		
		while(true) {
			
			try {
				System.out.println("=================");
				System.out.println(" ★직원 관리 v1.0 > 직원 관리");
				System.out.println("=================");
				
				System.out.println("1. 직원 입력 | 2. 직원 전체 출력 | 3. 직원 검색");
				System.out.print("선택(1~3, 0 exit)?  ");
				
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
				System.out.println("♨♨ 잘못된 접근 입니다.");
			}
			System.out.println();
		}
		
	}
	
	// 직원 관리 v1.0 > 직원 관리 > 직원입력
	private void mainMenu1_sub1(Scanner sc) {
		
		

			
		
	}
	
	// 직원 관리 v1.0 > 직원 관리 > 직원 전체 출력
	// 1.사번 정렬  2.이름 정렬  3.지역 정렬  4.부서 정렬  5.직위 정렬
	private void mainMenu1_sub2(Scanner sc) {
		System.out.println();
		
		while(true) {
			
			try {
				System.out.println("=================");
				System.out.println(" ★직원 관리 v1.0 > 직원 관리 > 직원 전체 출력");
				System.out.println("=================");
				
				System.out.println("1.사번 정렬 | 2.이름 정렬 | 3.지역 정렬 | 4.부서 정렬 | 5.직위 정렬");
				System.out.print("선택(1~5, 0 exit)?  ");
				
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
				System.out.println("♨♨ 잘못된 접근 입니다.");
			}
			System.out.println();
		}
		
	}
	// 직원 관리 v1.0 > 직원 관리 > 직원 전체 출력 > 사번 정렬
	private void mainMenu1_sub2_sub1() {

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
	
	// 직원 관리 v1.0 > 직원 관리 > 직원 전체 출력 > 이름 정렬
	private void mainMenu1_sub2_sub2() {
		
	}
	
	// 직원 관리 v1.0 > 직원 관리 > 직원 전체 출력 > 지역 정렬
	private void mainMenu1_sub2_sub3() {
		
	}
	
	// 직원 관리 v1.0 > 직원 관리 > 직원 전체 출력 > 부서 정렬
	private void mainMenu1_sub2_sub4() {
		
	}
	// 직원 관리 v1.0 > 직원 관리 > 직원 전체 출력 > 직위 정렬
	private void mainMenu1_sub2_sub5() {
		
	}

	// 직원 관리 v1.0 > 직원 관리 > 직원 검색
	// 1.사번 정렬  2.이름 정렬  3.지역 정렬  4.부서 정렬  5.직위 정렬	
	private void mainMenu1_sub3(Scanner sc) {
		
	}
	
	// 직원 관리 v1.0 > 직원 관리 > 직원 검색 > 사번 정렬
	private void mainMenu1_sub3_sub1() {
		
	}
	
	// 직원 관리 v1.0 > 직원 관리 > 직원 검색 > 이름 정렬
	private void mainMenu1_sub3_sub2() {
		
	}
	
	// 직원 관리 v1.0 > 직원 관리 > 직원 검색 > 지역 정렬
	private void mainMenu1_sub3_sub3() {
		
	}
	
	// 직원 관리 v1.0 > 직원 관리 > 직원 검색 > 부서 정렬
	private void mainMenu1_sub3_sub4() {
		
	}
	
	// 직원 관리 v1.0 > 직원 관리 > 직원 검색 > 직위 정렬
	private void mainMenu1_sub3_sub5() {
		
	}
	
	// 직원 관리 v1.0 > 기초 정보 관리
	// 1. 지역 관리  2. 부서 관리  3. 직위 관리
	public void mainMenu2(Scanner sc) {
		System.out.println();
		
		while(true) {
			
			try {
				System.out.println("=================");
				System.out.println(" ★직원 관리 v1.0 > 기초 정보 관리");
				System.out.println("=================");
				
				System.out.println("1. 지역 관리 | 2. 부서 관리 | 3. 직위 관리");
				System.out.print("선택(1~3, 0 exit)?  ");
				
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
				System.out.println("♨♨ 잘못된 접근 입니다.");
			}
			System.out.println();
		}
	}
	
	// 직원 관리 v1.0 > 기초 정보 관리 > 지역 관리
	// 1. 지역 입력  2. 지역 출력
	private void mainMenu2_sub1(Scanner sc) {
		System.out.println();
		
		while(true) {
			
			try {
				System.out.println("=================");
				System.out.println(" ★직원 관리 v1.0 > 기초 정보 관리 > 지역 관리");
				System.out.println("=================");
				
				System.out.println("1. 지역 입력 | 2. 지역 출력");
				System.out.print("선택(1~2, 0 exit)?  ");
				
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
				System.out.println("♨♨ 잘못된 접근 입니다.");
			}
			System.out.println();
		}
	}
	
	// 직원 관리 v1.0 > 기초 정보 관리 > 지역 관리 > 지역 입력
	private void mainMenu2_sub1_sub1(Scanner sc) {
		
		// 기존 지역번호 / 지역명 출력
		this.mainMenu2_sub1_sub2();
		// 콘솔 입력을 통한 외부 입력
		// -> 신규 지역명
		System.out.print("신규 지역 이름?  ");
		String regionName = sc.nextLine();
		
		// 신규 지역을 저장소에 등록하는 메소드 호출
		this.dao.regionAdd(new Region(this.dao.autoRegionID(), regionName));
		
		System.out.println("신규 지역 정보 입력 완료!");
		System.out.println();

	}

	// 직원 관리 v1.0 > 기초 정보 관리 > 지역 관리 > 지역 출력
	private void mainMenu2_sub1_sub2() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("지역번호 지역이름");
		Region[] tmp = dao.regionList();
		for (Region r : tmp) {
			System.out.println(r);
		}
		System.out.println("--------------------");
		System.out.println();
		
	}
	
	// 직원 관리 v1.0 > 기초 정보 관리 > 부서 관리
	// 1. 부서 입력  2. 부서 출력
	private void mainMenu2_sub2(Scanner sc) {
		System.out.println();
		
		while(true) {
			
			try {
				System.out.println("=================");
				System.out.println(" ★직원 관리 v1.0 > 기초 정보 관리 > 부서 관리");
				System.out.println("=================");
				
				System.out.println("1. 부서 입력 | 2. 부서 출력");
				System.out.print("선택(1~2, 0 exit)?  ");
				
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
				System.out.println("♨♨ 잘못된 접근 입니다.");
			}
			System.out.println();
		}
	}
	
	// 직원 관리 v1.0 > 기초 정보 관리 > 부서 관리 > 부서 입력
	private void mainMenu2_sub2_sub1(Scanner sc) {
		
		// 기존 부서번호 / 부서명 출력
		this.mainMenu2_sub2_sub2();
		// 콘솔 입력을 통한 외부 입력
		// -> 신규 부서명
		System.out.print("신규 부서 이름?  ");
		String departmentName = sc.nextLine();
		
		// 신규 부서를 저장소에 등록하는 메소드 호출
		this.dao.departmentAdd(new Department(this.dao.autoDepartmentID(), departmentName));
		
		System.out.println("신규 부서 정보 입력 완료!");
		System.out.println();
		
	}

	// 직원 관리 v1.0 > 기초 정보 관리 > 부서 관리 > 부서 출력
	private void mainMenu2_sub2_sub2() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("부서번호 부서명");
		Department[] tmp = dao.departmentList();
		for (Department d : tmp) {
			System.out.println(d);
		}
		System.out.println("--------------------");
		System.out.println();
	}
	
	// 직원 관리 v1.0 > 기초 정보 관리 > 직위 관리
	// 1. 직위 입력  2. 직위 출력
	private void mainMenu2_sub3(Scanner sc) {
		System.out.println();
		
		while(true) {
			
			try {
				System.out.println("=================");
				System.out.println(" ★직원 관리 v1.0 > 기초 정보 관리 > 직위 관리");
				System.out.println("=================");
				
				System.out.println("1. 직위 입력 | 2. 직위 출력");
				System.out.print("선택(1~2, 0 exit)?  ");
				
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
				System.out.println("♨♨ 잘못된 접근 입니다.");
			}
			System.out.println();
		}
	}
	
	// 직원 관리 v1.0 > 기초 정보 관리 > 직위 관리 > 직위 입력
	private void mainMenu2_sub3_sub1(Scanner sc) {
		// 기존 직위번호 / 직위명 / 최소 기본급 출력
		this.mainMenu2_sub3_sub2();
		// 콘솔 입력을 통한 외부 입력
		// -> 신규 지역명
		System.out.print("신규 직위명 ?  ");
		String positionName = sc.nextLine();
		
		System.out.print("최소 기본급 ?  ");
		int minimumPay  = sc.nextInt();
		sc.nextLine();
		
		
		// 신규 지역을 저장소에 등록하는 메소드 호출
		this.dao.positionAdd(new Position(this.dao.autoPositionID(), positionName, minimumPay));
		
		System.out.println("신규 직위 정보 입력 완료!");
		System.out.println();
	}

	// 직원 관리 v1.0 > 기초 정보 관리 > 직위 관리 > 직위 출력
	private void mainMenu2_sub3_sub2() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("직위번호 직위명 최소기본급");
		Position[] tmp = dao.positionList();
		for (Position p : tmp) {
			System.out.println(p);
		}
		System.out.println("--------------------");
		System.out.println();
	}
	
	// 직원 정보 출력 전용 메소드 구성 추가 -> 기준에 따른 정렬 출력 -> String key
	public void Print() {
		

	}
}
