// 搜尋字串

import java.util.Scanner;

class SearchString {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("字串s1：");
		String s1 = stdIn.next();
		System.out.print("字串s2：");
		String s2 = stdIn.next();

		int idx = s1.indexOf(s2);
		if (idx == -1)
			System.out.println("s1之中不包含s2。");
		else
			System.out.println("從s1的第" + (idx + 1) + "個字元起包含s2。");
	}
}
