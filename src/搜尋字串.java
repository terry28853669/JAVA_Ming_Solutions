import java.util.Scanner;

public class �j�M�r�� {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�r��s1�G");
		String s1 = stdIn.next();
		System.out.print("�r��s2�G");
		String s2 = stdIn.next();
		
		int idx=s1.indexOf(s2);
		if (idx==-1)
			System.out.println("�䤣��r��I");
		else
			System.out.println("�b��"+(idx+1)+"�Ӧr����s2");
	}
}