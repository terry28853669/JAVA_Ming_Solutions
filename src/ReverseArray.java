// �N�}�C���������ǰf�V��������
import java.util.*;
class ReverseArray {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�����ơG");
		int n = stdIn.nextInt();                // ��J������
		int[] a = new int[n];	                // �ŧi�}�C
		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random()*89)+10;
			System.out.print(a[i]+",");
		}
		Arrays.sort(a);// 
		for (int i = 0; i < n / 2; i++) {
			int t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}
		System.out.println("\n�N�������ƦC���ǰf��C");
		for (int i = 0; i < n; i++)
			System.out.print(a[i]+",");
	}
}
