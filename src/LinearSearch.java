// 線性搜尋
import java.util.Scanner;
class LinearSearch {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final int n = 12;		// 元素數
		int[] a = new int[n];		// 宣告陣列
		for (int j = 0; j < n; j++)
			a[j] = (int) (Math.random()*10);
		System.out.print("陣列a的所有元素的值\n ");
		for (int j = 0; j < n; j++)
			System.out.print(a[j] + " ");
		System.out.print("\n搜尋的數值：");
		int key = stdIn.nextInt();
		int i;
		for (i = 0; i < n; i++)
			if (a[i] == key)
				break;
		if (i < n)			                // 搜尋成功
			System.out.println("該值存在於a[" + i + "]。");
		else				// 搜尋失敗
			System.out.println("該值不存在。");			
	}
}
