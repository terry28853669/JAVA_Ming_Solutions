// �u�ʷj�M
import java.util.Scanner;
class LinearSearch {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final int n = 12;		// ������
		int[] a = new int[n];		// �ŧi�}�C
		for (int j = 0; j < n; j++)
			a[j] = (int) (Math.random()*10);
		System.out.print("�}�Ca���Ҧ���������\n ");
		for (int j = 0; j < n; j++)
			System.out.print(a[j] + " ");
		System.out.print("\n�j�M���ƭȡG");
		int key = stdIn.nextInt();
		int i;
		for (i = 0; i < n; i++)
			if (a[i] == key)
				break;
		if (i < n)			                // �j�M���\
			System.out.println("�ӭȦs�b��a[" + i + "]�C");
		else				// �j�M����
			System.out.println("�ӭȤ��s�b�C");			
	}
}
