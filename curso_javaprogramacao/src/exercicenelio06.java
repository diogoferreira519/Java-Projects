import java.util.Scanner;
public class exercicenelio06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe um número logo abaixo:");
		int x = s.nextInt();
		if(x >0 && x <=25) {
			System.out.println("este valor se encontra no intervalo de 0 a 25");
		}
		else if (x>25 && x<=50) {
			System.out.println("este valor se encontra no intervalo de 25 a 50");
		}
		else if (x>50 && x<=75) {
			System.out.println("este valor se encontra no intervalo de 50 a 75");
		}
		else if (x>75 && x<=100) {
			System.out.println("este valor se encontra no intervalo de 75 a 100");
		}
		else {
			System.out.println("este valor esta fora do valor pre-determinado");
			}
		}

	}


