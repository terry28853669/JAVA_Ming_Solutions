import java.util.Scanner;


public class �v�r���X�r������ {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�п�J�@�q��r�G");
		String s = stdIn.nextLine();
		for (int i=0;i<s.length();i++)
			System.out.println("S["+i+"]="+s.charAt(i));
}
}