// 輸入名稱後打招呼（其2：nextLine()版）

import java.util.Scanner;

class HelloNextLine {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("請問大名是：");
		String s = stdIn.nextLine();	// 讀入一整行字串

		System.out.println("您好！" + s + "先生。");	// 顯示
	}
}
