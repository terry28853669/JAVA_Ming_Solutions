// Åª¤J¤G­Ó¾ã¼Æ¡A¨Ã¥BÅã¥Ü±N¨ä¥[´î­¼°£«áªºµ²ªG
import java.util.*;

class ArithInt {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("±Nx»Py¶i¦æ¥[´î­¼°£­pºâ¡C");
		System.out.print("xªº­È¡G"); // ¿é¤Jxªº­È
		int x = stdIn.nextInt(); // ±N¾ã¼Æ«ü©wµ¹x
		System.out.print("yªº­È¡G"); // ¿é¤Jyªº­È
		int y = stdIn.nextInt(); // ±N¾ã¼Æ«ü©wµ¹y
		System.out.println("x + y = " + (x + y)); // Åã¥Üx + yªº­È
		System.out.println("x - y = " + (x - y)); // Åã¥Üx - yªº­ÈŽ¦
		System.out.println("x * y = " + (x * y)); // Åã¥Üx * yªº­È
		System.out.println("x / y = " + (x / y)); // Åã¥Üx / yªº­È¡]°Ó¡^
		System.out.println("x % y = " + (x % y)); // Åã¥Üx % yªº­È¡]¾l¼Æ¡^
	}
}
