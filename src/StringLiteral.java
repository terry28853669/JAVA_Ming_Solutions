// 比較內容相同的字串的參照目標

class StringLiteral {

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "ABC";

		if (s1 == s2)	// 比較參照目標
			System.out.println("s1與s2參照相同的字串。");
		else
			System.out.println("s1與s2參照不同的字串。");
	}
}
