// �ܧ�r�ꪺ�ѷӥؼ�

class ChangeString {

	public static void main(String[] args) {
		String s1 = "ABC";		// �ѷ�"ABC"
		String s2 = "XYZ";		// �ѷ�"XYZ"

		s1 = "XYZ";			// �ѷ�"XYZ"
		System.out.println("�r��s1 = " + s1);
		System.out.println("�r��s2 = " + s2);
		System.out.println("s1�Ps2" +
			((s1 == s2) ? "�ѷ�" : "���O�ѷӡC") + "�P�@�Ӧr��`��");
	}
}
