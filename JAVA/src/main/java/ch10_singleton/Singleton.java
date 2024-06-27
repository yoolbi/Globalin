package ch10_singleton;

public class Singleton {
	// ���� ���� ����(�̱��� ��ü�� ���� ����)
	private static Singleton singletonObject;

	// private ������
	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singletonObject == null) {
			singletonObject = new Singleton();
		}
		return singletonObject;
	}

}
