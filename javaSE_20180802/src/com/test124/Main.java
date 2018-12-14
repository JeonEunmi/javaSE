package com.test124;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// 로또 번호 (1~45) 추출 및 출력
		// -> 1~45 범위의 숫자를 중복되지 않게 6개 추출
		// -> set 컬렉션 사용
	
		// 빈 컬렉션 생성
		Set<Integer> set = new HashSet<Integer>();
		
		Random random = new Random();
		
		while(true) {
			// 1~45 범위의 정수 난수 발생
			int temp = random.nextInt(45) + 1;
			
			// 특정 숫자가 이미 존재하는 숫자인지 검사
			// -> Set 저장소에 저장하면 자동 분석
			set.add(temp);
			
			if(set.size() == 6) {
				break;
			}
		}
		
		// Set 컬렉션 엘리먼트 전체 출력
		System.out.println(set.toString());
		
		// 정렬 추가 -> List 컬렉션으로 변환 후 정렬 가능
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println(list.toString());
	}

}
