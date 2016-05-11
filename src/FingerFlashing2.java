import java.util.Scanner;

class FingerFlashing2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("¿ï¾Ü¤â¶Õ(0...°Å¤M/1...¥ÛÀY/2...¥¬)¡G");
		int hand = stdIn.nextInt();
		switch (hand) {
		case 0:
			System.out.println("°Å¤M");
			break;
		case 1:
			System.out.println("¥ÛÀY");
			break;
		case 2:
			System.out.println("¥¬");
			break;
		}
	}
}
