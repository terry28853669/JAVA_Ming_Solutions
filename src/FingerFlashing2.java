import java.util.Scanner;

class FingerFlashing2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��ܤ��(0...�ŤM/1...���Y/2...��)�G");
		int hand = stdIn.nextInt();
		switch (hand) {
		case 0:
			System.out.println("�ŤM");
			break;
		case 1:
			System.out.println("���Y");
			break;
		case 2:
			System.out.println("��");
			break;
		}
	}
}
