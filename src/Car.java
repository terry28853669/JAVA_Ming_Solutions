// �T�����O �i�Ģ����j

class Car {
	private String name;		// �W��
	private int width;		// �e��
	private int height;		// ����
	private int length;		// ����
	private double x;			// �{�b��m����y��
	private double y;			// �{�b��m����y��
	private double fuel;		// �Ѿl�U��

	//--- �غc�l ---//
	Car(String name, int width, int height, int length, double fuel) {
		this.name = name;		this.width = width;		this.height = height;
		this.length = length;	this.fuel = fuel;
		x = y = 0.0;
	}

	double getX() { return x; }			// ���o�{�b��m����y��
	double getY() { return y; }			// ���o�{�b��m����y��
	double getFuel() { return fuel; }	// ���o�Ѿl�U��

	//--- ��ܳW�� ---//
	void putSpec() {
		System.out.println("�W�١G" + name);
		System.out.println("���e�G" + width  + "mm");
		System.out.println("�����G" + height + "mm");
		System.out.println("�����G" + length + "mm");
	}

	//--- �VX��V����dx�B�VY��V����dy ---//
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);	// ���ʶZ��

		if (dist > fuel)
			return false;				// �L�k���ʡK �U�Ƥ���
		else {
			fuel -= dist;				// �̲��ʶZ�������u�Ӵ�ֿU��
			x += dx;
			y += dy;
			return true;				// ���ʧ���
		}
	}
}
