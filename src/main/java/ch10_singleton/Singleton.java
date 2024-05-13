package ch10_singleton;

public class Singleton {
	// 정적 참조 변수(싱글톤 객체를 담을 변수)
	private static Singleton singletonObject;

	// private 생성자
	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singletonObject == null) {
			singletonObject = new Singleton();
		}
		return singletonObject;
	}

}
