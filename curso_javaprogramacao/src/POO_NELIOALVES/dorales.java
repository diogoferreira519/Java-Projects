package POO_NELIOALVES;

import java.util.Scanner;

public class dorales {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("qual a cotação em dolar?");
		double cota = s.nextDouble();
		CurrencyConverter c1 = new CurrencyConverter();
		System.out.println(c1.CotDolar(cota) + "R$");
			
	}
	}


