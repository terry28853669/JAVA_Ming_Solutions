import java.util.Scanner;

class FingerFlashing1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��ܤ��(0...�ŤM/1...���Y/2...��)�G");
		int hand = stdIn.nextInt();
		if (hand == 0)
			System.out.println("�ŤM");
		else if (hand == 1)
			System.out.println("���Y");
		else
			System.out.println("��");
	}
}
