// 汽車類別【第１版】的使用範例（其一）

class CarTester1 {

	public static void main(String[] args) {
		Car vitz  = new Car("vitz", 1660, 1500, 3640, 40.0);
		Car march = new Car("March", 1660, 1525, 3695, 41.0);
		vitz.putSpec();				// 顯示vitz的規格
		System.out.println("-----------");
		march.putSpec();				// 顯示march的規格
	}
}
