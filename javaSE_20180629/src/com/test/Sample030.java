package com.test;

public class Sample030 {

	public static void main(String[] args) {
		
		// ��ø if��
		/*
		if(Boolean_expression 1) {
			// Executes when the Boolean expression 1 is true
			if(Boolean_expression 2) {
      			// Executes when the Boolean expression 1, expression 2 is true
   			}
		} else {
			   //Executes when the Boolean expression 1 is false
			   if(Boolean_expression 3) {
      			// Executes when the Boolean expression 1 is false, expression 3 is true
        	}
   		  }
		 */
		
		 //���1 (��øif��)
		 int x = 30;
	      int y = 10;

	      if( x == 30 ) {
	         if( y == 10 ) {
	            System.out.println("X = 30 and Y = 10");
	         }
	      }
	      
	     //���2 (if�� + and��)
		  if( x == 30 && y == 10) {
	            System.out.println("X = 30 and Y = 10");
	}

		  
		 //�ٸ����� 
		  
			int score = 94;
			
			if(score>=90) {
				if(score>=95) {
					System.out.println("A+����Դϴ�.");
				}else {
					System.out.println("A����Դϴ�.");
				}
			}
}
}
