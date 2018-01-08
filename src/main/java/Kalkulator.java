import java.math.BigDecimal;
import java.util.Scanner;

public class Kalkulator {
	private static Scanner scanner = new Scanner(System.in);
	private static long QUANTITY;
	private static BigDecimal PRICE;
	private static BigDecimal TOTAL_VALUE;
	private static BigDecimal TAX;
	public static void main(String[] args) {
		scanQuantity();
		scannPrice();
		TOTAL_VALUE = calculateValue(QUANTITY, PRICE);
		System.out.println(String.format("Calkowita wartosc wynosci %s", TOTAL_VALUE.toString()));
		scannTax();

	}

	public static void scanQuantity(){
		System.out.println("Wprowadz ilosc sztuk");
		QUANTITY = scanner.nextLong();
	}

	public static void scannPrice(){
		System.out.println("Wprowadz cene za sztuke");
		PRICE = scanner.nextBigDecimal();
	}

	public static BigDecimal calculateValue(long quantity, BigDecimal PRICE) {
		return BigDecimal.valueOf(quantity).multiply(PRICE);
	}

	public static void scannTax(){
		System.out.println("Wprowadz wartosc podatku");
		TAX = scanner.nextBigDecimal();
	}

	public static long getQUANTITY() {
		return QUANTITY;
	}

	public static BigDecimal getPRICE() {
		return PRICE;
	}
}
