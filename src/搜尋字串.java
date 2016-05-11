import java.util.Scanner;

public class 搜尋字串 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("字串s1：");
		String s1 = stdIn.next();
		System.out.print("字串s2：");
		String s2 = stdIn.next();
		
		int idx=s1.indexOf(s2);
		if (idx==-1)
			System.out.println("找不到字串！");
		else
			System.out.println("在第"+(idx+1)+"個字元有s2");
	}
}