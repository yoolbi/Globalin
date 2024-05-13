package ch11_overloading;

class BaskinRobbins {
	private int size; // 맛 개수
	private String flavor; // 맛 종류
	private String type; // 콘 or 컵

	// 맛으로만 주문할때
	BaskinRobbins(String flavor) {
		this.type = "콘";
		this.flavor = flavor;
		this.size = flavor.split(",").length;
	}

	// 맛이랑 타입으로 주문할 때
	BaskinRobbins(String type, String flavor) {
		this.flavor = flavor;
		this.type = type;
		this.size = flavor.split(",").length;
	}

	// 맛, 타입, 개수 다 지정해서 주문할 때
	BaskinRobbins(String type, int size, String flavor) {
		this.type = type;
		this.size = size;
		this.flavor = flavor;
	}

	void order() {
		System.out.println("[맛 개수]: " + size + "개, [타입]: " + type + ", [맛 종류]: " + flavor);
	}

	void order(String payment) {
		System.out.println("결제방법: " + payment);
	}

	void calc() {
		System.out.println("총 금액: " + 5000 * size);
	}

}

class BaskinRobbinsTester {

	public static void main(String[] args) {
		BaskinRobbins person1 = new BaskinRobbins("요거트");
		BaskinRobbins person2 = new BaskinRobbins("컵", "엄마는 외계인, 베리베리 스트로베리, 아몬드봉봉");
		BaskinRobbins person3 = new BaskinRobbins("컵", 4, "뉴욕치즈케이크, 바람과 함께 사라지다, 사랑에 빠진 딸기, 슈퍼펭귄시리얼");

		person1.order();
		person1.order("카드");
		person1.calc();

		person2.order();
		person2.calc();

		person3.order();
		person3.calc();

	}

}
