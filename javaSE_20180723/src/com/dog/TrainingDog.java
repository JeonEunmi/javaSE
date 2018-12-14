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
			System.out.println("�Ʒ� ��");
			System.out.println();
		} else {
			super.state();
		}
	}

	@Override
	public void barking() {
		if(this.dogTraining == TrainingDog.POSTTRAINING) {
			System.out.println("���� : ¢����");
			System.out.println("������ : ...");
		} else {
			super.barking();
		}
	}

	@Override
	public void roll() {
		if(this.dogTraining == TrainingDog.POSTTRAINING) {
			System.out.println("���� : ����!");
			System.out.println("������ : (������������)");
		} else {
			super.roll();			
		}
	}

	@Override
	public void hand() {
		if(this.dogTraining == TrainingDog.POSTTRAINING) {
			System.out.println("���� : ��!");
			System.out.println("������ : (��!)");
		} else {
			super.hand();
		}
	}
	
	
}
