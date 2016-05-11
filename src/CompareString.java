// 比較字串
import java.util.Scanner;
class CompareString {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("字串s1：");  String s1 = stdIn.next();
		System.out.print("字串s2：");  String s2 = stdIn.next();

		if (s1 == s2)
			System.out.println("s1 == s2。");
		else
			System.out.println("s1 != s2。");

		if (s1.equals(s2))
			System.out.println("s1與s2的內容相等。");
		else
			System.out.println("s1與s2的內容不相等。");
	}
}
