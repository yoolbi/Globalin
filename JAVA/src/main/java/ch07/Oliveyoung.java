package ch07;

public class Oliveyoung {
	static String product = "";
	static int price = 0;
	static int amount = 0;
	static String payment = "";

	public static void main(String[] args) {
		// 올리브영 클래스를 설계 하시오.
		// 예) -정보: 상품명, 가격, 수량, 지불방법
		// -처리: 장바구니, 바로구매, 찜, 선물하기

		set("스킨", 5000, 1, "카드");
		get();
		cart();
		buy();
		set("로션", 10000, 2, "계좌이체");
		get();
		save();
		gift();
		reset();

	}

	// 상품 선택
	public static void set(String selectedProduct, int selectedPrice, int selectedAmount, String selectedPayment) {
		product = selectedProduct;
		price = selectedPrice;
		amount = selectedAmount;
		payment = selectedPayment;
	}

	// 선택된 상품 확인
	public static void get() {
		System.out.println("선택된 상품: " + product + ", " + price + "원, " + amount + "개, " + payment);
	}

	// 선택된 상품 초기화
	public static void reset() {
		product = "";
		price = 0;
		amount = 0;
		payment = "";
		System.out.println("선택된 상품 없음");
	}

	// 장바구니
	public static boolean cart() {
		System.out.println(product + "을/를 장바구니에 담았습니다");
		return true;
	}

	// 바로구매
	public static boolean buy() {
		System.out.println(product + "을/를 구매했습니다");
		return true;
	}

	// 찜
	public static boolean save() {
		System.out.println(product + "을/를 찜했습니다");
		return true;
	}

	// 선물하기
	public static boolean gift() {
		System.out.println(product + "을/를 선물했습니다");
		return true;
	}

}
