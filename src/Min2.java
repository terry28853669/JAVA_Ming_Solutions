// 顯示輸入的二個整數值中較小的值（其1：if敘述）

import java.util.Scanner;

class Min2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整數a：");
		int a = stdIn.nextInt();
		System.out.print("整數b：");
		int b = stdIn.nextInt();
		int min, max;
		if (a < b) {
			int temp=a;
			a=b;
			b=temp;
		}

		System.out.println("較大的值為" + a );
		System.out.println("較小的值為" + b );
	}
}
