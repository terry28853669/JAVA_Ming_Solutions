// ��ܫ��O�C�޼ƤΦr��}�C

class Test2 {

	static void printStringArray(String[] s) {
		for (int i = 0; i < s.length; i++)
			System.out.println("No." + i + " = " + s[i]);
	}

	public static void main(String[] args) {
		String hands[] = {
			"���Y", "�ŤM", "��"
		};

		System.out.println("���O�C�޼�");
		printStringArray(args);

		System.out.println("�q�����X��");
		printStringArray(hands);
	}
}
