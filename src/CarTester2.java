// �T�����O�i�Ģ����j���ϥνd�ҡ]��G�G���ʦ����ʨT���^

import java.util.Scanner;

class CarTester2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�п�J�T������ơC");
		System.out.print("�W�٬��G");			String name = stdIn.next();
		System.out.print("���e���G");			int width = stdIn.nextInt();
		System.out.print("�������G");			int height = stdIn.nextInt();
		System.out.print("�������G");			int length = stdIn.nextInt();
		System.out.print("�T�o�q�G");	double fuel = stdIn.nextDouble();

		Car myCar = new Car(name, width, length, height, fuel);

		while (true) {
			System.out.println("�{�b��m(" + myCar.getX() + ", " + myCar.getY() +
					")?�Ѿl�U�ơG " + myCar.getFuel());
			System.out.print("�O�_����[0�KNo��1�KYes]�G");
			if (stdIn.nextInt() == 0) break;

			System.out.print("���V�����ʶZ���G");
			double dx = stdIn.nextDouble();
			System.out.print("���V�����ʶZ���G");
			double dy = stdIn.nextDouble();

			if (!myCar.move(dx, dy))
				System.out.println("�U�Ƥ����I");
		}
	}
}
