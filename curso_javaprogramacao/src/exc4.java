import java.util.Scanner;
public class exc4 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		//Faça um programa para montar a tabela de
		//multiplicação de números de 1 a 10 (ex.: 1 x 1 = 1,
		//1 x 2 = 2, etc.)
		int tabuada;
		for (int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				tabuada = i*j;
				System.out.println(i + "x" + j + "= " + tabuada );
			}
		}

	}

}
