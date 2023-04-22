package EXERCICIOS_POO;
import java.util.Scanner;
public class exemplosslides {
	public static double leia(String mensagem) {
		Scanner s =new Scanner(System.in);
		System.out.println(mensagem);
		return s.nextDouble();
		
	}
	public static void main(String[] args) {
		double altura = leia("Escreva sua altura em metros");
		double massa = leia("Agora digite sua massa em kg");
		double imc = massa/Math.pow(altura,2);
		System.out.println(imc);
		
		
	}

}
