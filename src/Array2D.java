// 玻ネ蝴皚睹计碠┮Τじ
import java.util.Scanner;

class Array2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("计");
		int h = sc.nextInt(); // 弄计
		System.out.print("︽计");
		int w = sc.nextInt(); // 弄︽计
		int x[][] = new int[h][w];
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++) {
				x[i][j] = (int) (Math.random() * 99) + 1;
				System.out.println("x[" + i + "][" + j + "] "
						+ "= " + x[i][j]);
			}
	}
}
