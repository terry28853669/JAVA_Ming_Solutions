// 猜數字遊戲(猜1~99)
import javax.swing.JOptionPane;

class 猜數字遊戲 {
	public static void main(String[] args) {
		int x;
		int no = (int) (Math.random() * 99) + 1; // 要猜的數字：由1~99的亂數產生
		JOptionPane.showMessageDialog(null, "猜數字遊戲開始!!請猜1~99的數字。");
		/*
		 * 1.遊戲者輸入的數字 2.判斷大小，並輸出提示 3.繼續迴圈
		 */
		do {
			x = Integer
					.valueOf(JOptionPane.showInputDialog("要猜的數字：由1~99的亂數產生"));
			if (x == no) {
				JOptionPane.showMessageDialog(null, "正確答案。");
				break;
			} else if (x > no) {
				JOptionPane.showMessageDialog(null, "再小一點！");
			} else {
				JOptionPane.showMessageDialog(null, "再大一點！");
			}
		} while (x != no);
	}
}