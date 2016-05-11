// 處理字串的程式

import java.util.Scanner;

class Test1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("字串s1：");  String s1 = stdIn.next();
		System.out.print("字串s2：");  String s2 = stdIn.next();

		for (int i = 0; i < s1.length(); i++)
			System.out.println("s1[" + i + "] = " + s1.charAt(i));

		for (int i = 0; i < s2.length(); i++)
			System.out.println("s2[" + i + "] = " + s2.charAt(i));

		int idx = s1.indexOf(s2);
		if (idx == -1)
			System.out.println("s1中不包含s2。");
		else
			System.out.println("s1的第" + (idx + 1) + "的文字起包含s2。");

		if (s1.equals(s2))
			System.out.println("s1與s2的內容相等。");
		else
			System.out.println("s1與s2的內容不相等。");

		for (int i = 1; i <= 4; i++) {
			System.out.printf(String.format("%%%dd\n", i), 5);
		}

		System.out.println("將字串\"123\"轉換為整數值的結果：" +
						Integer.parseInt("123"));
		System.out.println("將字串\"123.45\"轉換為浮動小數點值的結果：" +
						Double.parseDouble("123.45"));
	}
}
