import java.util.Scanner;
public class exc03 {

	public static void main(String[] args) {
		// TFaça um programa que calcule o IMC de uma pessoa (IMC =
		//massa em kg / altura em metros2) e informe a sua
	//classificação segundo a tabela a seguir, obtida na Wikipédia
	Scanner s = new Scanner(System.in);
	System.out.println("informe sua massa em kg");
	double kg = s.nextDouble();
	System.out.println("informe sua altura em metros");
	double alt = s.nextDouble();
	double imc = kg/(alt*alt);
	
	if (imc <= 18.5) {
		System.out.println("abaixo do peso");
	}
	if (imc >18.5 && imc <24.9) {
		System.out.println("Saudável");
	}
	if (imc >=25 && imc <=29.9) {
		System.out.println("peso em excesso");
	}
	if (imc >=30 && imc <=34.9) {
		System.out.println("Obesidade grau I");
	}
	if (imc >=35 && imc <=39.9) {
		System.out.println("Obesidade grau II");
	}
	else if (imc>=40) {
		System.out.println("Obesidade grau III");
	}

}
}
