package ch13_array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6]; // �ζ� ��
		int[] guess = new int[6]; // ����ڰ� �Է��ϴ� ��
		int correct = 0; // ���� ����

		// �ζ� �� ���� ������ �ʱ�ȭ
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			// �ߺ� ����
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		// ����� �Է� �� �ޱ�
		System.out.println("��ȣ 6���� �Է��ϼ���: ");
		for (int i = 0; i < guess.length; i++) {
			int temp = sc.nextInt();
			guess[i] = temp;
			// ����� �Է� ���� �ζ� ���� �����ϴ��� Ȯ��
			if (IntStream.of(lotto).anyMatch(x -> x == temp)) {
				correct++;
			}
		}

		System.out.println("�ζ� ��ȣ: " + Arrays.toString(lotto));
		System.out.println("�� ��ȣ: " + Arrays.toString(guess));
		System.out.println(correct + "�� �¾ҽ��ϴ�!");
		sc.close();
	}

}
