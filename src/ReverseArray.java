// 將陣列元素的順序逆向重整並顯示
import java.util.*;
class ReverseArray {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("元素數：");
		int n = stdIn.nextInt();                // 輸入元素數
		int[] a = new int[n];	                // 宣告陣列
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
		System.out.println("\n將元素的排列順序逆轉。");
		for (int i = 0; i < n; i++)
			System.out.print(a[i]+",");
	}
}
