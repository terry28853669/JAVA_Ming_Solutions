// ���ͤG���}�C�åB�H�üƴO�J�Ҧ�����
import java.util.Scanner;

class Array2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�C�ơG");
		int h = sc.nextInt(); // Ū�J�C��
		System.out.print("��ơG");
		int w = sc.nextInt(); // Ū�J���
		int x[][] = new int[h][w];
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++) {
				x[i][j] = (int) (Math.random() * 99) + 1;
				System.out.println("x[" + i + "][" + j + "] "
						+ "= " + x[i][j]);
			}
	}
}
