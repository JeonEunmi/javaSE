package com.test;

// �Ǽ����� ���帶ī (state, behavior)�� ���� ����Ʈ����
// -> BoardMarker Class

public class RedBoardMarker {
	
		//state -> color, ... ->field
		private String color = "Red";

		//behavior -> writing(�Ű�����) -> method
		public void writing(String msg) {
			// �׼��ڵ� 
			System.out.println(color + " : " + msg);
		}
	}

