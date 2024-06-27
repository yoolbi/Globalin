package ch17_interface;

//�ǽ�: ���� �ڵ����� ���� ���ῡ ���� ���ָ�/�������� ������ �� �ִ�

interface Gasoline {
	void printGasoline();
}

interface Electric {
	void printElectric();
}

interface Engine extends Gasoline, Electric {
	default void printGasoline() {
		System.out.println("���ָ�");
	}

	default void printElectric() {
		System.out.println("������");
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
