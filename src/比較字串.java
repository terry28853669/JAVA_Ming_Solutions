import java.util.Scanner;

public class 比較字串 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("字串1：");
		String s1 = stdIn.next();
		System.out.print("字串2：");
		String s2 = stdIn.next();
		
		if (s1==s2)
			System.out.println("字串1與字串2的內容相等。");
		else
			System.out.println("字串1與字串2的內容不相等。");
	}
}