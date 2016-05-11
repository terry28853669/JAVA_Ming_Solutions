// 耞块俱计计琌计傪敾抐
import java.util.Scanner;

class DigitsNo2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("俱计");
		int n = stdIn.nextInt();

		if (n <= -10 || n >= 10)			// 计
			System.out.println("赣计");
		else					// ぃ计
			System.out.println("赣ぃ计");
	}
}
