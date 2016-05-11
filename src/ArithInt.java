// 讀入二個整數，並且顯示將其加減乘除後的結果
import java.util.*;

class ArithInt {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("將x與y進行加減乘除計算。");
		System.out.print("x的值："); // 輸入x的值
		int x = stdIn.nextInt(); // 將整數指定給x
		System.out.print("y的值："); // 輸入y的值
		int y = stdIn.nextInt(); // 將整數指定給y
		System.out.println("x + y = " + (x + y)); // 顯示x + y的值
		System.out.println("x - y = " + (x - y)); // 顯示x - y的值��
		System.out.println("x * y = " + (x * y)); // 顯示x * y的值
		System.out.println("x / y = " + (x / y)); // 顯示x / y的值（商）
		System.out.println("x % y = " + (x % y)); // 顯示x % y的值（餘數）
	}
}
