// �P�_��J����ƭȪ���ơ]�O�_���G��ƥH�W�^�𔻒f
import java.util.Scanner;

class DigitsNo2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��ƭȡG");
		int n = stdIn.nextInt();

		if (n <= -10 || n >= 10)			// �G��ƥH�W
			System.out.println("�ӭȬ��G��ƥH�W�C");
		else					// ����G���
			System.out.println("�ӭȤ���G��ơC");
	}
}
