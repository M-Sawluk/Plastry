import java.math.BigDecimal;
import java.util.Scanner;

public class Kalkulator {
	private static Scanner scanner = new Scanner(System.in);
	private static long QUANTITY;
	private static BigDecimal PRICE;
	public static void main(String[] args) {
		scanQuantity();
		scannPrice();


	}

	public static void scanQuantity(){
		System.out.println("Wprowadz ilosc sztuk");
		QUANTITY = scanner.nextLong();
	}

	public static void scannPrice(){
		System.out.println("Wprowadz cene za sztuke");
		PRICE = scanner.nextBigDecimal();
	}

	public static long getQUANTITY() {
		return QUANTITY;
	}

	public static BigDecimal getPRICE() {
		return PRICE;
	}
}
