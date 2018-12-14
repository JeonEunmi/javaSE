package com.test;

import java.util.*;

public class Sample081 {

	public static void main(String[] args) {
		
		// 외부(키보드) 입력을 이용한 성적 처리 어플리케이션 작성
		// 1.학생수  2.점수입력  3.점수리스트  4.분석  5.종료
		// 종료 선택 전까지 반복 실행
		 
		boolean run =true;
		int studentNum = 0;
		int[] scores = null;
		boolean flag = false;
		String[] names = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			scanner.nextLine();
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scanner.nextLine();				
				scores = new int [studentNum];
			} else if(selectNo == 2) {
				if(studentNum == 0) {
					System.out.println("학생수를 입력해주세요.");
					continue;
					}
				
				names = new String[studentNum];
				for(int i=0; i<scores.length; ++i) {
					System.out.print("이름 점수 > ");
					String name = scanner.next();
					int tmp = scanner.nextInt();
					scanner.nextLine();
					names[i] = name;
					scores[i] = tmp;
					
					while(scores[i] < 0 || scores[i] >100) {
						System.out.println("잘못된 점수를 입력하셨습니다. 다시 입력해주세요. (점수는 0~100)");
						System.out.print("이름 점수 > ");
						name = scanner.next();
						tmp = scanner.nextInt();
						scanner.nextLine();
						
						names[i] = name;
						scores[i] = tmp;
					}
					flag = true;
				}
				System.out.println("점수 입력이 완료되었습니다.");
	
				
			} else if(selectNo == 3) {
				if(studentNum == 0) {
					System.out.println("학생수를 입력해주세요.");
					continue;
					}
				if(flag == false) {
					System.out.println("점수를 입력해주세요.");
					continue;
				} else if(flag == true){
					for(int i=0; i<scores.length; ++i) {
						System.out.println(names[i] + "의 점수 > " + scores[i]);
							}
				}
				
			} else if(selectNo == 4) {
				if(studentNum == 0) {
					System.out.println("학생수를 입력해주세요.");
					continue;
					}
				if(flag == false) {
					System.out.println("점수를 입력해주세요.");
					continue;
				}
				int max = 0;
				int sum = 0;
				double avr = 0.0;
				
				for(int i=0; i<scores.length; ++i) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				avr = (double)sum / scores.length;
				
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avr);
				

				int[] rank = new int[studentNum];
				
				for(int i =0; i<rank.length; ++i) {
					rank[i] = 1;
				}
				
				for(int i=0; i<rank.length; ++i) {
					for(int j=0; j<rank.length; ++j) {
						if(scores[i] < scores[j]) {
							rank[i]++;
						}
					}
				}
				System.out.println();
				System.out.println("전체 등수");
				for(int i=0; i<studentNum; ++i) {
					System.out.println(names[i] + " : "+ rank[i] + "등");
				}
				
				
			} else if(selectNo == 5) {
				run = false;
			}
			if(0 >= selectNo || selectNo >= 6 ) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); 
			continue;
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}

}
