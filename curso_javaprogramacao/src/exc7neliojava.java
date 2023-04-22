import java.util.Scanner;
public class exc7neliojava {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("digite o primeiro valor(X):");
		double valor1 = s.nextDouble();
		System.out.println("digite o segundo valor(Y):");
		double valor2 = s.nextDouble();
		if(valor1==0 && valor2==0) {
			System.out.println("o ponto está na ORIGEM");	
		}
		if(valor1>0 && valor2>0) {
			System.out.println("o ponto está no Q1");	
		}
		if(valor1<0 && valor2>0) {
			System.out.println("o ponto está no Q2");	
		}
		if(valor1<0 && valor2<0) {
			System.out.println("o ponto está no Q3");	
		}
		if(valor1>0 && valor2<0) {
			System.out.println("o ponto está no Q4");	
		}
		if (valor1!=0 && valor2==0) {
			System.out.println("o ponto está no eixo X");
		}
		if (valor1==0 && valor2!=0) {
			System.out.println("o ponto está no eixo Y");
		}

	}
}
