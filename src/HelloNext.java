// 輸入名稱後打招呼（其1：next()版）

import java.util.Scanner;

class HelloNext {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("請問大名是：");
		String s = stdIn.nextLine(); // 讀入字串��

		System.out.println("您好！" + s + "先生。"); // 顯示
	}
}
