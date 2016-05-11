// 瞦计笴栏(瞦0~99)

import java.util.Random;
import java.util.Scanner;

class Kazuate {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int no = rand.nextInt(100);	// 璶瞦计パ0~99睹计玻ネ

		System.out.println("瞦计笴栏秨﹍!!");
		System.out.println("叫瞦0~99计");

		int x;				// 笴栏块计
		do {
			System.out.print("计");
			x = stdIn.nextInt();

			if (x > no)
				System.out.println("翴计");
			else if (x < no)
				System.out.println("翴计");
		} while (x != no);

		System.out.println("タ絋氮");
	}
}
