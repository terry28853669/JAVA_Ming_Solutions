// Ū�J�G�Ӿ�ơA�åB��ܱN��[����᪺���G
import java.util.*;

class ArithInt {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�Nx�Py�i��[����p��C");
		System.out.print("x���ȡG"); // ��Jx����
		int x = stdIn.nextInt(); // �N��ƫ��w��x
		System.out.print("y���ȡG"); // ��Jy����
		int y = stdIn.nextInt(); // �N��ƫ��w��y
		System.out.println("x + y = " + (x + y)); // ���x + y����
		System.out.println("x - y = " + (x - y)); // ���x - y���Ȏ�
		System.out.println("x * y = " + (x * y)); // ���x * y����
		System.out.println("x / y = " + (x / y)); // ���x / y���ȡ]�ӡ^
		System.out.println("x % y = " + (x % y)); // ���x % y���ȡ]�l�ơ^
	}
}
