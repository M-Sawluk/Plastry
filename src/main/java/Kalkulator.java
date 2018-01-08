import java.math.BigDecimal;
import java.util.Scanner;

public class Kalkulator {
	private static Scanner scanner = new Scanner(System.in);
	private static long QUANTITY;
	private static BigDecimal PRICE;
	private static BigDecimal TOTAL_VALUE;
	private static BigDecimal TAX;
	public static final BigDecimal ONE_HUNDRET = new BigDecimal(100);
	public static void main(String[] args) {
		scanQuantity();
		scannPrice();
		scannTax();
		TOTAL_VALUE = calculateValue(QUANTITY, PRICE, TAX);
		System.out.println(String.format("Calkowita wartosc wynosci %s", TOTAL_VALUE.toString()));

	}

	public static void scanQuantity(){
		System.out.println("Wprowadz ilosc sztuk");
		QUANTITY = scanner.nextLong();
	}

	public static void scannPrice(){
		System.out.println("Wprowadz cene za sztuke");
		PRICE = scanner.nextBigDecimal();
	}

	public static BigDecimal calculateValue(long quantity, BigDecimal PRICE, BigDecimal tax) {
		BigDecimal value = BigDecimal.valueOf(quantity).multiply(PRICE);
		return value.multiply(tax).divide(ONE_HUNDRET).add(value);
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
