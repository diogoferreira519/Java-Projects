package POO_NELIOALVES;

import java.util.Scanner;

public class EXCNELIOHIGHER {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int valor = mostraMaior(a,b,c);
		
		imprimiTela(valor);
	
	}
	public static int mostraMaior(int x, int y, int z) {
		int maior;
		if (x>y && x>z) {
			maior = x;
		}
		else if (y>z) {
			maior = y;
		}
		else {
			maior = z;
		}
		return maior;
	}
		public static void imprimiTela (int valorzao) {
		System.out.println("o valorzao é: " + valorzao);
	}

}