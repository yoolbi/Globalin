package ch17_interface;

//실습: 현대 자동차는 엔진 연료에 따라 가솔린/전기차로 구분할 수 있다

interface Gasoline {
	void printGasoline();
}

interface Electric {
	void printElectric();
}

interface Engine extends Gasoline, Electric {
	default void printGasoline() {
		System.out.println("가솔린");
	}

	default void printElectric() {
		System.out.println("전기차");
	}
}

abstract class Hyundai {
	public abstract void printHyundai();
}

class Avante extends Hyundai {

	@Override
	public void printHyundai() {
		// TODO Auto-generated method stub

	}

}

class IONIQ extends Hyundai {

	@Override
	public void printHyundai() {
		// TODO Auto-generated method stub

	}

}

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
