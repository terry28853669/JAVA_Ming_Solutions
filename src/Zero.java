// ��J����ƭȬO�_��0
import java.util.Scanner;
class Zero {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��ƭȡG");
		int n = stdIn.nextInt();
		if (!(n != 0))
			System.out.println("�ӭȬ�0�C");
		else
			System.out.println("�ӭȤ���0�C");
	}
}
