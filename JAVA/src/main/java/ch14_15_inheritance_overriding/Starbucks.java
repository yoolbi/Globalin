package ch14_15_inheritance_overriding;

//�θ�
class Coffee {
	String origin;
	int price;

	Coffee(String origin, int price) {
		this.origin = origin;
		this.price = price;
	}

	void brew() {
		System.out.println("Ŀ�� ������");
	}

	public String toString() {
		return "Ŀ�� ������: " + origin + ", ����: " + price;
	}
}

//�ڽ�
class AmericanoCoffee extends Coffee {
	int count = 0;

	AmericanoCoffee(String origin, int price, int count) {
		super(origin, price);
		this.count = count;
	}

	@Override
	void brew() {
		System.out.println("�Ƹ޸�ī�� �غ���");
	}

	public String toString() {
		return "�Ƹ޸�ī�� ������: " + origin + ", ����: " + price + ", ����: " + count;
	}

}

class ColdbrewCoffee extends Coffee {
	ColdbrewCoffee(String origin, int price) {
		super(origin, price);
	}

	@Override
	void brew() {
		System.out.println("�ݵ��� �غ���");
	}

	public String toString() {
		return "�ݵ��� ������: " + origin + ", ����: " + price;
	}
}

public class Starbucks {

	public static void main(String[] args) {
		Coffee coffee = new Coffee("�ƶ��ī", 3800);
		Coffee americano = new AmericanoCoffee("�ݷҺ��", 5000, 2);
		ColdbrewCoffee coldbrew = new ColdbrewCoffee("��Ƽ���Ǿ�", 4000);

		// ������ (� Ŀ������ Ȯ��)
		if (americano instanceof AmericanoCoffee) {
			americano.brew();
		}

		if (coldbrew instanceof ColdbrewCoffee) {
			coldbrew.brew();
		}

		System.out.println(coffee.toString());
		System.out.println(americano.toString());
		System.out.println(coldbrew.toString());
	}

}
