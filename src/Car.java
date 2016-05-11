// 汽車類別 【第１版】

class Car {
	private String name;		// 名稱
	private int width;		// 寬度
	private int height;		// 高度
	private int length;		// 長度
	private double x;			// 現在位置的Ｘ座標
	private double y;			// 現在位置的Ｙ座標
	private double fuel;		// 剩餘燃料

	//--- 建構子 ---//
	Car(String name, int width, int height, int length, double fuel) {
		this.name = name;		this.width = width;		this.height = height;
		this.length = length;	this.fuel = fuel;
		x = y = 0.0;
	}

	double getX() { return x; }			// 取得現在位置的Ｘ座標
	double getY() { return y; }			// 取得現在位置的Ｙ座標
	double getFuel() { return fuel; }	// 取得剩餘燃料

	//--- 表示規格 ---//
	void putSpec() {
		System.out.println("名稱：" + name);
		System.out.println("車寬：" + width  + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
	}

	//--- 向X方向移動dx、向Y方向移動dy ---//
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);	// 移動距離

		if (dist > fuel)
			return false;				// 無法移動… 燃料不足
		else {
			fuel -= dist;				// 依移動距離的長短而減少燃料
			x += dx;
			y += dy;
			return true;				// 移動完畢
		}
	}
}
