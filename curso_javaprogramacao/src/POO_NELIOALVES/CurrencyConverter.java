package POO_NELIOALVES;
import java.util.Scanner;
public class CurrencyConverter {
	public static double cotacao;
	public static double calc;
	
	public static double CotDolar(double cota) {
		Scanner s =new Scanner(System.in);
		System.out.println("quantos dolares queres comprar?");
		calc = s.nextDouble();
		calc = calc * cota;
		calc = calc *1.06;
		return calc;
	
	}
}
