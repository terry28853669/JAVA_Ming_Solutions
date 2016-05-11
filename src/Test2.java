// 顯示指令列引數及字串陣列

class Test2 {

	static void printStringArray(String[] s) {
		for (int i = 0; i < s.length; i++)
			System.out.println("No." + i + " = " + s[i]);
	}

	public static void main(String[] args) {
		String hands[] = {
			"石頭", "剪刀", "布"
		};

		System.out.println("指令列引數");
		printStringArray(args);

		System.out.println("猜拳的出拳");
		printStringArray(hands);
	}
}
