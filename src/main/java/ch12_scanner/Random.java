package ch12_scanner;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// ������ ����
		Scanner sc = new Scanner(System.in);
		int answer = (int) (Math.random() * 100) + 1;
		int guess;
		int chanceCount = 1;
		int totalChance = 20;

		for (int i = 0; i < totalChance; i++) {
			System.out.print("��ȸ " + chanceCount + ". ���ڸ� �Է��ϼ���: ");
			guess = sc.nextInt();
			if (guess == answer) {
				System.out.println(chanceCount + "������ ������ϴ�!");
				break;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				chanceCount++;
			}
		}

		if (chanceCount == totalChance + 1) {
			System.out.println(totalChance + "�� ���� ���߱� ����.");

		}

		System.out.println("����: " + answer);
		sc.close();
	}

}
