// �ǲߤ�����^���r���{��
import java.util.*;

class MonthCAI {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = {
			"January", "February", "March", "April", "May", "June", "July",
			"August", "September", "October", "November", "December"
		};
		int month = (int) Math.random()*12;	// ����������G0~11���ü�
		System.out.println("���D��" + monthString[month]);

		while (true) {
			System.out.print("�o�O�X��O�G");
			int m = stdIn.nextInt();

			if (m == month + 1) break;
			System.out.println("�����F�C");
		}
		System.out.println("���T���סC");
		
	}
}
