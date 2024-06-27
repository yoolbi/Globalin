package ch10_singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		Singleton instance3 = Singleton.getInstance();

		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance3);

		System.out.println(instance1 == instance2);
		System.out.println(instance1 == instance3);

	}

}
