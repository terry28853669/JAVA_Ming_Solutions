// �q��

import java.util.Scanner;
import java.util.Random;

class FingerFlashing {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		String[] hands = {"���Y", "�ŤM", "��"};
		int retry;						// �A�Ӥ@���H

		do {
			// �Ѷü�0, 1, 2�ӿ�ܹq���X����
			int comp = rand.nextInt(3);

			// Ū�J0, 1, 2���Ȩӿ�ܪ��a�X����
			int user;
			do {
				System.out.print("�ŤM���Y��");
				for (int i = 0; i < 3; i++)
					System.out.printf("(%d)%s ", i, hands[i]);
				System.out.print("�G");
				user = stdIn.nextInt();
			} while (user < 0 || user > 2);

			// �������X����
			System.out.println("�ڥX" + hands[comp] + "�A�A�X" + 
							  hands[user] + "�C");

			// �P�_
			int judge = (user - comp + 3) % 3;
			switch (judge) {
			 case 0: System.out.println("����C");		break;
			 case 1: System.out.println("�A��F�C");	break;
			 case 2: System.out.println("�AĹ�F�C");	break;
			}

			// �O�_�A���@���H
			do {
				System.out.print("�A�Ӥ@���H (0)No (1)Yes�G");
				retry = stdIn.nextInt();
			} while (retry != 0 && retry != 1);
		} while (retry == 1);
	}
}