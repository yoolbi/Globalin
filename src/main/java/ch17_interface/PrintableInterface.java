package ch17_interface;
interface Printable2 {
	public static final double PI = 3.14;

	public void print(String doc);

	void print2(String doc);

	default void func() {

	}

	static void func2() {

	}
}

//인터페이스: 구현. 부모, 자식 관계인 상속 관계에 얽메이지 않고, 공통 기능이 필요 할때
//implements. 하지만 두 인터페이스 사이의 상속은 extends
interface Bluetooth {
	void connect(String doc);
}

//추상 클래스: 여느 클래스들과 마찬가지로 인스턴스 변수와 인스턴스 메소드를 갖지만,
//이를 상속하는 하위 클래스에 의해서 구현되어야 할 메소드가 하나 이상 있는 경우
//extends
abstract class SamsungElec implements Printable2 {
	public abstract void specialFunc();
}

//인터페이스와 추상클래스: Abstract Method를 구현하도록 강제하는 공통점
class Printer2 extends SamsungElec implements Bluetooth {
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}

	@Override
	public void print2(String doc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void connect(String doc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void specialFunc() {
		// TODO Auto-generated method stub

	}
}

class PrintableInterface {
	public static void main(String[] args) {
		Printable2 prn = new Printer2();
		prn.print("Hello Java");
	}
}