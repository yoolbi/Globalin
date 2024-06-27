package ch12_scanner;

import java.util.Scanner;

public class Random2 {

	public static void main(String[] args) {
		// 스무고개 게임
		Scanner sc = new Scanner(System.in);
		int answer = (int) (Math.random() * 100) + 1;
		int guess;
		int totalChance = 20;

		for (int i = 1; i < totalChance + 1; i++) {
			System.out.print("기회 " + i + ". 숫자를 입력하세요: ");
			guess = sc.nextInt();
			if (guess == answer) {
				System.out.println(i + "번만에 맞췄습니다!");
				break;
			} else {
				System.out.print("틀렸습니다. ");
				if (guess > answer) {
					System.out.println("더 작습니다.");
				} else {
					System.out.println("더 큽니다.");
				}
				if (i == totalChance) {
					System.out.println(totalChance + "번 만에 맞추기 실패.");
				}
			}
		}

		System.out.println("정답: " + answer);
		sc.close();

	}

}
