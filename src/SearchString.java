// �j�M�r��

import java.util.Scanner;

class SearchString {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�r��s1�G");
		String s1 = stdIn.next();
		System.out.print("�r��s2�G");
		String s2 = stdIn.next();

		int idx = s1.indexOf(s2);
		if (idx == -1)
			System.out.println("s1�������]�ts2�C");
		else
			System.out.println("�qs1����" + (idx + 1) + "�Ӧr���_�]�ts2�C");
	}
}
