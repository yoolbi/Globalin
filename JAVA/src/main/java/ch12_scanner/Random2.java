package ch12_scanner;

import java.util.Scanner;

public class Random2 {

	public static void main(String[] args) {
		// ������ ����
		Scanner sc = new Scanner(System.in);
		int answer = (int) (Math.random() * 100) + 1;
		int guess;
		int totalChance = 20;

		for (int i = 1; i < totalChance + 1; i++) {
			System.out.print("��ȸ " + i + ". ���ڸ� �Է��ϼ���: ");
			guess = sc.nextInt();
			if (guess == answer) {
				System.out.println(i + "������ ������ϴ�!");
				break;
			} else {
				System.out.print("Ʋ�Ƚ��ϴ�. ");
				if (guess > answer) {
					System.out.println("�� �۽��ϴ�.");
				} else {
					System.out.println("�� Ů�ϴ�.");
				}
				if (i == totalChance) {
					System.out.println(totalChance + "�� ���� ���߱� ����.");
				}
			}
		}

		System.out.println("����: " + answer);
		sc.close();

	}

}
