// 逐字走訪字串並顯示

import java.util.Scanner;

class ScanString {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("請輸入一段文字：");
		String s = stdIn.next();

		for (int i = 0; i < s.length(); i++)
		        System.out.println("s[" + i + "] = " + s.charAt(i));
	}
}
