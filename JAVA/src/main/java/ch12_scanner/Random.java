package ch12_scanner;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// 스무고개 게임
		Scanner sc = new Scanner(System.in);
		int answer = (int) (Math.random() * 100) + 1;
		int guess;
		int chanceCount = 1;
		int totalChance = 20;

		for (int i = 0; i < totalChance; i++) {
			System.out.print("기회 " + chanceCount + ". 숫자를 입력하세요: ");
			guess = sc.nextInt();
			if (guess == answer) {
				System.out.println(chanceCount + "번만에 맞췄습니다!");
				break;
			} else {
				System.out.println("틀렸습니다.");
				chanceCount++;
			}
		}

		if (chanceCount == totalChance + 1) {
			System.out.println(totalChance + "번 만에 맞추기 실패.");

		}

		System.out.println("정답: " + answer);
		sc.close();
	}

}
