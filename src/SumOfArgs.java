// �X�p�������O�C�޼ƪ��Ҧ��ƭȨ���ܨ��`�M

class SumOfArgs {

	public static void main(String[] args) {
		double sum = 0.0;
		for (int i = 0; i < args.length; i++)
			sum += Double.parseDouble(args[i]);
		System.out.println("�X�p��" + sum + "�C");
	}
}
