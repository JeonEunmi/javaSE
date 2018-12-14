package com.dog;

public class TrainingDog extends Dog{

	public static final int PRETRAINING = 0;
	public static final int POSTTRAINING = 1;
	
	private int dogTraining = TrainingDog.PRETRAINING;

	public int getDogTraining() {
		return this.dogTraining;
	}

	public void setDogTraining(int dogTraining) {
		this.dogTraining = dogTraining;
	}

		
	@Override
	public void state() {
		if(this.dogTraining == TrainingDog.POSTTRAINING) {
			System.out.println("훈련 후");
			System.out.println();
		} else {
			super.state();
		}
	}

	@Override
	public void barking() {
		if(this.dogTraining == TrainingDog.POSTTRAINING) {
			System.out.println("주인 : 짖지마");
			System.out.println("강아지 : ...");
		} else {
			super.barking();
		}
	}

	@Override
	public void roll() {
		if(this.dogTraining == TrainingDog.POSTTRAINING) {
			System.out.println("주인 : 굴러!");
			System.out.println("강아지 : (데굴데굴데굴)");
		} else {
			super.roll();			
		}
	}

	@Override
	public void hand() {
		if(this.dogTraining == TrainingDog.POSTTRAINING) {
			System.out.println("주인 : 손!");
			System.out.println("강아지 : (손!)");
		} else {
			super.hand();
		}
	}
	
	
}
