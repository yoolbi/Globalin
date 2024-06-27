package ch05_06;

public class Ch06Practice {

	public static void main(String[] args) {
		int num = 3;
		// 실습1: 매개변수로 받은 구구단을 출력하는 메소드를 만들어 보시오.
		multiplication(num);
		// 실습2: 위에서 만든 메소드의 구구단 결과 합을 리턴하는 메소드로 수정해 보시오
		int sum = multiplication(num);
		System.out.println(num + "단 결과 합: " + sum);
	}

	public static int multiplication(int n) {
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
			sum += n * i;
		}
		return sum;
	}

}
