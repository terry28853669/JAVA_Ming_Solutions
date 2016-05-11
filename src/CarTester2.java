// 汽車類別【第１版】的使用範例（其二：互動式移動汽車）

import java.util.Scanner;

class CarTester2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("請輸入汽車的資料。");
		System.out.print("名稱為：");			String name = stdIn.next();
		System.out.print("車寬為：");			int width = stdIn.nextInt();
		System.out.print("車高為：");			int height = stdIn.nextInt();
		System.out.print("車長為：");			int length = stdIn.nextInt();
		System.out.print("汽油量：");	double fuel = stdIn.nextDouble();

		Car myCar = new Car(name, width, length, height, fuel);

		while (true) {
			System.out.println("現在位置(" + myCar.getX() + ", " + myCar.getY() +
					")?剩餘燃料： " + myCar.getFuel());
			System.out.print("是否移動[0…No／1…Yes]：");
			if (stdIn.nextInt() == 0) break;

			System.out.print("Ｘ方向的移動距離：");
			double dx = stdIn.nextDouble();
			System.out.print("Ｙ方向的移動距離：");
			double dy = stdIn.nextDouble();

			if (!myCar.move(dx, dy))
				System.out.println("燃料不足！");
		}
	}
}
