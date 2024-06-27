package ch11_overloading;

class BaskinRobbins {
	private int size; // �� ����
	private String flavor; // �� ����
	private String type; // �� or ��

	// �����θ� �ֹ��Ҷ�
	BaskinRobbins(String flavor) {
		this.type = "��";
		this.flavor = flavor;
		this.size = flavor.split(",").length;
	}

	// ���̶� Ÿ������ �ֹ��� ��
	BaskinRobbins(String type, String flavor) {
		this.flavor = flavor;
		this.type = type;
		this.size = flavor.split(",").length;
	}

	// ��, Ÿ��, ���� �� �����ؼ� �ֹ��� ��
	BaskinRobbins(String type, int size, String flavor) {
		this.type = type;
		this.size = size;
		this.flavor = flavor;
	}

	void order() {
		System.out.println("[�� ����]: " + size + "��, [Ÿ��]: " + type + ", [�� ����]: " + flavor);
	}

	void order(String payment) {
		System.out.println("�������: " + payment);
	}

	void calc() {
		System.out.println("�� �ݾ�: " + 5000 * size);
	}

}

class BaskinRobbinsTester {

	public static void main(String[] args) {
		BaskinRobbins person1 = new BaskinRobbins("���Ʈ");
		BaskinRobbins person2 = new BaskinRobbins("��", "������ �ܰ���, �������� ��Ʈ�κ���, �Ƹ�����");
		BaskinRobbins person3 = new BaskinRobbins("��", 4, "����ġ������ũ, �ٶ��� �Բ� �������, ����� ���� ����, ������Ͻø���");

		person1.order();
		person1.order("ī��");
		person1.calc();

		person2.order();
		person2.calc();

		person3.order();
		person3.calc();

	}

}
