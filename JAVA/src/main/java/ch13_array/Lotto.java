package ch13_array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6]; // 로또 값
		int[] guess = new int[6]; // 사용자가 입력하는 값
		int correct = 0; // 맞춘 개수

		// 로또 값 랜덤 정수로 초기화
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			// 중복 제거
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		// 사용자 입력 값 받기
		System.out.println("번호 6개를 입력하세요: ");
		for (int i = 0; i < guess.length; i++) {
			int temp = sc.nextInt();
			guess[i] = temp;
			// 사용자 입력 값이 로또 값에 포함하는지 확인
			if (IntStream.of(lotto).anyMatch(x -> x == temp)) {
				correct++;
			}
		}

		System.out.println("로또 번호: " + Arrays.toString(lotto));
		System.out.println("내 번호: " + Arrays.toString(guess));
		System.out.println(correct + "개 맞았습니다!");
		sc.close();
	}

}
