// ��ܿ�J������ҹ������u�`
import java.util.Scanner;

class Season {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		do {
			System.out.print("�D���u�`�C\n���Ӥ���G");
			int month = stdIn.nextInt();
			if (month >= 3 && month <= 5) // 3��B4��B5��
				System.out.println("���O�K�u�C");
			else if (month >= 6 && month <= 8) // 6��B7��B8��
				System.out.println("���O�L�u�C");
			else if (month >= 9 && month <= 11) // 9��B10��B11��
				System.out.println("���O��u�C");
			else if (month == 12 || month == 1 || month == 2) // 12��B1��B2��
				System.out.println("���O�V�u�C");

			System.out.print("again? 1.Yes.2.No");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
