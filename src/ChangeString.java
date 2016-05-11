// 變更字串的參照目標

class ChangeString {

	public static void main(String[] args) {
		String s1 = "ABC";		// 參照"ABC"
		String s2 = "XYZ";		// 參照"XYZ"

		s1 = "XYZ";			// 參照"XYZ"
		System.out.println("字串s1 = " + s1);
		System.out.println("字串s2 = " + s2);
		System.out.println("s1與s2" +
			((s1 == s2) ? "參照" : "不是參照。") + "同一個字串常值");
	}
}
