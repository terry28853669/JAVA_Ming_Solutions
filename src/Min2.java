// ��ܿ�J���G�Ӿ�ƭȤ����p���ȡ]��1�Gif�ԭz�^

import java.util.Scanner;

class Min2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���a�G");
		int a = stdIn.nextInt();
		System.out.print("���b�G");
		int b = stdIn.nextInt();
		int min, max;
		if (a < b) {
			int temp=a;
			a=b;
			b=temp;
		}

		System.out.println("���j���Ȭ�" + a );
		System.out.println("���p���Ȭ�" + b );
	}
}
