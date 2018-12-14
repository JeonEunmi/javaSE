package com.test;

public class Sample034 {

	public static void main(String[] args) {

		// 가위(1), 바위(2), 보(3) 게임
		// 가위(1), 바위(2) -> 바위(2) 승리
		// 바위(2), 보(3) -> 보(3) 승리
		// 가위(1), 보(3) -> 가위(1) 승리

		// 무승부, 승, 패

		// 1~3 범위의 정수 난수 획득 (2개)
		int user1 = (int) (Math.random() * 3) + 1;
		int user2 = (int) (Math.random() * 3) + 1;

		// 분석 -> 무승부, 승, 패
		System.out.println("사용자1 : " + user1);
		System.out.println("사용자2 : " + user2);
		
		String result = "";
		
		if (user1 == user2) {
		result = "무승부";
		} else {
			
			if ((user1 % 3) == ((user2 +1) % 3)){
			result = "사용자1 승!";
			} else {
		result = "사용자2 승!";
			}
		}

		/*		
		if (user1 == user2) {
		result = "무승부";
		} else {
			if((user1 == 1 && user2 == 2) || (user1 == 2 && user2 ==3) || (user1 == 3 && user2 ==1)){
		result = "사용자2 승!";
			} else {
		result = "사용자1 승!";
			}
		}
		
	*/
		// 결과 출력
		System.out.println("결과 : " + result);
	}

}
