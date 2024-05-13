package ch05_06;

public class Ch05Practice {

	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		while (i <= 100) {
			count += i;
			i++;
		}
		System.out.println("while: " + count);

		int forCount = 0;
		for (int j = 1; j <= 100; j++) {
			forCount += j;
		}
		System.out.println("for: " + forCount);

		// break를 사용해서 1부터 1씩 증가하는 상황에서
		// 짝수의 합이 30만을 넘어서는 순간을 포착하시오.
		int evenCount = 0;
		int k = 1;
		while (true) {
			if (k % 2 == 0) {
				evenCount += k;
			}
			if (evenCount >= 300000) {
				break;
			}
			k++;
		}
		System.out.println(k);

		// 구구단을 출력하시오.
		for (int m = 2; m < 10; m++) {
			for (int n = 1; n < 10; n++) {
				System.out.println(m + " * " + n + " = " + m * n);
			}
		}

		// 별표를 출력하시오
		for (int o = 1; o < 6; o++) {
			for (int p = 1; p <= o; p++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
