import java.util.Scanner;

public class Kalkulator {
	private static Scanner scanner = new Scanner(System.in);
	private static long ILOSC_SZTUK;
	public static void main(String[] args) {
		scanNumber();



	}

	public static void scanNumber(){
		System.out.println("Wprowadz ilosc sztuk");
		ILOSC_SZTUK = scanner.nextLong();
	}
}
