package Calculadora;

import java.util.Scanner;

public class calculadora {
	Scanner s = new Scanner(System.in);
	public double num1;
	public double num2;
	public double result;

	public double somar(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		return num1 + num2;
	}

	public double subtrair(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		return num1 - num2;
	}

	public double multiplicar(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		return num1 * num2;
	}

	public double dividir(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		if ((num1 % num2) > 0) {
			System.out.println("Erro, divisão não dá número inteiro");
		} else
			result = num1 / num2;
		return result;
	}

	public void limpaMemoria() {
		this.num1 = 0;
		this.num2 = 0;
		System.out.println("numero1:" + num1 + "Numero2:" + num2);
	}

	public void mostraNum() {
		System.out.println("Digite o primeiro número para a operação");
		num1 = s.nextDouble();
		System.out.println("Digite o segundo número para a operação");
		num2 = s.nextDouble();
	}

	public void terminaPrograma() {
		System.out.println("OBRIGADO POR USAR MINHA CALCULADORA");
	}

	public void mostraStatus() {
		Scanner s = new Scanner(System.in);
		System.out.println("Escolha uma das opções da calculadora");
		System.out.println("(1) Somar");
		System.out.println("(2) Subtrair");
		System.out.println("(3) Multiplicar");
		System.out.println("(4) Dividir");
		System.out.println("(5) Limpar memória");
		System.out.println("(6) Sair do programa");
		int n = s.nextInt();
		if (n == 1) {
			mostraNum();
			somar(num1, num2);
		}
		if (n == 2) {
			mostraNum();
			System.out.println(subtrair(num1, num2));
		}
		if (n == 3) {
			mostraNum();
			System.out.println(multiplicar(num1, num2));
		}
		if (n == 4) {
			mostraNum();
			System.out.println(dividir(num1, num2));
		}
		if (n == 5) {
			limpaMemoria();
		} else {
			terminaPrograma();
		}
	}
}
