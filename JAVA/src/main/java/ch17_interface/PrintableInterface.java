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

//�������̽�: ����. �θ�, �ڽ� ������ ��� ���迡 �������� �ʰ�, ���� ����� �ʿ� �Ҷ�
//implements. ������ �� �������̽� ������ ����� extends
interface Bluetooth {
	void connect(String doc);
}

//�߻� Ŭ����: ���� Ŭ������� ���������� �ν��Ͻ� ������ �ν��Ͻ� �޼ҵ带 ������,
//�̸� ����ϴ� ���� Ŭ������ ���ؼ� �����Ǿ�� �� �޼ҵ尡 �ϳ� �̻� �ִ� ���
//extends
abstract class SamsungElec implements Printable2 {
	public abstract void specialFunc();
}

//�������̽��� �߻�Ŭ����: Abstract Method�� �����ϵ��� �����ϴ� ������
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