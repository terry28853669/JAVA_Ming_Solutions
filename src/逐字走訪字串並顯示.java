import java.util.Scanner;


public class 逐字走訪字串並顯示 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("請輸入一段文字：");
		String s = stdIn.nextLine();
		for (int i=0;i<s.length();i++)
			System.out.println("S["+i+"]="+s.charAt(i));
}
}