// 合計給予指令列引數的所有數值並顯示其總和

class SumOfArgs {

	public static void main(String[] args) {
		double sum = 0.0;
		for (int i = 0; i < args.length; i++)
			sum += Double.parseDouble(args[i]);
		System.out.println("合計為" + sum + "。");
	}
}
