// �P�_��J����ƭȪ���ơ]0�A�Ӧ�A�G��H�W�^
import java.util.Scanner;

class DigitsNo1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��ƭȡG");
		int n = stdIn.nextInt();
		if (n == 0) // 0
			System.out.println("�ӭȬ�0�C");
		else if (n >= -9 && n <= 9) // �Ӧ��
			System.out.println("�ӭȬ��Ӧ�ơC");
		else
			// �G��ƥH�W
			System.out.println("�ӭȬ��G��ƥH�W�C");
	}
}
