// ����r��
import java.util.Scanner;
class CompareString {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�r��s1�G");  String s1 = stdIn.next();
		System.out.print("�r��s2�G");  String s2 = stdIn.next();

		if (s1 == s2)
			System.out.println("s1 == s2�C");
		else
			System.out.println("s1 != s2�C");

		if (s1.equals(s2))
			System.out.println("s1�Ps2�����e�۵��C");
		else
			System.out.println("s1�Ps2�����e���۵��C");
	}
}
