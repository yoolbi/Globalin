package ch05_06;

public class Ch06Practice {

	public static void main(String[] args) {
		int num = 3;
		// �ǽ�1: �Ű������� ���� �������� ����ϴ� �޼ҵ带 ����� ���ÿ�.
		multiplication(num);
		// �ǽ�2: ������ ���� �޼ҵ��� ������ ��� ���� �����ϴ� �޼ҵ�� ������ ���ÿ�
		int sum = multiplication(num);
		System.out.println(num + "�� ��� ��: " + sum);
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
