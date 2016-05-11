// 輸入的整數值是否為0
import java.util.Scanner;
class Zero {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整數值：");
		int n = stdIn.nextInt();
		if (!(n != 0))
			System.out.println("該值為0。");
		else
			System.out.println("該值不為0。");
	}
}
