// Ū�J���ƨåB����`���B����

import java.util.Scanner;

class PointSumAve {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int sum = 0;		// �`��
		System.out.println("��J5��ǥͪ����Ƨa�C");

		System.out.print("1�������ơG");
		int yamane = stdIn.nextInt();
		sum += yamane;

		System.out.print("2�������ơG");
		int takada = stdIn.nextInt();
		sum += takada;

		System.out.print("3�������ơG");
		int kawachi = stdIn.nextInt();
		sum += kawachi;

		System.out.print("4�������ơG");
		int koga = stdIn.nextInt();
		sum += koga;

		System.out.print("5�������ơG");
		int tozuka = stdIn.nextInt();
		sum += tozuka;

		System.out.println("�`����" + sum + "���C");
		System.out.println("������" + (double)sum / 5 + "���C");
	}
}
