// �q�Ʀr�C��(�q0~99)

import java.util.Random;
import java.util.Scanner;

class Kazuate {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int no = rand.nextInt(100);	// �n�q���Ʀr�G��0~99���üƲ���

		System.out.println("�q�Ʀr�C���}�l!!");
		System.out.println("�вq0~99���Ʀr�C");

		int x;				// �C���̿�J���Ʀr
		do {
			System.out.print("���ӼƦr�G");
			x = stdIn.nextInt();

			if (x > no)
				System.out.println("��p�@�I���Ʀr�C");
			else if (x < no)
				System.out.println("��j�@�I���Ʀr�C");
		} while (x != no);

		System.out.println("���T���סC");
	}
}
