// �X�p2�C3�檺�x�}
class Matrix {

	public static void main(String[] args) {
		int a[][] = { {1, 2, 3}, {4, 5, 6} };
		int b[][] = { {6, 3, 4}, {5, 1, 2} };
		int c[][] = { {0, 0, 0}, {0, 0, 0} };
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 3; j++)
				c[i][j] = a[i][j] + b[i][j];
		System.out.println("�x�}a");	// ��ܯx�}a����������
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print( a[i][j]+"\0\0");
			System.out.println();
		}
		System.out.println("�x�}b");	// ��ܯx�}b����������
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(b[i][j]+"  ");
			System.out.println();
		}
		System.out.println("�x�}c");	// ��ܯx�}c����������
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print( c[i][j]+"  ");
			System.out.println();
		}
	}
}
