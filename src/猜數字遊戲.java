// �q�Ʀr�C��(�q1~99)
import javax.swing.JOptionPane;

class �q�Ʀr�C�� {
	public static void main(String[] args) {
		int x;
		int no = (int) (Math.random() * 99) + 1; // �n�q���Ʀr�G��1~99���üƲ���
		JOptionPane.showMessageDialog(null, "�q�Ʀr�C���}�l!!�вq1~99���Ʀr�C");
		/*
		 * 1.�C���̿�J���Ʀr 2.�P�_�j�p�A�ÿ�X���� 3.�~��j��
		 */
		do {
			x = Integer
					.valueOf(JOptionPane.showInputDialog("�n�q���Ʀr�G��1~99���üƲ���"));
			if (x == no) {
				JOptionPane.showMessageDialog(null, "���T���סC");
				break;
			} else if (x > no) {
				JOptionPane.showMessageDialog(null, "�A�p�@�I�I");
			} else {
				JOptionPane.showMessageDialog(null, "�A�j�@�I�I");
			}
		} while (x != no);
	}
}