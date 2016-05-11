// 字串陣列（讀入並顯示）

import java.util.Scanner;

class ReadStringArray {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("字串個數：");
		int n = stdIn.nextInt();
		String[] sx = new String[n];

		for (int i = 0; i < sx.length; i++) {
			System.out.print("sx[" + i + "] = ");
			sx[i] = stdIn.next();
		}
		for (int i = 0; i < sx.length; i++)
			System.out.println("sx[" + i + "] = \"" + sx[i] + "\"");		
	}
}
