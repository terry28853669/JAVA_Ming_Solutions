// �B�z�r�ꪺ�{��

import java.util.Scanner;

class Test1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�r��s1�G");  String s1 = stdIn.next();
		System.out.print("�r��s2�G");  String s2 = stdIn.next();

		for (int i = 0; i < s1.length(); i++)
			System.out.println("s1[" + i + "] = " + s1.charAt(i));

		for (int i = 0; i < s2.length(); i++)
			System.out.println("s2[" + i + "] = " + s2.charAt(i));

		int idx = s1.indexOf(s2);
		if (idx == -1)
			System.out.println("s1�����]�ts2�C");
		else
			System.out.println("s1����" + (idx + 1) + "����r�_�]�ts2�C");

		if (s1.equals(s2))
			System.out.println("s1�Ps2�����e�۵��C");
		else
			System.out.println("s1�Ps2�����e���۵��C");

		for (int i = 1; i <= 4; i++) {
			System.out.printf(String.format("%%%dd\n", i), 5);
		}

		System.out.println("�N�r��\"123\"�ഫ����ƭȪ����G�G" +
						Integer.parseInt("123"));
		System.out.println("�N�r��\"123.45\"�ഫ���B�ʤp���I�Ȫ����G�G" +
						Double.parseDouble("123.45"));
	}
}
