package com.dog;

public class Main {

	public static void main(String[] args) {
		
		
		TrainingDog training = new TrainingDog();
		
		training.state();
		training.barking();
		training.roll();
		training.hand();
		
		// �Ʒ� ��
		training.setDogTraining(TrainingDog.POSTTRAINING);

		training.state();
		training.barking();
		training.roll();
		training.hand();
		
	}

}
