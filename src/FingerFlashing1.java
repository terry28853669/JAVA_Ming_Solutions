import java.util.Scanner;

class FingerFlashing1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("¿ï¾Ü¤â¶Õ(0...°Å¤M/1...¥ÛÀY/2...¥¬)¡G");
		int hand = stdIn.nextInt();
		if (hand == 0)
			System.out.println("°Å¤M");
		else if (hand == 1)
			System.out.println("¥ÛÀY");
		else
			System.out.println("¥¬");
	}
}
