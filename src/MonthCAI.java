// 學習月份的英文單字的程式
import java.util.*;

class MonthCAI {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = {
			"January", "February", "March", "April", "May", "June", "July",
			"August", "September", "October", "November", "December"
		};
		int month = (int) Math.random()*12;	// 對應的月份：0~11的亂數
		System.out.println("問題為" + monthString[month]);

		while (true) {
			System.out.print("這是幾月呢：");
			int m = stdIn.nextInt();

			if (m == month + 1) break;
			System.out.println("答錯了。");
		}
		System.out.println("正確答案。");
		
	}
}
