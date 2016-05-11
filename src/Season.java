// 顯示輸入的月份所對應的季節
import java.util.Scanner;

class Season {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		do {
			System.out.print("求取季節。\n哪個月份：");
			int month = stdIn.nextInt();
			if (month >= 3 && month <= 5) // 3月、4月、5月
				System.out.println("那是春季。");
			else if (month >= 6 && month <= 8) // 6月、7月、8月
				System.out.println("那是夏季。");
			else if (month >= 9 && month <= 11) // 9月、10月、11月
				System.out.println("那是秋季。");
			else if (month == 12 || month == 1 || month == 2) // 12月、1月、2月
				System.out.println("那是冬季。");

			System.out.print("again? 1.Yes.2.No");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
