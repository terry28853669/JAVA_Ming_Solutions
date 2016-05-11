// 讀入分數並且顯示總分、平均

import java.util.Scanner;

class PointSumAve {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int sum = 0;		// 總分
		System.out.println("輸入5位學生的分數吧。");

		System.out.print("1號的分數：");
		int yamane = stdIn.nextInt();
		sum += yamane;

		System.out.print("2號的分數：");
		int takada = stdIn.nextInt();
		sum += takada;

		System.out.print("3號的分數：");
		int kawachi = stdIn.nextInt();
		sum += kawachi;

		System.out.print("4號的分數：");
		int koga = stdIn.nextInt();
		sum += koga;

		System.out.print("5號的分數：");
		int tozuka = stdIn.nextInt();
		sum += tozuka;

		System.out.println("總分為" + sum + "分。");
		System.out.println("平均為" + (double)sum / 5 + "分。");
	}
}
