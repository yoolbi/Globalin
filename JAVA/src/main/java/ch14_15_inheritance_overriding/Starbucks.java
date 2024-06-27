package ch14_15_inheritance_overriding;

//부모
class Coffee {
	String origin;
	int price;

	Coffee(String origin, int price) {
		this.origin = origin;
		this.price = price;
	}

	void brew() {
		System.out.println("커피 추출중");
	}

	public String toString() {
		return "커피 원산지: " + origin + ", 가격: " + price;
	}
}

//자식
class AmericanoCoffee extends Coffee {
	int count = 0;

	AmericanoCoffee(String origin, int price, int count) {
		super(origin, price);
		this.count = count;
	}

	@Override
	void brew() {
		System.out.println("아메리카노 준비중");
	}

	public String toString() {
		return "아메리카노 원산지: " + origin + ", 가격: " + price + ", 수량: " + count;
	}

}

class ColdbrewCoffee extends Coffee {
	ColdbrewCoffee(String origin, int price) {
		super(origin, price);
	}

	@Override
	void brew() {
		System.out.println("콜드브루 준비중");
	}

	public String toString() {
		return "콜드브루 원산지: " + origin + ", 가격: " + price;
	}
}

public class Starbucks {

	public static void main(String[] args) {
		Coffee coffee = new Coffee("아라비카", 3800);
		Coffee americano = new AmericanoCoffee("콜롬비아", 5000, 2);
		ColdbrewCoffee coldbrew = new ColdbrewCoffee("에티오피아", 4000);

		// 다형성 (어떤 커피인지 확인)
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
