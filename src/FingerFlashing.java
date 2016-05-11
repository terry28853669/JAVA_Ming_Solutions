// 猜拳

import java.util.Scanner;
import java.util.Random;

class FingerFlashing {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		String[] hands = {"石頭", "剪刀", "布"};
		int retry;						// 再來一次？

		do {
			// 由亂數0, 1, 2來選擇電腦出的拳
			int comp = rand.nextInt(3);

			// 讀入0, 1, 2的值來選擇玩家出的拳
			int user;
			do {
				System.out.print("剪刀石頭布");
				for (int i = 0; i < 3; i++)
					System.out.printf("(%d)%s ", i, hands[i]);
				System.out.print("：");
				user = stdIn.nextInt();
			} while (user < 0 || user > 2);

			// 顯示雙方出的拳
			System.out.println("我出" + hands[comp] + "，你出" + 
							  hands[user] + "。");

			// 判斷
			int judge = (user - comp + 3) % 3;
			switch (judge) {
			 case 0: System.out.println("平手。");		break;
			 case 1: System.out.println("你輸了。");	break;
			 case 2: System.out.println("你贏了。");	break;
			}

			// 是否再玩一次？
			do {
				System.out.print("再來一次？ (0)No (1)Yes：");
				retry = stdIn.nextInt();
			} while (retry != 0 && retry != 1);
		} while (retry == 1);
	}
}