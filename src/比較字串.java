import java.util.Scanner;

public class ����r�� {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�r��1�G");
		String s1 = stdIn.next();
		System.out.print("�r��2�G");
		String s2 = stdIn.next();
		
		if (s1==s2)
			System.out.println("�r��1�P�r��2�����e�۵��C");
		else
			System.out.println("�r��1�P�r��2�����e���۵��C");
	}
}