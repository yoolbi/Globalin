package ch07;

public class Oliveyoung {
	static String product = "";
	static int price = 0;
	static int amount = 0;
	static String payment = "";

	public static void main(String[] args) {
		// �ø��꿵 Ŭ������ ���� �Ͻÿ�.
		// ��) -����: ��ǰ��, ����, ����, ���ҹ��
		// -ó��: ��ٱ���, �ٷα���, ��, �����ϱ�

		set("��Ų", 5000, 1, "ī��");
		get();
		cart();
		buy();
		set("�μ�", 10000, 2, "������ü");
		get();
		save();
		gift();
		reset();

	}

	// ��ǰ ����
	public static void set(String selectedProduct, int selectedPrice, int selectedAmount, String selectedPayment) {
		product = selectedProduct;
		price = selectedPrice;
		amount = selectedAmount;
		payment = selectedPayment;
	}

	// ���õ� ��ǰ Ȯ��
	public static void get() {
		System.out.println("���õ� ��ǰ: " + product + ", " + price + "��, " + amount + "��, " + payment);
	}

	// ���õ� ��ǰ �ʱ�ȭ
	public static void reset() {
		product = "";
		price = 0;
		amount = 0;
		payment = "";
		System.out.println("���õ� ��ǰ ����");
	}

	// ��ٱ���
	public static boolean cart() {
		System.out.println(product + "��/�� ��ٱ��Ͽ� ��ҽ��ϴ�");
		return true;
	}

	// �ٷα���
	public static boolean buy() {
		System.out.println(product + "��/�� �����߽��ϴ�");
		return true;
	}

	// ��
	public static boolean save() {
		System.out.println(product + "��/�� ���߽��ϴ�");
		return true;
	}

	// �����ϱ�
	public static boolean gift() {
		System.out.println(product + "��/�� �����߽��ϴ�");
		return true;
	}

}
